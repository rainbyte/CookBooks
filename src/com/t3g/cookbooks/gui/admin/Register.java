package com.t3g.cookbooks.gui.admin;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.t3g.cookbooks.resources.Resources;
import javax.swing.BoxLayout;

/**
 *
 * @author T3G
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
    	getContentPane().setPreferredSize(new Dimension(880, 980));
    	getContentPane().setBackground(new Color(153, 153, 255));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jInternalFrame1 = new JInternalFrame();
        jInternalFrame1.setResizable(true);
        jInternalFrame1.getContentPane().setBackground(new Color(204, 153, 0));
        jPanel1 = new JPanel();
        lblPrincipalpicture = new JLabel();
        txtUser = new JTextField();
        btnLogin = new JButton();
        lblForgotPass = new JLabel();
        txtPassword = new JPasswordField();
        txtSearch = new JTextField();
        btnSearch = new JButton();
        txtHome = new JLabel();
        txtOrder = new JLabel();
        txtHelp = new JLabel();
        txtContac = new JLabel();
        txtRegister = new JLabel();
        jPanel2 = new JPanel();
        jLabel2 = new JLabel();
        jSeparator1 = new JSeparator();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        lblName = new JLabel();
        lblSurname = new JLabel();
        lblEmail = new JLabel();
        lblPass = new JLabel();
        lblConfirmPass = new JLabel();
        lblStates = new JLabel();
        lblTown = new JLabel();
        lblStreet = new JLabel();
        lblNumber = new JLabel();
        lblFloor = new JLabel();
        lblDepto = new JLabel();
        lblCP = new JLabel();
        lblPhone = new JLabel();
        lblCard = new JLabel();
        lblSecureCode = new JLabel();
        txtName = new JTextField();
        txtSurname = new JTextField();
        txtEmail = new JTextField();
        txtPass = new JTextField();
        txtConfirmPass = new JTextField();
        txtTown = new JTextField();
        txtStreet = new JTextField();
        txtNumber = new JTextField();
        txtFloor = new JTextField();
        txtDepto = new JTextField();
        txtCP = new JTextField();
        txtPhone = new JTextField();
        txtCard1 = new JTextField();
        txtSecureCode = new JTextField();
        btnBack = new JButton();
        btnConfirm = new JButton();
        lblFirmat3g = new JLabel();
        txtCard2 = new JTextField();
        txtCard3 = new JTextField();
        txtCard4 = new JTextField();
        jLabel20 = new JLabel();
        jLabel21 = new JLabel();
        jLabel22 = new JLabel();
        jLabel23 = new JLabel();
        jLabel24 = new JLabel();
        jLabel25 = new JLabel();
        jLabel26 = new JLabel();
        jLabel27 = new JLabel();
        jLabel29 = new JLabel();
        jLabel30 = new JLabel();
        jLabel31 = new JLabel();
        jLabel32 = new JLabel();
        cbxStates = new JComboBox();
        jLabel33 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CookBook Software");
        setBackground(new java.awt.Color(153, 153, 255));
        setPreferredSize(new java.awt.Dimension(680, 730));

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
        lblForgotPass.setText("Olvide mi contraseÃ±a");
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

        jLabel2.setText("REGISTRO");

        jLabel3.setText("INGRESE SUS DATOS");

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Los campos con * son obligatorios");

        lblName.setText("Nombre");

        lblSurname.setText("Apellido");

        lblEmail.setText("Email");

        lblPass.setText("Contraseña");

        lblConfirmPass.setText("Confirme contraseña");

        lblStates.setText("Provincia");

        lblTown.setText("Localidad");

        lblStreet.setText("Calle");

        lblNumber.setText("Número");

        lblFloor.setText("Piso");

        lblDepto.setText("Dpto");

        lblCP.setText("Código postal");

        lblPhone.setText("Teléfono");

        lblCard.setText("Número de tarjeta");

        lblSecureCode.setText("Código de seguridad");

        txtName.setText("Alejandro");

        txtSurname.setText("Martínez");

        txtEmail.setText("Ale.Martinez@dominio.com");

        txtTown.setText("Domselaar");

        txtStreet.setText("San Martín");

        txtNumber.setText("302");

        txtCP.setText("1984");

        txtPhone.setText("02225491066");

        btnBack.setBackground(new java.awt.Color(255, 0, 0));
        btnBack.setText("VOLVER ATRÁS");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBackMousePressed(evt);
            }
        });

        btnConfirm.setText("CONFIRMAR");
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnConfirmMousePressed(evt);
            }
        });

        lblFirmat3g.setText("DESARROLLADO POR T3G");

        jLabel20.setForeground(new java.awt.Color(255, 0, 51));
        jLabel20.setText("*");

        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("*");

        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("*");

        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("*");

        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("*");

        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setText("*");

        jLabel26.setForeground(new java.awt.Color(255, 0, 0));
        jLabel26.setText("*");

        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setText("*");

        jLabel29.setForeground(new java.awt.Color(255, 0, 0));
        jLabel29.setText("*");

        jLabel30.setForeground(new java.awt.Color(255, 0, 0));
        jLabel30.setText("*");

        jLabel31.setForeground(new java.awt.Color(255, 0, 0));
        jLabel31.setText("*");

        jLabel32.setForeground(new java.awt.Color(255, 0, 0));
        jLabel32.setText("*");

        cbxStates.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Provincia", "Ciudad de Buenos Aires", "Buenos Aires", "Catamarca", "Chaco", "Chubut", "CÃ³rdoba", "Corrientes", "Entre RÃ­os", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "NeuquÃ©n", "RÃ­o Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tierra del Fuego, AntÃ¡rtida e Islas del AtlÃ¡ntico Sur", "TucumÃ¡n" }));

        jLabel33.setForeground(Color.RED);
        jLabel33.setText("*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(12)
        					.addComponent(jLabel2)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(21)
        					.addComponent(btnBack))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(80)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(lblCP, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
        								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        									.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        										.addComponent(lblConfirmPass)
        										.addComponent(lblPass)
        										.addComponent(lblSurname)
        										.addComponent(lblName)
        										.addComponent(lblEmail)
        										.addComponent(lblStates)
        										.addComponent(lblTown))
        									.addComponent(lblStreet, Alignment.TRAILING)
        									.addComponent(lblFloor, Alignment.TRAILING)
        									.addComponent(lblPhone, Alignment.TRAILING)
        									.addComponent(lblCard, Alignment.TRAILING)
        									.addComponent(lblSecureCode, Alignment.TRAILING)))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addComponent(txtCard1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(txtCard2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(txtCard3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(txtCard4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(jLabel31))
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addGap(93)
        									.addComponent(btnConfirm))
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
        										.addComponent(txtPhone, Alignment.LEADING)
        										.addComponent(txtCP, Alignment.LEADING)
        										.addComponent(txtFloor)
        										.addComponent(txtStreet)
        										.addComponent(txtTown, Alignment.LEADING)
        										.addComponent(txtConfirmPass, Alignment.LEADING)
        										.addComponent(txtName, Alignment.LEADING)
        										.addComponent(txtSurname, Alignment.LEADING)
        										.addComponent(txtEmail, Alignment.LEADING)
        										.addComponent(txtPass, Alignment.LEADING)
        										.addComponent(txtSecureCode)
        										.addComponent(cbxStates, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(jLabel20)
        										.addComponent(jLabel21)
        										.addComponent(jLabel22)
        										.addComponent(jLabel23)
        										.addComponent(jLabel24)
        										.addComponent(jLabel26)
        										.addComponent(jLabel29)
        										.addComponent(jLabel30)
        										.addComponent(jLabel32)
        										.addComponent(jLabel25, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
        										.addGroup(jPanel2Layout.createSequentialGroup()
        											.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        												.addGroup(jPanel2Layout.createSequentialGroup()
        													.addGap(40)
        													.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        														.addComponent(lblFirmat3g)
        														.addGroup(jPanel2Layout.createSequentialGroup()
        															.addGap(2)
        															.addComponent(lblDepto)
        															.addPreferredGap(ComponentPlacement.UNRELATED)
        															.addComponent(txtDepto, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))))
        												.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
        													.addComponent(jLabel27, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        													.addGap(4)
        													.addComponent(lblNumber)
        													.addPreferredGap(ComponentPlacement.RELATED)
        													.addComponent(txtNumber, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
        											.addPreferredGap(ComponentPlacement.RELATED)
        											.addComponent(jLabel33, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)))))
        							.addGap(44))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel3)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
        							.addGap(65)))))
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblName)
        				.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel20))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblSurname)
        				.addComponent(txtSurname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel21))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblEmail)
        				.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel22))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblPass)
        				.addComponent(txtPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel23))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblConfirmPass)
        				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(txtConfirmPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(jLabel24)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblStates)
        				.addComponent(cbxStates, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel25, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblTown)
        				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(txtTown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(jLabel26)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblStreet)
        				.addComponent(lblNumber)
        				.addComponent(txtStreet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel27)
        				.addComponent(jLabel33))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblFloor)
        				.addComponent(txtFloor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblDepto, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtDepto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtCP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel29)
        				.addComponent(lblCP))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblPhone)
        				.addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel30))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblCard)
        				.addComponent(txtCard1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtCard2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtCard3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtCard4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel31))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblSecureCode)
        				.addComponent(txtSecureCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel32))
        			.addGap(18)
        			.addComponent(btnConfirm)
        			.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnBack)
        				.addComponent(lblFirmat3g))
        			.addGap(15))
        );
        jPanel2.setLayout(jPanel2Layout);
        jInternalFrame1.getContentPane().setLayout(new BoxLayout(jInternalFrame1.getContentPane(), BoxLayout.Y_AXIS));
        jInternalFrame1.getContentPane().add(jPanel1);
        jInternalFrame1.getContentPane().add(jPanel2);

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
    }

    private void btnLoginMousePressed(java.awt.event.MouseEvent evt) {
    	// TODO Evento para ingresar a la pÃ¡gina, y loguearse. Abre pantalla home pero ya logueado.
    }
    
    private void lblForgotPassMousePressed(java.awt.event.MouseEvent evt) {
    	// TODO Evento para recuperar contraseÃ±a, abre pantalla de "olvide contraseÃ±a"
    }
    private void btnSearchMousePressed(java.awt.event.MouseEvent evt) {
    	// TODO Evento para realizar una bÃºsqueda, en txtSearch esta lo que buscamos
    }
    
    private void lblPrincipalpictureMousePressed(java.awt.event.MouseEvent evt) {
    	// TODO Evento para ir a la interfaz principal. Al hacer click en la imÃ¡gen "cookbook" voy al inicio.
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

    private void btnConfirmMousePressed(java.awt.event.MouseEvent evt) {
        // TODO Evento que confirma el registro de un usuario, aca tambiÃ©n habrÃ­a que validar que todos
        // los campos fueron correctos...
    }

    private void btnBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMousePressed
        // TODO Evento para ir a la interfaz anterios (Principal?) QuizÃ¡s lo mejor es hacer
        // que vaya a la principal... para simplificar pero no sÃ©
        // Es el evento del botÃ³n "VOLVER ATRÃ�S"
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }




        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cbxStates;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCP;
    private javax.swing.JLabel lblCard;
    private javax.swing.JLabel lblConfirmPass;
    private javax.swing.JLabel lblDepto;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirmat3g;
    private javax.swing.JLabel lblFloor;
    private javax.swing.JLabel lblForgotPass;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPrincipalpicture;
    private javax.swing.JLabel lblSecureCode;
    private javax.swing.JLabel lblStates;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblTown;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCard1;
    private javax.swing.JTextField txtCard2;
    private javax.swing.JTextField txtCard3;
    private javax.swing.JTextField txtCard4;
    private javax.swing.JTextField txtConfirmPass;
    private javax.swing.JLabel txtContac;
    private javax.swing.JTextField txtDepto;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFloor;
    private javax.swing.JLabel txtHelp;
    private javax.swing.JLabel txtHome;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JLabel txtOrder;
    private javax.swing.JTextField txtPass;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JLabel txtRegister;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSecureCode;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtTown;
    private javax.swing.JTextField txtUser;
}
