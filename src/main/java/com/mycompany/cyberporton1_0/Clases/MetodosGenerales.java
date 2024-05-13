
package com.mycompany.cyberporton1_0.Clases;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class MetodosGenerales {    
    
    public void MostrarProductos(JTable paramTablaProductos, MySqlConnection conexion){
 
        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel>OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaProductos.setRowSorter(OrdenarTabla);
        String consultaSQL ="select * from productos;";
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Descripcion");
        paramTablaProductos.setModel(modelo);
     
        String[] datos = new String[5];
        Statement st;
        try{
            st = conexion.getConnection().createStatement();
            ResultSet rs = st.executeQuery(consultaSQL );
            while (rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            paramTablaProductos.setModel(modelo);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, erro: "+ e.toString());
        }
    }
    
    public void Seleccionar(JTable paramTablaProductos, JTextField paramId, JTextField paramNombres, JTextField paramPrecio, JTextField paramStock, JTextField paramDescripcion){
        try{
            int fila = paramTablaProductos.getSelectedRow();
            if (fila>=0){
                paramId.setText((paramTablaProductos.getValueAt(fila, 0).toString()));
                paramNombres.setText((paramTablaProductos.getValueAt(fila, 1).toString()));
                paramPrecio.setText((paramTablaProductos.getValueAt(fila, 2).toString()));
                paramStock.setText((paramTablaProductos.getValueAt(fila, 3).toString()));
                paramDescripcion.setText((paramTablaProductos.getValueAt(fila, 4).toString()));
            }
            else{
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de selección, error: "+ e.toString());
        }
    }
}
    
