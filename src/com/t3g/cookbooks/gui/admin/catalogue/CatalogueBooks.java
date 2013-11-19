package com.t3g.cookbooks.gui.admin.catalogue;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import com.t3g.cookbooks.db.Database;
import com.t3g.cookbooks.db.entities.Book;
import com.t3g.cookbooks.resources.Resources;
/**
 *
 * @author T3G
 */
public class CatalogueBooks extends javax.swing.JFrame {
	private JButton btnLogin, btnSearch, btnBack;
    private JInternalFrame jInternalFrame1;
    private JPanel jPanel1, jPanel2;
    private JLabel lblForgotPass, lblPrincipalpicture, lblContac, lblHelp, lblHome, lblOrder, lblRegister;
    private JPasswordField txtPassword;
    private JTextField txtSearch, txtUser;
    private JTable tableBooks;
	private DefaultTableModel tableBooksModel;
    
	/**
     * Creates new form Register
     */
	public CatalogueBooks() {
		getContentPane().setPreferredSize(new Dimension(657, 687));
		initComponents();
		
		createTableModel();
		tableBooks.setModel(tableBooksModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jInternalFrame1.setResizable(true);
        jPanel1 = new javax.swing.JPanel();
        lblPrincipalpicture = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblForgotPass = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblHome = new javax.swing.JLabel();
        lblOrder = new javax.swing.JLabel();
        lblHelp = new javax.swing.JLabel();
        lblContac = new javax.swing.JLabel();
        lblRegister = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CookBook Software");
        setBackground(new java.awt.Color(153, 153, 255));

        jInternalFrame1.setBackground(new java.awt.Color(153, 153, 255));
        jInternalFrame1.setForeground(new java.awt.Color(153, 153, 255));
        jInternalFrame1.setTitle("Registro");
        jInternalFrame1.setVisible(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        lblPrincipalpicture.setIcon(Resources.getLogo());
        lblPrincipalpicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblPrincipalpictureMousePressed(evt);
            }
        });

        txtUser.setText("Usuario");

        btnLogin.setText("Ingresar");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLoginMousePressed(evt);
            }
        });

        lblForgotPass.setBackground(new java.awt.Color(51, 51, 255));
        lblForgotPass.setForeground(new java.awt.Color(51, 51, 255));
        lblForgotPass.setText("Olvide mi contraseña");
        lblForgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblForgotPassMousePressed(evt);
            }
        });

        txtPassword.setText("Contraseña");

        txtSearch.setText("Buscar libro, autor, ISBN...");

        btnSearch.setText("Buscar");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSearchMousePressed(evt);
            }
        });

        lblHome.setText("Principal");

        lblOrder.setForeground(new java.awt.Color(51, 51, 255));
        lblOrder.setText("Pedidos");
        lblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtOrderMousePressed(evt);
            }
        });

        lblHelp.setForeground(new java.awt.Color(51, 51, 255));
        lblHelp.setText("Ayuda");
        lblHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtHelpMousePressed(evt);
            }
        });

        lblContac.setForeground(new java.awt.Color(51, 51, 255));
        lblContac.setText("Contacto");
        lblContac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContacMousePressed(evt);
            }
        });

        lblRegister.setForeground(new java.awt.Color(51, 51, 255));
        lblRegister.setText("Registrarse");
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
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
                        .addComponent(lblHome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHelp)
                        .addGap(10, 10, 10)
                        .addComponent(lblContac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRegister))
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
                    .addComponent(lblHome)
                    .addComponent(lblOrder)
                    .addComponent(lblHelp)
                    .addComponent(lblContac)
                    .addComponent(lblRegister))
                .addGap(31, 31, 31))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setAutoscrolls(true);
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new Dimension(674, 500));
        
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
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        					.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        						.addComponent(btnAddBook)
        						.addPreferredGap(ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
        						.addComponent(btnEdit)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(btnDelete)
        						.addGap(14))
        					.addGroup(jPanel2Layout.createSequentialGroup()
        						.addComponent(spanelBooks, GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        						.addContainerGap()))
        				.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        					.addComponent(btnBack)
        					.addGap(115)
        					.addComponent(lblT3G)
        					.addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnAddBook)
        				.addComponent(btnDelete)
        				.addComponent(btnEdit))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(spanelBooks, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnBack)
        				.addComponent(lblT3G))
        			.addGap(62))
        );
        
        tableBooks = new JTable();
        spanelBooks.setViewportView(tableBooks);
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1Layout.setHorizontalGroup(
        	jInternalFrame1Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        		.addComponent(jPanel2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
        	jInternalFrame1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jInternalFrame1Layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 470, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(55, Short.MAX_VALUE))
        );
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jInternalFrame1, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jInternalFrame1, GroupLayout.PREFERRED_SIZE, 686, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(60, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }
    
	private void btnAddBookMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO Al presionarse debe abrise la ventana de "alta de libro"
	}

	private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO Al presionarse debe abrise la ventana de "Editar libro" para
		// modificar los datos del libro seleccionado
	}

	private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO Al presionarse debe eliminar el libro seleccionado en la tabla
	}

	private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO Al presionase debe volver a la pagina anterior
	}

	private void btnLoginMousePressed(java.awt.event.MouseEvent evt) {
		// TODO Evento para ingresar a la pagina, y loguearse. Abre pantalla
		// home pero ya logueado.
	}

	private void lblForgotPassMousePressed(java.awt.event.MouseEvent evt) {
		// TODO Evento para recuperar contraseña, abre pantalla de
		// "olvide contraseña"
	}

	private void btnSearchMousePressed(java.awt.event.MouseEvent evt) {
		// TODO Evento para realizar una busqueda, en txtSearch esta lo que
		// buscamos
	}

	private void lblPrincipalpictureMousePressed(java.awt.event.MouseEvent evt) {
		// TODO Evento para ir a la interfaz principal. Al hacer click en la
		// imagen "cookbook" voy al inicio.
	}

	private void txtRegisterMousePressed(java.awt.event.MouseEvent evt) {
		// TODO Evento para ir a la interfaz de registro
	}

	private void txtContacMousePressed(java.awt.event.MouseEvent evt) {
		// TODO Evento para ir a la interfaz de contacto
	}

	private void txtHelpMousePressed(java.awt.event.MouseEvent evt) {
		// TODO Evento para ir a la interfaz de ayuda
	}

	private void txtOrderMousePressed(java.awt.event.MouseEvent evt) {
		// TODO Evento para ir a la interfaz de pedidos
	}

	private void createTableModel() {
		tableBooksModel = new DefaultTableModel();
		tableBooksModel.addColumn("Titulo");
		tableBooksModel.addColumn("Autor");
		tableBooksModel.addColumn("Precio");
		tableBooksModel.addColumn("Categorias");
		tableBooksModel.addColumn("ISBN");
		
		for (Book book : Database.getBookDao()) {
			Object[] rowData = new Object[] {
				book.getTitle(),
				String.format("%s, %s", book.getAuthor().getSurname(), book.getAuthor().getName()),
				book.getPrice(),
				"???",	// TODO add categories support
				book.getIsbn()
			};
			
			tableBooksModel.addRow(rowData);
		}
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
            java.util.logging.Logger.getLogger(CatalogueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogueBooks().setVisible(true);
            }
        });
    }
}

