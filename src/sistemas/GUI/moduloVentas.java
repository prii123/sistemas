/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemas.GUI;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sistemas.controllers.ContorllerModuloVENTAS;
import sistemas.models.VentasFacturacion;

/**
 *
 * @author USUARIO
 */
public class moduloVentas extends javax.swing.JFrame {

    DefaultTableModel modelo;
    DefaultTableModel modeloRecibos;
    int xMouse, yMouse;

    public moduloVentas() {
        initComponents();

        String[] titulos = {"ID", "Nit", "Razon social", "Documento", "FE", "Valor Neto", "Valor IVA"};
        modelo = new DefaultTableModel(null, titulos);
        JTVentas.setModel(modelo);
        this.mostrarDatos();

        String[] titulosRecibos = {"ID", "Nit", "Razon social", "Documento", "Valor Neto"};
        modeloRecibos = new DefaultTableModel(null, titulosRecibos);
        JTRecibos.setModel(modeloRecibos);
        this.mostrarDatosRecibos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTVentas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTRecibos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        txtid = new javax.swing.JTextField();
        txtnit = new javax.swing.JTextField();
        txtrazonsocial = new javax.swing.JTextField();
        txtdocumento = new javax.swing.JTextField();
        txtneto = new javax.swing.JTextField();
        txtimpuesto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdocumentoelectronico = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerPanelMouseDragged(evt);
            }
        });
        headerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerPanelMousePressed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 0, 0));
        btnCerrar.setText("X");
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(btnCerrar)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AUDITORIA AL MODULO DE VENTAS");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        JTVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JTVentas.setGridColor(new java.awt.Color(255, 255, 255));
        JTVentas.setOpaque(false);
        JTVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTVentasMouseClicked(evt);
            }
        });
        JTVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTVentasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTVentasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(JTVentas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VENTAS", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        JTRecibos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JTRecibos.setGridColor(new java.awt.Color(255, 255, 255));
        JTRecibos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTRecibosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTRecibos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("RECIBOS DE CAJA", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("NOTA CREDITO", jPanel5);

        txtid.setBorder(null);
        txtid.setCaretColor(new java.awt.Color(0, 0, 255));

        txtnit.setBorder(null);
        txtnit.setCaretColor(new java.awt.Color(0, 0, 255));

        txtrazonsocial.setBorder(null);
        txtrazonsocial.setCaretColor(new java.awt.Color(0, 0, 255));

        txtdocumento.setBorder(null);

        txtneto.setBorder(null);

        txtimpuesto.setBorder(null);

        jLabel3.setText("Numero Documento :");

        jLabel4.setText("Numero Doc Electronico :");

        txtdocumentoelectronico.setText("NUMERO DOCUMENTO");
        txtdocumentoelectronico.setBorder(null);

        jLabel5.setText("Valor Neto :");

        jLabel6.setText("Valor Impuesto :");

        jLabel7.setText("ID:");

        jLabel8.setText("Nit:");

        jLabel9.setText("Razon Social:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtrazonsocial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addComponent(txtnit, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtdocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                    .addComponent(txtneto)
                                    .addComponent(txtimpuesto))
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdocumentoelectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrazonsocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtdocumentoelectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtneto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtimpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMousePressed
        dispose();
    }//GEN-LAST:event_btnCerrarMousePressed

    private void headerPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerPanelMousePressed

    private void headerPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerPanelMouseDragged

    private void JTVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTVentasMouseClicked

        this.limpiar();

        if (evt.getClickCount() == 1) {
            JTable receptor = (JTable) evt.getSource();
            txtid.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtnit.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            txtrazonsocial.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            txtdocumento.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            txtdocumentoelectronico.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
            txtneto.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 5).toString());
            txtimpuesto.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 6).toString());

        }
    }//GEN-LAST:event_JTVentasMouseClicked

    private void JTRecibosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTRecibosMouseClicked
        // Click tabla recibos
        txtid.setText("");
        txtnit.setText("");
        txtrazonsocial.setText("");
        txtdocumento.setText("");
        txtdocumentoelectronico.setText("");
        txtneto.setText("");
        txtimpuesto.setText("");

        if (evt.getClickCount() == 1) {
            JTable receptor = (JTable) evt.getSource();
            txtid.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtnit.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            txtrazonsocial.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            txtdocumento.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            txtneto.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());

        }
    }//GEN-LAST:event_JTRecibosMouseClicked

    private void JTVentasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTVentasKeyPressed
        try {
            if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
                /* 
                    ESTE EVENTO ES ESCUCHADO CUANDO SE OPRIMA LA LETRA SUPRIMIR, LO QUE HACE ES
                    TOMAR LAS FILAS SELECCIONADAS Y SEGUN CUANTAS HAYA SE CREA UN BUBLE FOR
                    QUE EN CADA ITERACION IRA EJECUTANDO UN QUERY QUE ELIMINA DE BASE DE DATOS SEGUN
                    EL ID DE TOMADO DE CADA FILA
                 */

                // EL VALIDADOR ES INSTANCIADO PARA QUE VALIDE EL CADA ID QUE SE PRETENDE ELIMINAR
                VentasFacturacion datos = validador();
                // ES INSTANCIADO EL CONTROLADOR QUE EJECUTA EL QUERY DE ELIMINACION
                ContorllerModuloVENTAS query = new ContorllerModuloVENTAS();
                //SE INSTANCIA EL EVENTO DE LA CLASE TABLA PARA TOMAR LOS DATOS DE ELLA         
                JTable receptorrr = (JTable) evt.getSource();

                for (int i = 0; i < receptorrr.getSelectedRows().length; i++) {
                    datos.setID(Integer.parseInt(receptorrr.getModel().getValueAt(receptorrr.getSelectedRows()[i], 0).toString()));
                    query.setID(datos.getID());
                    query.queryDeleteVentas();
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        this.limpiar();
        this.mostrarDatos();
    }//GEN-LAST:event_JTVentasKeyPressed

    private void JTVentasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTVentasKeyReleased
        // TODO add your handling code here:

        /* ESTE CONDICIONAL ES PARA DETECTAR CUANDO PRESIONEN LA TECLA ENTER
            CUANDO SE CAMBIE LOS DATOS DIRECTAMENTE EN LA TABLA AL PRESIONAR ENTER LO QUE SUCEDE
            ES QUE LOS DATOS SE COLOCARAN EN LOS INPUTS CORRESPONDIENTES Y ADICIONAL
            SE ACTUALIZARA LOS DATOS EN LA BASE DE DATOS SQLITE
            
         */
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                VentasFacturacion datos = validador();
                JTable receptor = (JTable) evt.getSource();

                txtid.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
                datos.setID(Integer.parseInt(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString()));
                
                txtnit.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
                datos.setNit(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());

                txtrazonsocial.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
                datos.setRazonsocial(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());

                txtdocumento.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
                datos.setNumerodactura(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());

                txtneto.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 5).toString());
                datos.setNeto(Double.parseDouble(receptor.getModel().getValueAt(receptor.getSelectedRow(), 5).toString()));

                txtimpuesto.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 6).toString());
                datos.setIva(Double.parseDouble(receptor.getModel().getValueAt(receptor.getSelectedRow(), 6).toString()));

                txtdocumentoelectronico.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
                datos.setNumerofacturaelectronica(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
                
               
                ContorllerModuloVENTAS query = new ContorllerModuloVENTAS();

                query.setID(datos.getID());
                query.setNit(datos.getNit());
                query.setRazonsocial(datos.getRazonsocial());
                query.setNumerofactura(datos.getNumerodactura());
                query.setNumerofacturaelectronica(datos.getNumerofacturaelectronica());
                query.setNeto(datos.getNeto());
                query.setIva(datos.getIva());
//                 query.setIDEMPRESA(datos.getIDEMPRESA());
                
//                System.out.println("datos  = " + datos );
//                System.out.println(query);
                query.queryUpdatetVentas();

            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_JTVentasKeyReleased

    public VentasFacturacion validador() {

        int ID = (txtid.getText().isEmpty() ? 0 : Integer.parseInt(txtid.getText()));
        VentasFacturacion oModuloVentaVenta = new VentasFacturacion(
                ID,
                txtnit.getText(),
                txtrazonsocial.getText(),
                "",
                "",
                txtdocumento.getText(),
                txtdocumentoelectronico.getText(),
                new Date(),
                Double.parseDouble(txtneto.getText()),
                Double.parseDouble(txtimpuesto.getText())
        );

        return oModuloVentaVenta;
    }

    public void limpiar() {
        txtid.setText("");
        txtnit.setText("");
        txtrazonsocial.setText("");
        txtdocumento.setText("");
        txtdocumentoelectronico.setText("");
        txtneto.setText("");
        txtimpuesto.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(moduloVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(moduloVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(moduloVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(moduloVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new moduloVentas().setVisible(true);
            }
        });
    }

    public void mostrarDatos() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        try {
            //   desde el controlador hace el query y envia los datos a la interfaz
            ContorllerModuloVENTAS data = new ContorllerModuloVENTAS();
            ResultSet datos = data.queryGetData();

            while (datos.next()) {

                Object[] oUsuario = {datos.getString("ID"),
                    datos.getString("nit"),
                    datos.getString("razonsocial"),
                    datos.getString("numerofactura"),
                    datos.getString("numerofacturaelectronica"),
                    datos.getString("neto"),
                    datos.getString("iva")
                };
                modelo.addRow(oUsuario);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void mostrarDatosRecibos() {
        while (modeloRecibos.getRowCount() > 0) {
            modeloRecibos.removeRow(0);
        }
        try {
            //   desde el controlador hace el query y envia los datos a la interfaz
            ContorllerModuloVENTAS data = new ContorllerModuloVENTAS();
            ResultSet datos = data.queryGetRecibos();

            while (datos.next()) {

                Object[] oUsuario = {datos.getString("ID"),
                    datos.getString("nit"),
                    datos.getString("razonsocial"),
                    datos.getString("numerorecibo"),
                    datos.getString("neto")
                };
                modeloRecibos.addRow(oUsuario);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTRecibos;
    private javax.swing.JTable JTVentas;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtdocumentoelectronico;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtimpuesto;
    private javax.swing.JTextField txtneto;
    private javax.swing.JTextField txtnit;
    private javax.swing.JTextField txtrazonsocial;
    // End of variables declaration//GEN-END:variables
}