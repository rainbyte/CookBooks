package com.t3g.cookbooks.gui.panel.body.user;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ModifyData extends JPanel {
	private static final long serialVersionUID = 1L;

	private JButton btnBack, btnConfirm;
	private JComboBox<String> cbxStates;
	private JLabel jLabel2, jLabel23, jLabel24, jLabel25, jLabel26, jLabel27,
			jLabel29, jLabel3, jLabel30, jLabel31, jLabel32, jLabel33, jLabel4;
	private JSeparator jSeparator1;
	private JLabel lblCP, lblCard, lblNewPass, lblDepto, lblFirmat3g, lblFloor,
			lblNumber, lblActualPass, lblPhone, lblSecureCode, lblStates,
			lblStreet, lblTown;
	private JTextField txtCP, txtCard1, txtCard2, txtCard3, txtCard4,
			txtNewPass, txtDepto, txtFloor, txtNumber, txtActualPass, txtPhone,
			txtSecureCode, txtStreet, txtTown;
	private JTextField txtConfirmPass;
	private JLabel jlabel35;
	private JTextField txtEmail;
	private JTextField txtName;
	private JLabel lblName;
	private JLabel lblEmail;
	private JLabel jlabel36;
	private JLabel lblSurname;
	private JTextField txtSurname;
	private JLabel jlabel37;
	private JLabel jlabel38;

	public ModifyData() {
		initialize();
	}

	public void initialize() {
		jLabel2 = new JLabel();
		jLabel2.setFont(new Font("Tahoma", Font.BOLD, 11));
		jSeparator1 = new JSeparator();
		jLabel3 = new JLabel();
		jLabel3.setForeground(new Color(0, 0, 153));
		jLabel3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		jLabel4 = new JLabel();
		lblActualPass = new JLabel();
		lblNewPass = new JLabel();
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
		txtActualPass = new JTextField();
		txtNewPass = new JTextField();
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
		jLabel23 = new JLabel();
		jLabel24 = new JLabel();
		jLabel25 = new JLabel();
		jLabel26 = new JLabel();
		jLabel27 = new JLabel();
		jLabel29 = new JLabel();
		jLabel30 = new JLabel();
		jLabel31 = new JLabel();
		jLabel32 = new JLabel();
		cbxStates = new JComboBox<String>();
		jLabel33 = new JLabel();

		setBackground(new java.awt.Color(153, 153, 255));
		setAutoscrolls(true);
		setName(""); // NOI18N
		setPreferredSize(new java.awt.Dimension(674, 500));

		jLabel2.setText("MI CUENTA");

		jLabel3.setText("CAMBIAR CONTRASE\u00D1A");

		jLabel4.setForeground(new java.awt.Color(255, 0, 0));
		jLabel4.setText("Los campos con * son obligatorios");

		lblActualPass.setText("Contrase\u00F1a");

		lblNewPass.setText("Nueva contrase\u00F1a");

		lblStates.setText("Provincia");

		lblTown.setText("Localidad");

		lblStreet.setText("Calle");

		lblNumber.setText("N\u00FAmero");

		lblFloor.setText("Piso");

		lblDepto.setText("Dpto");

		lblCP.setText("C\u00F3digo postal");

		lblPhone.setText("Tel\u00E9fono");

		lblCard.setText("N\u00FAmero de tarjeta");

		lblSecureCode.setText("C\u00F3digo de seguridad");

		txtTown.setText("Domselaar");

		txtStreet.setText("San Mart\u00EDn");

		txtNumber.setText("302");

		txtCP.setText("1984");

		txtPhone.setText("02225491066");

		btnBack.setBackground(new java.awt.Color(255, 0, 0));
		btnBack.setText("VOLVER AL INICIO");
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

		cbxStates.setModel(
			new javax.swing.DefaultComboBoxModel<String>(
				new String[] {
					"Seleccionar Provincia",
					"Ciudad de Buenos Aires",
					"Buenos Aires",
					"Catamarca",
					"Chaco",
					"Chubut",
					"Cordoba",
					"Corrientes",
					"Entre Rios",
					"Formosa",
					"Jujuy",
					"La Pampa",
					"La Rioja",
					"Mendoza",
					"Misiones",
					"Neuquen",
					"Rio Negro",
					"Salta",
					"San Juan",
					"San Luis",
					"Santa Cruz",
					"Santa Fe",
					"Santiago del Estero",
					"Tierra del Fuego, Antartida e Islas del Atlantico Sur",
					"Tucuman" }));

		jLabel33.setForeground(Color.RED);
		jLabel33.setText("*");

		txtConfirmPass = new JTextField();
		txtConfirmPass.setColumns(10);

		JLabel lblConfirmPass = new JLabel("Confirma");

		JLabel jlabel33 = new JLabel("*");
		jlabel33.setForeground(new Color(255, 0, 0));

		JLabel jlabel34 = new JLabel("");

		jlabel35 = new JLabel("MODIFICAR DATOS PERSONALES");
		jlabel35.setForeground(new Color(0, 0, 153));
		jlabel35.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));

		txtEmail = new JTextField();
		txtEmail.setColumns(10);

		txtName = new JTextField();
		txtName.setColumns(10);

		lblName = new JLabel("Nombre");

		lblEmail = new JLabel("Email");

		jlabel36 = new JLabel("*");
		jlabel36.setForeground(new Color(255, 0, 0));

		lblSurname = new JLabel("Apellido");

		txtSurname = new JTextField();
		txtSurname.setColumns(10);

		jlabel37 = new JLabel("*");
		jlabel37.setForeground(new Color(255, 0, 0));

		jlabel38 = new JLabel("*");
		jlabel38.setForeground(new Color(255, 0, 0));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this);
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
							.addGap(108)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblConfirmPass)
								.addComponent(lblNewPass)
								.addComponent(lblActualPass))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(txtNewPass, Alignment.LEADING)
								.addComponent(txtActualPass, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
								.addComponent(jlabel34, Alignment.LEADING)
								.addComponent(txtConfirmPass, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
									.addComponent(jLabel23)
									.addComponent(jLabel24))
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addComponent(jlabel33)
									.addPreferredGap(ComponentPlacement.RELATED)))))
					.addGap(23))
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(100)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblCP)
								.addComponent(lblTown)
								.addComponent(lblNumber)
								.addComponent(lblStreet)
								.addComponent(lblPhone)
								.addComponent(lblCard)
								.addComponent(lblSecureCode)
								.addComponent(lblStates)
								.addComponent(lblEmail)
								.addComponent(lblSurname)
								.addComponent(lblName)))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jlabel35)))
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
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtStreet, 262, 343, Short.MAX_VALUE)
								.addComponent(txtTown, 262, 343, Short.MAX_VALUE)
								.addComponent(cbxStates, 0, 343, Short.MAX_VALUE)
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addComponent(txtSecureCode, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(jLabel32))
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(txtCP, Alignment.LEADING)
										.addComponent(txtNumber, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup()
											.addComponent(jLabel33, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
											.addGap(25)
											.addComponent(lblFloor)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtFloor, GroupLayout.DEFAULT_SIZE, 45, 45)
											.addGap(25)
											.addComponent(lblDepto)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtDepto, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel29)))
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(jLabel30))
								.addComponent(txtEmail, GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
								.addComponent(txtName, GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
								.addComponent(txtSurname, GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jlabel36)
								.addComponent(jlabel38)
								.addComponent(jlabel37)
								.addComponent(jLabel26)
								.addComponent(jLabel25, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel27, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))))
					.addGap(97))
				.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jLabel3)
							.addPreferredGap(ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
							.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(21)
							.addComponent(btnBack)
							.addGap(133)
							.addComponent(btnConfirm)
							.addPreferredGap(ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
							.addComponent(lblFirmat3g)))
					.addGap(26))
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
						.addComponent(txtActualPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel23)
						.addComponent(lblActualPass))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewPass)
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtNewPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(jLabel24)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtConfirmPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblConfirmPass)
						.addComponent(jlabel33))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(jlabel34)
					.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jlabel36))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSurname)
						.addComponent(txtSurname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jlabel38))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail)
						.addComponent(jlabel37))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbxStates, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel25, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStates))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtTown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel26)
						.addComponent(lblTown))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStreet)
						.addComponent(txtStreet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel27))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDepto, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDepto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumber)
						.addComponent(txtNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFloor)
						.addComponent(txtFloor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel33))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCP)
						.addComponent(jLabel29))
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
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnConfirm)
						.addComponent(btnBack)
						.addComponent(lblFirmat3g))
					.addGap(35))
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGap(141)
					.addComponent(jlabel35)
					.addContainerGap(345, Short.MAX_VALUE))
		);
		setLayout(jPanel2Layout);
	}

	private void btnConfirmMousePressed(java.awt.event.MouseEvent evt) {
		// TODO Evento que confirma el registro de un usuario, aca tambien
		// habri­a que validar que todos los campos fueron correctos...
	}

	private void btnBackMousePressed(java.awt.event.MouseEvent evt) {
		// TODO Evento para ir a la interfaz anterios (Principal?)
		// Es el evento del boton "VOLVER ATRAS"
	}
}
