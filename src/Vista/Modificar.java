/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author trivi
 */
import controlador.*;
import javax.swing.JOptionPane;
import Modelo.*;
import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Modificar extends javax.swing.JFrame {

    /**
     * Creates new form Modificar
     */
    public Modificar() {
        
        initComponents();
        jTextCodigo.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnModificar = new javax.swing.JButton();
        btonLimpiar = new javax.swing.JButton();
        jTextPrecio = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        optTeclado = new javax.swing.JRadioButton();
        optMouse = new javax.swing.JRadioButton();
        jTextCodigo = new javax.swing.JTextField();
        jTextMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btonLimpiar.setText("Limpiar");
        btonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonLimpiarActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Precio:");

        jLabel1.setText("Codigo:");

        jLabel2.setText("Marca:");

        jLabel3.setText("Tipo:");

        buttonGroup1.add(optTeclado);
        optTeclado.setText("Teclado");
        optTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optTecladoActionPerformed(evt);
            }
        });

        buttonGroup1.add(optMouse);
        optMouse.setText("Mouse");
        optMouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optMouseActionPerformed(evt);
            }
        });

        jTextCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodigoActionPerformed(evt);
            }
        });

        jTextMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMarcaActionPerformed(evt);
            }
        });

        jLabel5.setText("MODIFICAR DATOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(optTeclado)
                        .addGap(61, 61, 61)
                        .addComponent(optMouse))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btonLimpiar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(btnModificar))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btonLimpiar)
                    .addComponent(jLabel4))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(optTeclado)
                        .addComponent(jLabel3)
                        .addComponent(optMouse)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:

        String Marca,codigo;
        int Precio;
        char Tipo;
        Validacion val=new Validacion();
        codigo=this.jTextCodigo.getText();
        if(!val.validaVacio(codigo))
        {
            JOptionPane.showMessageDialog(this,"Debes Ingresar Codigo","Validacion",JOptionPane.WARNING_MESSAGE);
            this.jTextMarca.requestFocus();
            return;
        }
        Marca=this.jTextMarca.getText();
        if(!val.validaVacio(Marca)){

            JOptionPane.showMessageDialog(this,"Debes Ingresar Marca","Validacion",JOptionPane.WARNING_MESSAGE);
            this.jTextMarca.requestFocus();
            return;
        }
        String strValida=this.jTextPrecio.getText();
        if (val.validaInt(strValida)){
            Precio=Integer.parseInt(strValida);
        }else{
            JOptionPane.showMessageDialog(this,"Precio es Numero","Validacion",JOptionPane.WARNING_MESSAGE);
            this.jTextPrecio.requestFocus();
            return;
        }
        if(optTeclado.isSelected()){
            JOptionPane.showMessageDialog(null,"Haz Guardado Teclado");
        }else if(optMouse.isSelected())
        JOptionPane.showMessageDialog(null,"Haz Guardado Mouse");
        else{
            JOptionPane.showMessageDialog(this,"Debes Seleccionar Tipo","Validacion",JOptionPane.WARNING_MESSAGE);
            this.optTeclado.requestFocus();
            return;
        }
        Teclado teclado = new Teclado(codigo, Marca, Precio);
        Metodos update= new Metodos();
        if (optTeclado.isSelected()) {
            update.actualizarTeclado(teclado);
        }
        Mouses mouse = new Mouses(codigo, Marca, Precio);
        if (optMouse.isSelected()) {
            update.actualizarMouse(mouse);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonLimpiarActionPerformed
        // TODO add your handling code here:
        jTextCodigo.setText("");
        jTextMarca.setText("");
        jTextPrecio.setText("");
        buttonGroup1.clearSelection();

    }//GEN-LAST:event_btonLimpiarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void optTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optTecladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optTecladoActionPerformed

    private void optMouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optMouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optMouseActionPerformed

    private void jTextCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCodigoActionPerformed

    private void jTextMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMarcaActionPerformed

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
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btonLimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextMarca;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JRadioButton optMouse;
    private javax.swing.JRadioButton optTeclado;
    // End of variables declaration//GEN-END:variables

     public void setDatoTeclado(String guardarDato) {
         

            try {
                String query = "SELECT cod_tec, marca_tec, precio_tec FROM teclado WHERE cod_tec = "+guardarDato;
                Conexion cc = new Conexion();
                Connection cn = cc.conectar();
                Teclado teclado = new Teclado();
                PreparedStatement ps = cn.prepareStatement(query);
                
                ResultSet rs = ps.executeQuery();
                if(rs.next())
                {
                teclado.setCodTeclado(rs.getString(1));
                teclado.setMarca(rs.getString(2));
                teclado.setPrecio(rs.getInt(3));
                }
                
             
                ps.close();
                cn.close();
                rs.close();
                jTextCodigo.setText(teclado.getCodTeclado());
                jTextMarca.setText(teclado.getMarca());
                jTextPrecio.setText(String.valueOf(teclado.getPrecio()));
           } catch (Exception e) {
               
               System.out.println("dato");
               System.out.println(e.getMessage());
               
           }
                 
         }
     
     public void setDatoMouse(String guardarDato) {
         

            try {
                String query = "SELECT cod_mou, marca_mou, precio_mou FROM mouse WHERE cod_mou = "+guardarDato;
                Conexion cc = new Conexion();
                Connection cn = cc.conectar();

                PreparedStatement ps = cn.prepareStatement(query);
       
                ResultSet rs = ps.executeQuery();
                Mouses mouse = new Mouses();
                if(rs.next())
                {
                mouse.setCodMouse(rs.getString(1));
                mouse.setMarca(rs.getString(2));
                mouse.setPrecio(rs.getInt(3));
                }
                
                ps.close();
                cn.close();
                rs.close();
                
                jTextCodigo.setText(mouse.getCodMouse());
                jTextMarca.setText(mouse.getMarca());
                jTextPrecio.setText(String.valueOf(mouse.getPrecio()));
                
           } catch (Exception e) {
               
               System.out.println("dato");
               System.out.println(e.getMessage());
               
           }
                 
         }
       
}
