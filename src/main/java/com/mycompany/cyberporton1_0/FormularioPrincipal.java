package com.mycompany.cyberporton1_0;

import com.mycompany.cyberporton1_0.Clases.MySqlConnection;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class FormularioPrincipal extends javax.swing.JFrame {
    private MySqlConnection conexion;
    
    public FormularioPrincipal() {
        this.conexion = new MySqlConnection();
        initComponents();
        setLocationRelativeTo(null);
        
        ImagenHotSale();
        ImagenCyberMonday();
        ImagenLenovoIdeaPadGaming3();
        ImagenGamerASUSTUFGamingA15();
        ImagenComputadoraGamerXtremePC();
        ImagenComputadoraGamerXtremePCAMDRyzen9();
        ImagenLaptopHPProBook();
        
        this.getContentPane().setBackground(new Color(220, 223, 241));
    }
    
    
   public void ImagenHotSale() {
        ImageIcon HotSale = new ImageIcon(getClass().getResource("/hotsale.jpg"));
        Icon HotSaleIcon = new ImageIcon(HotSale.getImage().getScaledInstance(lblHotSale.getWidth(), lblHotSale.getHeight(), Image.SCALE_SMOOTH));
        lblHotSale.setIcon(HotSaleIcon);
    }
     public void ImagenCyberMonday() {
        ImageIcon CyberMonday = new ImageIcon(getClass().getResource("/cybermonday.jpg"));
        Icon CyberMondayIcon = new ImageIcon(CyberMonday.getImage().getScaledInstance(lblCyberMonday.getWidth(), lblCyberMonday.getHeight(), Image.SCALE_SMOOTH));
        lblCyberMonday.setIcon(CyberMondayIcon);
    }
  public void ImagenLenovoIdeaPadGaming3() {
        ImageIcon LenovoIdeaPadGaming3 = new ImageIcon(getClass().getResource("/LenovoIdeaPadGaming3.jpg"));
        Icon LenovoIdeaPadGaming3Icon = new ImageIcon(LenovoIdeaPadGaming3.getImage().getScaledInstance(lblLenovoIdeaPadGaming3.getWidth(), lblLenovoIdeaPadGaming3.getHeight(), Image.SCALE_SMOOTH));
        lblLenovoIdeaPadGaming3.setIcon(LenovoIdeaPadGaming3Icon);
    }
  
  public void ImagenGamerASUSTUFGamingA15() {
        ImageIcon GamerASUSTUFGamingA15 = new ImageIcon(getClass().getResource("/GamerASUSTUFGamingA15.jpg"));
        Icon GamerASUSTUFGamingA15Icon = new ImageIcon(GamerASUSTUFGamingA15.getImage().getScaledInstance(lblGamerASUSTUFGamingA15.getWidth(), lblLenovoIdeaPadGaming3.getHeight(), Image.SCALE_SMOOTH));
        lblGamerASUSTUFGamingA15.setIcon(GamerASUSTUFGamingA15Icon);
    }   

public void ImagenComputadoraGamerXtremePC() {
        ImageIcon ComputadoraGamerXtremePC = new ImageIcon(getClass().getResource("/ComputadoraGamerXtremePC.jpg"));
        Icon ComputadoraGamerXtremePCIcon = new ImageIcon(ComputadoraGamerXtremePC.getImage().getScaledInstance(lblComputadoraGamerXtremePC.getWidth(), lblComputadoraGamerXtremePC.getHeight(), Image.SCALE_SMOOTH));
        lblComputadoraGamerXtremePC.setIcon(ComputadoraGamerXtremePCIcon);
    }   

public void ImagenComputadoraGamerXtremePCAMDRyzen9() {
        ImageIcon ComputadoraGamerXtremePCAMDRyzen9 = new ImageIcon(getClass().getResource("/ComputadoraGamerXtremePCAMDRyzen9.jpg"));
        Icon ComputadoraGamerXtremePCAMDRyzen9Icon = new ImageIcon(ComputadoraGamerXtremePCAMDRyzen9.getImage().getScaledInstance(lblComputadoraGamerXtremePCGamingAMDRyzen9.getWidth(), lblComputadoraGamerXtremePCGamingAMDRyzen9.getHeight(), Image.SCALE_SMOOTH));
        lblComputadoraGamerXtremePCGamingAMDRyzen9.setIcon(ComputadoraGamerXtremePCAMDRyzen9Icon);
    }   
 public void ImagenLaptopHPProBook() {
        ImageIcon LaptopHPProBook = new ImageIcon(getClass().getResource("/LaptopHPProBook.jpg"));
        Icon LaptopHPProBookIcon = new ImageIcon(LaptopHPProBook.getImage().getScaledInstance(lblLaptopHPProBook.getWidth(), lblLaptopHPProBook.getHeight(), Image.SCALE_SMOOTH));
        lblLaptopHPProBook.setIcon(LaptopHPProBookIcon);
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        lblHotSale = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCyberMonday = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ScrollPane = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        separador = new javax.swing.JSeparator();
        Titulo = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblLenovoIdeaPadGaming3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblGamerASUSTUFGamingA15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblComputadoraGamerXtremePC = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblComputadoraGamerXtremePCGamingAMDRyzen9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        lblLaptopHPProBook = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cyber Porton");
        setFocusable(false);
        setFocusableWindowState(false);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CyberPorton");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        lblHotSale.setToolTipText("");
        lblHotSale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHotSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHotSaleMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("HP Simplified Hans", 3, 24)); // NOI18N
        jLabel2.setText("Aprovecha nuestras ofertas de hot sale !");

        jLabel3.setFont(new java.awt.Font("HP Simplified Hans", 3, 10)); // NOI18N
        jLabel3.setText("valido del 15 al 17 de mayo de 2024");

        lblCyberMonday.setToolTipText("");
        lblCyberMonday.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCyberMonday.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblCyberMondayMouseMoved(evt);
            }
        });
        lblCyberMonday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCyberMondayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCyberMondayMouseEntered(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("HP Simplified Hans", 3, 12)); // NOI18N
        jLabel4.setText("<html> <p>Que esperas para hacerlo!  Da click  en la imagen para visitar nuestras ofertas de cyber monday</p></html>");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("HP Simplified Hans", 3, 24)); // NOI18N
        jLabel5.setText("<html> <p>Quieres comprar una computadora?</p></html>");
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHotSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblCyberMonday, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHotSale, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblCyberMonday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );

        jTabbedPane1.addTab("Inicio", jPanel3);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        separador.setBackground(new java.awt.Color(255, 255, 255));
        separador.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel2.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 10));

        Titulo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Titulo.setText("COMPUTADORAS");
        jPanel2.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, -1));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 190, -1));

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 110, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("<html>*Familia de procesador: AMD RyzenTM 5\n" +
            "*Diagonal de la pantalla: 39,6 cm (15.6)\n" +
            "*Tarjeta de Video:GeForce RTX 3050\n" +
            "*Memoria interna: 8 GB\n" +
            "*Capacidad total de almacenaje: 512 GB\n" +
            "*Sistema operativo instalado: Windows 11 Home\n" +
            "*Idioma del teclado: Español<html>");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 220, 160));

        lblLenovoIdeaPadGaming3.setToolTipText("");
        lblLenovoIdeaPadGaming3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLenovoIdeaPadGaming3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblLenovoIdeaPadGaming3MouseMoved(evt);
            }
        });
        lblLenovoIdeaPadGaming3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLenovoIdeaPadGaming3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLenovoIdeaPadGaming3MouseEntered(evt);
            }
        });
        jPanel2.add(lblLenovoIdeaPadGaming3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 100));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("<html>Laptop Gamer Lenovo IdeaPad Gaming 3 15ARH7 15.6\" Full HD, AMD Ryzen 5 6600H 3.30GHz, 8GB, 512GB SSD,\n" +
            "NVIDIA GeForce RTX 3050, Windows 11 Home 64-bit, Español, Gris Onyx<html>");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 540, -1));

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Agregar al Carrito");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 150, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Antes: $17,589.00");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 255));
        jLabel9.setText("Ahora: $16,059.00");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 160, 20));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ahorra: $1,539.00");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 140, 50));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 700, 10));
        jPanel2.add(lblGamerASUSTUFGamingA15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 120, 110));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("<html>Laptop Gamer ASUS TUF Gaming A15 FA507XV 15.6\" Full HD, AMD Ryzen 9 7940HS 4GHz, 16GB, 512GB SSD, NVIDIA GeForce RTX 4060, Windows 11 Home 64-bit, Inglés, Negro<html>");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 510, 60));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("<html>•Familia de procesador: Intel@ CoreTM i7-12xxx\n" +
            "• Memoria interna: 16 GB\n" +
            "• Capacidad total de almacenaje: 1000 GB\n" +
            "• Sistema operativo instalado: Windows 10 Prueba<html>");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, 210, 170));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 255));
        jLabel13.setText("$26,999.00");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 130, 20));

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Agregar al Carrito");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 150, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 563, 710, 30));
        jPanel2.add(lblComputadoraGamerXtremePC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 130, 120));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("<html>Computadora Gamer Xtreme PC Gaming CM-05438, Intel Core i7-12700 3.60GHz, 16GB, 1TB SSD, Wi-Fi, Windows 10 Prueba, Negro<html>");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 500, 80));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 255));
        jLabel15.setText("$13,209.00");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 690, 130, 20));

        jButton3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton3.setText("Agregar al Carrito");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 690, 150, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("<html>*Familia de procesador:\n" +
            "AMD RyzenTM 9\n" +
            "*Diagonal de la pantalla: 39,6 cm (15.6\")\n" +
            "*Tarjeta de Video:\n" +
            "GeForce RTX 4060\n" +
            "*Memoria interna: 16 GB\n" +
            "*Capacidad total de almacenaje: 512 GB\n" +
            "*Sistema operativo instalado: Windows 11 Home\n" +
            "*Idioma del teclado: Inglés<html>");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 210, 200));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 780, 710, 10));
        jPanel2.add(lblComputadoraGamerXtremePCGamingAMDRyzen9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 800, 140, 130));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("<html>Computadora Gamer Xtreme PC Gaming CM-50212, AMD Ryzen 9 7900 3.70GHz, 64GB, 2TB SSD, Wi-Fi, NVIDIA GeForce RTX 4070 Super, Windows 11 Prueba, Negro<html>");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 790, 490, 80));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("<html>*Familia de procesador:\n" +
            "AMD RyzenTM 9\n" +
            "*Tarjeta de Video:\n" +
            "GeForce RTX 4070 SUPER\n" +
            "*Memoria interna: 64 GB\n" +
            "Tipo de memoria interna:\n" +
            "DDR5\n" +
            "*Capacidad total de almacenaje: 2000 GB\n" +
            "*Sistema operativo instalado: Windows 11 Prueba<html>");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 850, 200, 210));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 255));
        jLabel19.setText("$42,559.00");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 920, 130, 20));

        jButton4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton4.setText("Agregar al Carrito");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 920, 150, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1070, 700, 10));
        jPanel2.add(lblLaptopHPProBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1086, 150, 140));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("<html>Laptop HP ProBook 440 G9 14\" Full HD, Intel Core i7-1255U 3.50GHz, 16GB, 512GB SSD, Windows 11 Pro 64-bit, Español, Plata<html>");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 1080, 480, 90));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("<html>*Familia de procesador: Intel@ Core\" i7-12xxx\n" +
            "Diagonal de la pantalla: 35,6 cm (14\")\n" +
            "*Tarjeta de Video: X\n" +
            "*Memoria interna.\n" +
            " 16 GB\n" +
            "*Capacidad total de almacenaje: 512 GB\n" +
            "*Sistema operativo instalado: Windows 11 Pro\n" +
            "*Idioma del teclado: Español<html>");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 1170, 160, 270));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setText("Antes: $19,843.00");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 1210, -1, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 153, 255));
        jLabel23.setText("Ahora: $18,349.00");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1240, 160, 20));

        jButton5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton5.setText("Agregar al Carrito");
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1240, 150, -1));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Ahorra: $1,494.00");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 1280, 140, 50));

        ScrollPane.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Productos", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Carrito", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Ventas", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCyberMondayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCyberMondayMouseClicked
        int indiceTab = 1;  
        jTabbedPane1.setSelectedIndex(indiceTab);
    }//GEN-LAST:event_lblCyberMondayMouseClicked

    private void lblCyberMondayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCyberMondayMouseEntered
       lblCyberMonday.setToolTipText("Haz clic para ir a seleccionar productos !");
    }//GEN-LAST:event_lblCyberMondayMouseEntered

    private void lblCyberMondayMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCyberMondayMouseMoved
        lblCyberMonday.setToolTipText("Haz clic para ir a seleccionar productos !");
    }//GEN-LAST:event_lblCyberMondayMouseMoved

    private void lblHotSaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHotSaleMouseClicked
         int indiceTab = 1;  
        jTabbedPane1.setSelectedIndex(indiceTab);
    }//GEN-LAST:event_lblHotSaleMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void lblLenovoIdeaPadGaming3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLenovoIdeaPadGaming3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLenovoIdeaPadGaming3MouseMoved

    private void lblLenovoIdeaPadGaming3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLenovoIdeaPadGaming3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLenovoIdeaPadGaming3MouseClicked

    private void lblLenovoIdeaPadGaming3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLenovoIdeaPadGaming3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLenovoIdeaPadGaming3MouseEntered

 
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblComputadoraGamerXtremePC;
    private javax.swing.JLabel lblComputadoraGamerXtremePCGamingAMDRyzen9;
    private javax.swing.JLabel lblCyberMonday;
    private javax.swing.JLabel lblGamerASUSTUFGamingA15;
    private javax.swing.JLabel lblHotSale;
    private javax.swing.JLabel lblLaptopHPProBook;
    private javax.swing.JLabel lblLenovoIdeaPadGaming3;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
