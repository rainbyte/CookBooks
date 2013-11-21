package com.t3g.cookbooks.gui.panel.body;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BoxLayout;

import java.awt.GridLayout;

public class BodyRegister extends JPanel {

	private JButton btnBack, btnConfirm;
	private JComboBox cbxStates;
	private JLabel jLabel2, jLabel20, jLabel21, jLabel22, jLabel23, jLabel24,
			jLabel25, jLabel26, jLabel27, jLabel29, jLabel3, jLabel30,
			jLabel31, jLabel32, jLabel33, jLabel4;
	private JSeparator jSeparator1;
	private JLabel lblCP, lblCard, lblConfirmPass, lblDepto, lblEmail,
			lblFirmat3g, lblFloor, lblName, lblNumber, lblPass, lblPhone,
			lblSecureCode, lblStates, lblStreet, lblSurname, lblTown;
	private JTextField txtCP, txtCard1, txtCard2, txtCard3, txtCard4,
			txtConfirmPass, txtDepto, txtEmail, txtFloor, txtName, txtNumber,
			txtPass, txtPhone, txtSecureCode, txtStreet, txtSurname, txtTown;
	private JPanel panel, panel_1, panel_5;

	public BodyRegister() {
		initialize();
	}

	public void initialize() {
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

		setBackground(new java.awt.Color(153, 153, 255));
		setAutoscrolls(true);
		setName(""); // NOI18N
		setPreferredSize(new java.awt.Dimension(674, 500));

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

		cbxStates.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Seleccionar Provincia", "Ciudad de Buenos Aires",
				"Buenos Aires", "Catamarca", "Chaco", "Chubut", "CÃ³rdoba",
				"Corrientes", "Entre RÃ­os", "Formosa", "Jujuy", "La Pampa",
				"La Rioja", "Mendoza", "Misiones", "NeuquÃ©n", "RÃ­o Negro",
				"Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe",
				"Santiago del Estero",
				"Tierra del Fuego, AntÃ¡rtida e Islas del AtlÃ¡ntico Sur",
				"TucumÃ¡n" }));

		jLabel33.setForeground(Color.RED);
		jLabel33.setText("*");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(12)
																		.addComponent(
																				jLabel2)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				jSeparator1,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(21)
																		.addComponent(
																				btnBack))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(80)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								Alignment.TRAILING)
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel2Layout
																														.createParallelGroup(
																																Alignment.TRAILING)
																														.addComponent(
																																lblCP,
																																GroupLayout.PREFERRED_SIZE,
																																77,
																																GroupLayout.PREFERRED_SIZE)
																														.addGroup(
																																jPanel2Layout
																																		.createParallelGroup(
																																				Alignment.LEADING)
																																		.addGroup(
																																				jPanel2Layout
																																						.createParallelGroup(
																																								Alignment.TRAILING)
																																						.addComponent(
																																								lblConfirmPass)
																																						.addComponent(
																																								lblPass)
																																						.addComponent(
																																								lblSurname)
																																						.addComponent(
																																								lblName)
																																						.addComponent(
																																								lblEmail)
																																						.addComponent(
																																								lblStates)
																																						.addComponent(
																																								lblTown))
																																		.addComponent(
																																				lblStreet,
																																				Alignment.TRAILING)
																																		.addComponent(
																																				lblFloor,
																																				Alignment.TRAILING)
																																		.addComponent(
																																				lblPhone,
																																				Alignment.TRAILING)
																																		.addComponent(
																																				lblCard,
																																				Alignment.TRAILING)
																																		.addComponent(
																																				lblSecureCode,
																																				Alignment.TRAILING)))
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel2Layout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addGroup(
																																jPanel2Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				txtCard1,
																																				GroupLayout.PREFERRED_SIZE,
																																				50,
																																				GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED)
																																		.addComponent(
																																				txtCard2,
																																				GroupLayout.PREFERRED_SIZE,
																																				50,
																																				GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED)
																																		.addComponent(
																																				txtCard3,
																																				GroupLayout.PREFERRED_SIZE,
																																				50,
																																				GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED)
																																		.addComponent(
																																				txtCard4,
																																				GroupLayout.PREFERRED_SIZE,
																																				50,
																																				GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED)
																																		.addComponent(
																																				jLabel31))
																														.addGroup(
																																jPanel2Layout
																																		.createSequentialGroup()
																																		.addGap(93)
																																		.addComponent(
																																				btnConfirm))
																														.addGroup(
																																jPanel2Layout
																																		.createSequentialGroup()
																																		.addGroup(
																																				jPanel2Layout
																																						.createParallelGroup(
																																								Alignment.TRAILING,
																																								false)
																																						.addComponent(
																																								txtPhone,
																																								Alignment.LEADING)
																																						.addComponent(
																																								txtCP,
																																								Alignment.LEADING)
																																						.addComponent(
																																								txtFloor)
																																						.addComponent(
																																								txtStreet)
																																						.addComponent(
																																								txtTown,
																																								Alignment.LEADING)
																																						.addComponent(
																																								txtConfirmPass,
																																								Alignment.LEADING)
																																						.addComponent(
																																								txtName,
																																								Alignment.LEADING)
																																						.addComponent(
																																								txtSurname,
																																								Alignment.LEADING)
																																						.addComponent(
																																								txtEmail,
																																								Alignment.LEADING)
																																						.addComponent(
																																								txtPass,
																																								Alignment.LEADING)
																																						.addComponent(
																																								txtSecureCode)
																																						.addComponent(
																																								cbxStates,
																																								GroupLayout.PREFERRED_SIZE,
																																								GroupLayout.DEFAULT_SIZE,
																																								GroupLayout.PREFERRED_SIZE))
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED)
																																		.addGroup(
																																				jPanel2Layout
																																						.createParallelGroup(
																																								Alignment.LEADING)
																																						.addComponent(
																																								jLabel20)
																																						.addComponent(
																																								jLabel21)
																																						.addComponent(
																																								jLabel22)
																																						.addComponent(
																																								jLabel23)
																																						.addComponent(
																																								jLabel24)
																																						.addComponent(
																																								jLabel26)
																																						.addComponent(
																																								jLabel29)
																																						.addComponent(
																																								jLabel30)
																																						.addComponent(
																																								jLabel32)
																																						.addComponent(
																																								jLabel25,
																																								GroupLayout.PREFERRED_SIZE,
																																								15,
																																								GroupLayout.PREFERRED_SIZE)
																																						.addGroup(
																																								jPanel2Layout
																																										.createSequentialGroup()
																																										.addGroup(
																																												jPanel2Layout
																																														.createParallelGroup(
																																																Alignment.TRAILING)
																																														.addGroup(
																																																jPanel2Layout
																																																		.createSequentialGroup()
																																																		.addGap(40)
																																																		.addGroup(
																																																				jPanel2Layout
																																																						.createParallelGroup(
																																																								Alignment.LEADING)
																																																						.addComponent(
																																																								lblFirmat3g)
																																																						.addGroup(
																																																								jPanel2Layout
																																																										.createSequentialGroup()
																																																										.addGap(2)
																																																										.addComponent(
																																																												lblDepto)
																																																										.addPreferredGap(
																																																												ComponentPlacement.UNRELATED)
																																																										.addComponent(
																																																												txtDepto,
																																																												GroupLayout.DEFAULT_SIZE,
																																																												70,
																																																												Short.MAX_VALUE))))
																																														.addGroup(
																																																Alignment.LEADING,
																																																jPanel2Layout
																																																		.createSequentialGroup()
																																																		.addComponent(
																																																				jLabel27,
																																																				GroupLayout.PREFERRED_SIZE,
																																																				28,
																																																				GroupLayout.PREFERRED_SIZE)
																																																		.addGap(4)
																																																		.addComponent(
																																																				lblNumber)
																																																		.addPreferredGap(
																																																				ComponentPlacement.RELATED)
																																																		.addComponent(
																																																				txtNumber,
																																																				GroupLayout.PREFERRED_SIZE,
																																																				72,
																																																				GroupLayout.PREFERRED_SIZE)))
																																										.addPreferredGap(
																																												ComponentPlacement.RELATED)
																																										.addComponent(
																																												jLabel33,
																																												GroupLayout.PREFERRED_SIZE,
																																												13,
																																												GroupLayout.PREFERRED_SIZE)))))
																										.addGap(44))
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel3)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel4,
																												GroupLayout.PREFERRED_SIZE,
																												198,
																												GroupLayout.PREFERRED_SIZE)
																										.addGap(65)))))
										.addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																Alignment.TRAILING)
														.addComponent(
																jSeparator1,
																GroupLayout.PREFERRED_SIZE,
																10,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																jLabel3,
																GroupLayout.PREFERRED_SIZE,
																14,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel4))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblName)
														.addComponent(
																txtName,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel20))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblSurname)
														.addComponent(
																txtSurname,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel21))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblEmail)
														.addComponent(
																txtEmail,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel22))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblPass)
														.addComponent(
																txtPass,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel23))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblConfirmPass)
														.addGroup(
																jPanel2Layout
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				txtConfirmPass,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jLabel24)))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblStates)
														.addComponent(
																cbxStates,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel25,
																GroupLayout.PREFERRED_SIZE,
																18,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(lblTown)
														.addGroup(
																jPanel2Layout
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				txtTown,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jLabel26)))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblStreet)
														.addComponent(lblNumber)
														.addComponent(
																txtStreet,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																txtNumber,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel27)
														.addComponent(jLabel33))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblFloor)
														.addComponent(
																txtFloor,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblDepto,
																GroupLayout.PREFERRED_SIZE,
																14,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																txtDepto,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																txtCP,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel29)
														.addComponent(lblCP))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblPhone)
														.addComponent(
																txtPhone,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel30))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblCard)
														.addComponent(
																txtCard1,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																txtCard2,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																txtCard3,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																txtCard4,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel31))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblSecureCode)
														.addComponent(
																txtSecureCode,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel32))
										.addGap(18)
										.addComponent(btnConfirm)
										.addPreferredGap(
												ComponentPlacement.RELATED, 7,
												Short.MAX_VALUE)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(btnBack)
														.addComponent(
																lblFirmat3g))
										.addGap(15)));
		setLayout(jPanel2Layout);
	}

	private void btnConfirmMousePressed(java.awt.event.MouseEvent evt) {
		// TODO Evento que confirma el registro de un usuario, aca tambiÃ©n
		// habrÃ­a que validar que todos
		// los campos fueron correctos...
	}

	private void btnBackMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnBackMousePressed
		// TODO Evento para ir a la interfaz anterios (Principal?) QuizÃ¡s lo
		// mejor es hacer
		// que vaya a la principal... para simplificar pero no sÃ©
		// Es el evento del botÃ³n "VOLVER ATRÃ�S"
	}
}
