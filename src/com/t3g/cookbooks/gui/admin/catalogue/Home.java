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

import com.t3g.cookbooks.resources.Resources;

import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.ScrollPaneConstants;
/**
 *
 * @author T3G
 */
public class Home extends javax.swing.JFrame {

	private JButton btnLogin, btnSearch;
    private JInternalFrame jInternalFrame1;
    private JPanel jPanel1, jPanel2;
    private JLabel lblForgotPass, lblPrincipalpicture, lblContac, lblHelp, lblHome, lblOrder, lblRegister;
    private JPasswordField txtPassword;
    private JTextField txtSearch, txtUser;
    private JComboBox comboBoxSelectTheme;
    private JScrollPane scrollPanelBookList;
    private JTable tableBookList;
    private JLabel lblCarrito;
    private JTable tableBuyList;
    private JTable tablePurchaces;
    
	
    /**
     * Creates new form Register
     */
    public Home() {
    	getContentPane().setPreferredSize(new Dimension(657, 687));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings({ "unchecked", "serial" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jInternalFrame1.getContentPane().setBackground(new Color(153, 153, 255));
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
        jInternalFrame1.setTitle("Principal");
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
        lblForgotPass.setText("Olvide mi contrase\u00F1a");
        lblForgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblForgotPassMousePressed(evt);
            }
        });

        txtPassword.setText("ContraseÃ±a");

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
        
        JLabel lblT3G = new JLabel("DESARROLLADO POR T3G");
        
        comboBoxSelectTheme = new JComboBox();
		comboBoxSelectTheme.setBounds(172, 219, 150, 25);
		comboBoxSelectTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Tema: (click aqui)", "Comida Arabe","Comida Judia","Comida Oriental", "Comida Española","Comida Peruana","Vegetariano",  "Parilladas","Postres","Otro"}));
        comboBoxSelectTheme.setEditable(true);
        
        scrollPanelBookList = new JScrollPane();
        
        lblCarrito = new JLabel("");
        lblCarrito.setIcon(new ImageIcon(Home.class.getResource("/com/t3g/cookbooks/resources/Carrito.png")));
        
        JButton btnBuy = new JButton("");
        btnBuy.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent arg0) {
        		//TODO Accion del boton comprar, para confirmar lo añadido al carrito
        	}
        });
        btnBuy.setBackground(new Color(153, 153, 255));
        btnBuy.setIcon(new ImageIcon(Home.class.getResource("/com/t3g/cookbooks/resources/IconBtnBuy.png")));
        
        JButton btnNotBuy = new JButton("");
        btnNotBuy.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent e) {
        		//TODO Accion del boton No comprar, cancelar lo añadido al carrito
        	}
        });
        btnNotBuy.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        btnNotBuy.setBackground(new Color(153, 153, 255));
        btnNotBuy.setIcon(new ImageIcon(Home.class.getResource("/com/t3g/cookbooks/resources/IconBtnNotBuy.png")));
        
        JScrollPane scrollPanelBuyList = new JScrollPane();
        
        JLabel lblPurchaces = new JLabel("Compras Realizadas");
        lblPurchaces.setOpaque(true);
        
        JScrollPane scrollPanelPurchaces = new JScrollPane();

        javax.swing.GroupLayout gl_jPanel2 = new javax.swing.GroupLayout(jPanel2);
        gl_jPanel2.setHorizontalGroup(
        	gl_jPanel2.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_jPanel2.createSequentialGroup()
        			.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
        				.addComponent(scrollPanelBookList, GroupLayout.PREFERRED_SIZE, 423, GroupLayout.PREFERRED_SIZE)
        				.addComponent(comboBoxSelectTheme, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE))
        			.addGap(43)
        			.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
        				.addComponent(scrollPanelPurchaces, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        				.addComponent(scrollPanelBuyList, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        				.addComponent(lblT3G, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        				.addComponent(lblCarrito)
        				.addGroup(gl_jPanel2.createSequentialGroup()
        					.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(gl_jPanel2.createSequentialGroup()
        							.addGap(9)
        							.addComponent(btnNotBuy, 0, 0, Short.MAX_VALUE))
        						.addGroup(gl_jPanel2.createSequentialGroup()
        							.addGap(10)
        							.addComponent(btnBuy, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
        					.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
        				.addComponent(lblPurchaces, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
        			.addContainerGap())
        );
        gl_jPanel2.setVerticalGroup(
        	gl_jPanel2.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_jPanel2.createSequentialGroup()
        			.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_jPanel2.createSequentialGroup()
        					.addComponent(comboBoxSelectTheme, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(scrollPanelBookList, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE))
        				.addGroup(gl_jPanel2.createSequentialGroup()
        					.addComponent(lblCarrito)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(scrollPanelBuyList, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
        					.addGap(4)
        					.addComponent(btnBuy, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnNotBuy, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(lblPurchaces)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(scrollPanelPurchaces, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)))
        			.addGap(9)
        			.addComponent(lblT3G)
        			.addContainerGap())
        );
        
        tablePurchaces = new JTable();
        tablePurchaces.setModel(new DefaultTableModel(
        	new Object[][] {
        		{"Compra 5", null},
        		{null, null}, // TODO  Precio y nombre de la ultima compra
        		{"Compra 4", null},
        		{null, null}, // TODO  Precio y nombre de la compra 4
        		{"Compra 3", null},
        		{null, null}, // TODO  Precio y nombre de la compra 3
        		{"Compra 2", null},
        		{null, null}, // TODO Precio y nombre de la compra 2
        		{"Compra 1", null},
        		{null, null}, // TODO Precio y nombre de la compra 1
        	},
        	new String[] {
        		"Precio", "Nombre"
        	}
        ));
        scrollPanelPurchaces.setColumnHeaderView(tablePurchaces);
        
        
        
        tableBuyList = new JTable();
        tableBuyList.setModel(new DefaultTableModel(
        	new Object[][] { //TODO las compras hechas en el carrito. Tiene que ser una estructura dinamica, no estar guardado en memoria
        	},
        	new String[] {
        		"Mi compra actual (nombre)", "Valor ($)"
        	}
        ) {
        	Class[] columnTypes = new Class[] {
        		String.class, Float.class
        	};
        	public Class getColumnClass(int columnIndex) {
        		return columnTypes[columnIndex];
        	}
        });
        scrollPanelBuyList.setViewportView(tableBuyList);
        
        tableBookList = new JTable();
        tableBookList.setToolTipText("");
        tableBookList.setModel(new DefaultTableModel(
        	new Object[][] { //TODO Rellenar con los libros de la db
        	},
        	new String[] {
        		"Nombre", "ISBN", "Autor", "Precio", "Categoria", "Informacion"
        	}
        ) {
        	Class[] columnTypes = new Class[] {
        		String.class, Integer.class, String.class, Float.class, String.class, Object.class
        	};
        	public Class getColumnClass(int columnIndex) {
        		return columnTypes[columnIndex];
        	}
        });
        scrollPanelBookList.setViewportView(tableBookList);
        jPanel2.setLayout(gl_jPanel2);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1Layout.setHorizontalGroup(
        	jInternalFrame1Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        		.addGroup(jInternalFrame1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        			.addGap(29))
        );
        jInternalFrame1Layout.setVerticalGroup(
        	jInternalFrame1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jInternalFrame1Layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 470, GroupLayout.PREFERRED_SIZE))
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

	private void btnLoginMousePressed(java.awt.event.MouseEvent evt) {
		// TODO Evento para ingresar a la pagina, y loguearse. Abre pantalla
		// home pero ya logueado.
	}

	private void lblForgotPassMousePressed(java.awt.event.MouseEvent evt) {
		// TODO Evento para recuperar contraseÃ±a, abre pantalla de
		// "olvide contraseÃ±a"
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
}
