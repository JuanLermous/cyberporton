package com.mycompany.cyberporton1_0.Clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class MetodosGenerales {

    public void MostrarProductos(JTable paramTablaProductos, MySqlConnection conexion) {

        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaProductos.setRowSorter(OrdenarTabla);
        String consultaSQL = "select * from productos;";
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Descripcion");
        paramTablaProductos.setModel(modelo);

        String[] datos = new String[5];
        Statement st;
        try {
            st = conexion.getConnection().createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            paramTablaProductos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, erro: " + e.toString());
        }
    }

    public void Seleccionar(JTable paramTablaProductos, JTextField paramId, JTextField paramNombres, JTextField paramPrecio, JTextField paramStock, JTextField paramDescripcion) {
        try {
            int fila = paramTablaProductos.getSelectedRow();
            if (fila >= 0) {
                paramId.setText((paramTablaProductos.getValueAt(fila, 0).toString()));
                paramNombres.setText((paramTablaProductos.getValueAt(fila, 1).toString()));
                paramPrecio.setText((paramTablaProductos.getValueAt(fila, 2).toString()));
                paramStock.setText((paramTablaProductos.getValueAt(fila, 3).toString()));
                paramDescripcion.setText((paramTablaProductos.getValueAt(fila, 4).toString()));
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selección, error: " + e.toString());
        }
    }

    public void MostrarHistorialVentas(JTable TablaHistorialVentas, MySqlConnection conexion) {

        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        TablaHistorialVentas.setRowSorter(OrdenarTabla);
        modelo.addColumn("ID Venta");
        modelo.addColumn("ID Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Total Venta");
        modelo.addColumn("Fecha Venta");
        TablaHistorialVentas.setModel(modelo);

        try {
            String[] datos = new String[5];
            String consultaSQL = "select * from ventadetalles;";
            Statement st = conexion.getConnection().createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            TablaHistorialVentas.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: " + e.toString());
        }
    }
    
    
    public void RealizarCompra(JTable tbCarrito, MySqlConnection conexion){
        DefaultTableModel modeloCarrito = (DefaultTableModel) tbCarrito.getModel();
        int rowCount = modeloCarrito.getRowCount();

        try {
            conexion.getConnection().setAutoCommit(false);
            for (int i = 0; i < rowCount; i++) {
                int idProducto = Integer.valueOf(modeloCarrito.getValueAt(i, 0).toString());
                int cantidad = Integer.valueOf(modeloCarrito.getValueAt(i, 2).toString());
                int precio = Integer.valueOf(modeloCarrito.getValueAt(i, 3).toString());
                LocalDate fechaActual = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String fechaFormateada = fechaActual.format(formatter);

                String queryVentaDetalles = "INSERT INTO ventadetalles (idProducto, Cantidad, PrecioVenta, FechaVenta) "
                        + "VALUES (?, ?, ?, ?)";

                try (PreparedStatement ps = conexion.getConnection().prepareStatement(queryVentaDetalles)) {
                    ps.setInt(1, idProducto);
                    ps.setInt(2, cantidad);
                    ps.setInt(3, precio);
                    ps.setString(4, fechaFormateada);
                    ps.executeUpdate();
                } catch (SQLException ex) {
                    System.err.println("Error al insertar datos: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }

            conexion.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Compra realizada con exito !");
           
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al ejecutar la transacción: " + ex.getMessage());
            try {
                conexion.getConnection().rollback();
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
            ex.printStackTrace();
        } finally {
            try {
                conexion.getConnection().setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            conexion.close();
           
        }
    }
    public void ActualizarStockProductos(JTable tbCarrito, MySqlConnection conexion, int stockActual) {
        DefaultTableModel modeloCarrito = (DefaultTableModel) tbCarrito.getModel();
        int rowCount = modeloCarrito.getRowCount();

        try {
            conexion.getConnection().setAutoCommit(false);
            for (int i = 0; i < rowCount; i++) {
                int idProducto = Integer.valueOf(modeloCarrito.getValueAt(i, 0).toString());
                int cantidad = Integer.valueOf(modeloCarrito.getValueAt(i, 2).toString());
                int nuevoStock = stockActual - cantidad;

                String queryActualizarStock = "UPDATE productos SET stock = ? WHERE idProducto = ?";

                try (PreparedStatement ps = conexion.getConnection().prepareStatement(queryActualizarStock)) {
                    ps.setInt(1, nuevoStock);
                    ps.setInt(2, idProducto);

                    // Ejecutar la actualización
                    ps.executeUpdate();
                } catch (SQLException ex) {
                    System.err.println("Error al actualizar el stock: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
            conexion.getConnection().commit();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la transacción: " + ex.getMessage());
            try {
                conexion.getConnection().rollback();
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
            ex.printStackTrace();
        } finally {
            try {
                conexion.getConnection().setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            conexion.close();
             modeloCarrito.setRowCount(0);
        }
    }
}
