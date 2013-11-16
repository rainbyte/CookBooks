package com.t3g.cookbooks.gui.admin.catalogue;
import java.awt.Dimension;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 *
 * @author Fabrizio
 */
public class CatalogueBooks extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public CatalogueBooks() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        lblPrincipalpicture = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblForgotPass = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtHome = new javax.swing.JLabel();
        txtOrder = new javax.swing.JLabel();
        txtHelp = new javax.swing.JLabel();
        txtContac = new javax.swing.JLabel();
        txtRegister = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CookBook Software");
        setBackground(new java.awt.Color(153, 153, 255));

        jInternalFrame1.setBackground(new java.awt.Color(153, 153, 255));
        jInternalFrame1.setForeground(new java.awt.Color(153, 153, 255));
        jInternalFrame1.setTitle("Registro");
        jInternalFrame1.setVisible(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        lblPrincipalpicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cookbookLogoReducido.png"))); // NOI18N
        lblPrincipalpicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblPrincipalpictureMousePressed(evt);
            }
        });

        txtUser.setText("Usuario");

        btnLogin.setText("Ingresar");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLoginMousePressed(evt);
            }
        });

        lblForgotPass.setBackground(new java.awt.Color(51, 51, 255));
        lblForgotPass.setForeground(new java.awt.Color(51, 51, 255));
        lblForgotPass.setText("Olvide mi contraseña");
        lblForgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotPassMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblForgotPassMousePressed(evt);
            }
        });

        txtPassword.setText("Contraseña");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtSearch.setText("Buscar libro, autor, ISBN...");
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setText("Buscar");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSearchMousePressed(evt);
            }
        });

        txtHome.setText("Principal");

        txtOrder.setForeground(new java.awt.Color(51, 51, 255));
        txtOrder.setText("Pedidos");
        txtOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtOrderMousePressed(evt);
            }
        });

        txtHelp.setForeground(new java.awt.Color(51, 51, 255));
        txtHelp.setText("Ayuda");
        txtHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtHelpMousePressed(evt);
            }
        });

        txtContac.setForeground(new java.awt.Color(51, 51, 255));
        txtContac.setText("Contacto");
        txtContac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContacMousePressed(evt);
            }
        });

        txtRegister.setForeground(new java.awt.Color(51, 51, 255));
        txtRegister.setText("Registrarse");
        txtRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtRegisterMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHelp)
                        .addGap(10, 10, 10)
                        .addComponent(txtContac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRegister))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPrincipalpicture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblForgotPass)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLogin))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(lblForgotPass))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblPrincipalpicture, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(txtHome)
                    .addComponent(txtOrder)
                    .addComponent(txtHelp)
                    .addComponent(txtContac)
                    .addComponent(txtRegister))
                .addGap(31, 31, 31))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setAutoscrolls(true);
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(674, 500));
        
        JScrollPane spanelBooks = new JScrollPane();
        
        JButton btnEdit = new JButton("Editar");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        
        JButton btnAddBook = new JButton("Subir un libro");
        btnAddBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddBookMouseClicked(evt);
            }
        });
        
        JButton btnDelete = new JButton("Eliminar");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        
        btnBack = new JButton("VOLVER ATRAS");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        btnBack.setBackground(Color.RED);
        
        JLabel lblT3G = new JLabel("DESARROLLADO POR T3G");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        			.addGap(19)
        			.addComponent(btnAddBook)
        			.addPreferredGap(ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
        			.addComponent(btnEdit)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnDelete)
        			.addGap(22))
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(spanelBooks, GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        			.addContainerGap())
        		.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        			.addContainerGap(295, Short.MAX_VALUE)
        			.addComponent(btnBack)
        			.addGap(136)
        			.addComponent(lblT3G)
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnAddBook)
        				.addComponent(btnEdit)
        				.addComponent(btnDelete))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(spanelBooks, GroupLayout.PREFERRED_SIZE, 453, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblT3G)
        				.addComponent(btnBack))
        			.addGap(4))
        );
        
        tableBooks = new JTable();
        spanelBooks.setViewportView(tableBooks);
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnAddBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO Al presionarse debe abrise la ventana de "alta de libro"
    }//GEN-LAST:event_btnLoginMouseClicked
    
    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO Al presionarse debe abrise la ventana de "Editar libro" para modificar los datos del libro seleccionado
    }//GEN-LAST:event_btnLoginMouseClicked
    
    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO Al presionarse debe eliminar el libro seleccionado en la tabla
    }//GEN-LAST:event_btnLoginMouseClicked
    
    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO Al presionase debe volver a la pagina anterior
    }//GEN-LAST:event_btnLoginMouseClicked

    private void lblForgotPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPassMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblForgotPassMouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginMouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMousePressed
        // TODO add your handling code here:
        // TODO Evento para ingresar a la página, y loguearse. Abre pantalla home pero ya logueado.
    }//GEN-LAST:event_btnLoginMousePressed

    private void lblForgotPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPassMousePressed
        // TODO add your handling code here:
        // TODO Evento para recuperar contraseña, abre pantalla de "olvide contraseña"
    }//GEN-LAST:event_lblForgotPassMousePressed

    private void btnSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMousePressed
        // TODO add your handling code here:
        // TODO Evento para realizar una búsqueda, en txtSearch esta lo que buscamos
    }//GEN-LAST:event_btnSearchMousePressed

    private void lblPrincipalpictureMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrincipalpictureMousePressed
        // TODO add your handling code here:
       // TODO Evento para ir a la interfaz principal. Al hacer click en la imágen "cookbook" voy al inicio.
    }//GEN-LAST:event_lblPrincipalpictureMousePressed

    private void txtRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegisterMousePressed
        // TODO add your handling code here:
        // TODO Evento para ir a la interfaz de registro
    }//GEN-LAST:event_txtRegisterMousePressed

    private void txtContacMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContacMousePressed
        // TODO add your handling code here:
        // TODO Evento para ir a la interfaz de contacto
    }//GEN-LAST:event_txtContacMousePressed

    private void txtHelpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHelpMousePressed
        // TODO add your handling code here:
        // TODO Evento para ir a la interfaz de ayuda
    }//GEN-LAST:event_txtHelpMousePressed

    private void txtOrderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOrderMousePressed
        // TODO add your handling code here:
        // TODO Evento para ir a la interfaz de pedidos
    }//GEN-LAST:event_txtOrderMousePressed

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
            java.util.logging.Logger.getLogger(CatalogueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>




        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogueBooks().setVisible(true);
            }
        });
    }
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSearch;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblForgotPass;
    private javax.swing.JLabel lblPrincipalpicture;
    private javax.swing.JLabel txtContac;
    private javax.swing.JLabel txtHelp;
    private javax.swing.JLabel txtHome;
    private javax.swing.JLabel txtOrder;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JLabel txtRegister;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUser;
    private JTable tableBooks;
    private JButton btnBack;
}

