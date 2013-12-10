package com.t3g.cookbooks.gui.panel.body;

import java.awt.Color;
import java.sql.SQLException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.t3g.cookbooks.db.Database;
import com.t3g.cookbooks.db.entities.User;
import com.t3g.cookbooks.gui.abstraction.MainWindowLogic;
import com.t3g.cookbooks.gui.abstraction.PanelBody;
import com.t3g.cookbooks.util.FieldValidator;
import javax.swing.JPasswordField;

public class Register extends PanelBody {
	private static final long serialVersionUID = 1L;

	private JButton btnBack, btnConfirm;
	private JComboBox<String> cbxStates;
	private JLabel jLabel2, jLabel20, jLabel21, lblEmailExist, jLabel23, jLabel24,
			jLabel25, jLabel26, jLabel27, jLabel29, jLabel3, jLabel30,
			jLabel31, jLabel32, jLabel33, jLabel4;
	private JSeparator jSeparator1;
	private JLabel lblCP, lblCard, lblConfirmPass, lblDepto, lblEmail,
			lblFirmat3g, lblFloor, lblName, lblNumber, lblPass, lblPhone,
			lblSecureCode, lblStates, lblStreet, lblSurname, lblTown;
	private JTextField txtCP, txtCard1, txtCard2, txtCard3, txtCard4, txtDepto, txtEmail, txtFloor, txtName, txtNumber, txtPhone, txtSecureCode, txtStreet, txtSurname, txtTown;
	private JPasswordField txtConfirmPass;
	private JPasswordField txtPass;

	public Register(MainWindowLogic mainWindow) {
		super(mainWindow);
	}

	protected void initialize() {
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
		lblEmailExist = new JLabel();
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
		txtConfirmPass = new JPasswordField();
		txtPass = new JPasswordField();

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

		txtName.setText("");

		txtSurname.setText("");

		txtEmail.setText("");

		txtTown.setText("");

		txtStreet.setText("");

		txtNumber.setText("");

		txtCP.setText("");

		txtPhone.setText("");

		btnBack.setBackground(new java.awt.Color(255, 0, 0));
		btnBack.setText("VOLVER ATR\u00C1S");
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

		lblEmailExist.setForeground(new java.awt.Color(255, 0, 0));
		lblEmailExist.setText("*");

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
					"Entre RÃ­os",
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
					"Tierra del Fuego, AntÃ¡rtida e Islas del Atlantico Sur",
					"Tucuman" }));

		jLabel33.setForeground(Color.RED);
		jLabel33.setText("*");

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
							.addGap(21)
							.addComponent(btnBack))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(80)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblCP)
										.addComponent(lblTown)
										.addComponent(lblNumber)
										.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
											.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblConfirmPass)
												.addComponent(lblPass)
												.addComponent(lblSurname)
												.addComponent(lblName)
												.addComponent(lblEmail)
												.addComponent(lblStates))
											.addComponent(lblStreet, Alignment.TRAILING)
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
											.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(txtStreet, 262, 262, Short.MAX_VALUE)
												.addComponent(txtTown, 262, 262, Short.MAX_VALUE)
												.addComponent(txtName, 262, 262, Short.MAX_VALUE)
												.addComponent(cbxStates, 0, 262, Short.MAX_VALUE)
												.addGroup(jPanel2Layout.createSequentialGroup()
													.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
														.addComponent(txtConfirmPass)
														.addComponent(txtPass, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
														.addComponent(jLabel23)
														.addComponent(jLabel24)))
												.addComponent(txtEmail, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
												.addGroup(jPanel2Layout.createSequentialGroup()
													.addComponent(txtSecureCode, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(jLabel32))
												.addGroup(jPanel2Layout.createSequentialGroup()
													.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
														.addComponent(txtCP, Alignment.LEADING)
														.addComponent(txtNumber, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
														.addGroup(jPanel2Layout.createSequentialGroup()
															.addComponent(jLabel33, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
															.addGap(25)
															.addComponent(lblFloor)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(txtFloor, GroupLayout.DEFAULT_SIZE, 42, 45)
															.addGap(25)
															.addComponent(lblDepto)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(txtDepto, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
														.addComponent(jLabel29)))
												.addGroup(jPanel2Layout.createSequentialGroup()
													.addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(jLabel30))
												.addComponent(txtSurname, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(jLabel20)
												.addComponent(jLabel21)
												.addComponent(lblEmailExist)
												.addComponent(jLabel26)
												.addComponent(jLabel25, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
												.addGroup(jPanel2Layout.createSequentialGroup()
													.addGap(40)
													.addComponent(lblFirmat3g))
												.addComponent(jLabel27, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)))
									.addGap(44))
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addComponent(jLabel3)
									.addGap(335)))))
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
						.addComponent(lblEmailExist))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPass)
						.addComponent(jLabel23)
						.addComponent(txtPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblConfirmPass)
							.addComponent(txtConfirmPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(jLabel24))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStates)
						.addComponent(cbxStates, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel25, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
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
					.addGap(18)
					.addComponent(btnConfirm)
					.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBack)
						.addComponent(lblFirmat3g))
					.addGap(15))
		);
		setLayout(jPanel2Layout);
	}

	private void btnConfirmMousePressed(java.awt.event.MouseEvent evt) {
		boolean ready = validateInput();
		if (!ready) {
			return;
		}
		User user = new User(
			txtName.getText(),
			txtSurname.getText(),
			txtEmail.getText(),
			new String(txtPass.getPassword()),
			cbxStates.getSelectedItem().toString(),
			txtTown.getText(),
			txtStreet.getText(),
			Integer.parseInt(txtNumber.getText()),
			Integer.parseInt(txtCP.getText()),
			txtPhone.getText(),
			String.format(
				"%s-%s-%s-%s",
				txtCard1.getText(),
				txtCard2.getText(),
				txtCard3.getText(),
				txtCard4.getText()),
			txtSecureCode.getText()
		);
		try {
			Database.getUserDao().createIfNotExists(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(this, "         Usuario creado      \n Gracias por elegir CookBooks");
		lblEmailExist.setText("*");
		updateTxt();
		mainWindow.goHome();
	}

	private void btnBackMousePressed(java.awt.event.MouseEvent evt) {
		mainWindow.goPrevious();
	}

	private void updateTxt() {
		txtName.setText("");
		txtSurname.setText("");
		txtEmail.setText("");
		txtTown.setText("");
		txtStreet.setText("");
		txtNumber.setText("");
		txtFloor.setText("");
		txtDepto.setText("");
		txtCP.setText("");
		txtPhone.setText("");
		txtCard1.setText("");
		txtCard2.setText("");
		txtCard3.setText("");
		txtCard4.setText("");
		txtSecureCode.setText("");
		txtConfirmPass.setText("");
		txtPass.setText("");
		cbxStates.getModel().setSelectedItem("Seleccionar Provincia");
	}
	
	private boolean validateInput() {
		String password = new String(txtPass.getPassword());
		String passwordValidator = new String(txtConfirmPass.getPassword());
		boolean correctName = FieldValidator.isAlpha(txtName.getText());
		boolean correctSurname = FieldValidator.isAlpha(txtSurname.getText());
		boolean correctEmail = FieldValidator.isEmail(txtEmail.getText());
		boolean correctPass = ((password.equals(passwordValidator)) && (!password.isEmpty()));
		boolean correctState = (FieldValidator.isAlpha(cbxStates.getSelectedItem().toString()) && (!cbxStates.getSelectedItem().toString().equals("Seleccionar Provincia")));
		boolean correctTown = FieldValidator.isAlpha(txtTown.getText());
		boolean correctStreet = FieldValidator.isAlpha(txtStreet.getText());
		boolean correctNumber = FieldValidator.isNumberInteger(txtNumber.getText());
		boolean correctCP = FieldValidator.isNumberInteger(txtCP.getText());
		boolean correctPhone = FieldValidator.isPhone(txtPhone.getText());
		boolean correctCreditCardNumber = FieldValidator.isCreditCardNumber(String.format("%s%s%s%s",txtCard1.getText(), txtCard2.getText(), txtCard3.getText(),txtCard4.getText()));
		boolean correctCreditCardCode = FieldValidator.isCreditCardCode(txtSecureCode.getText());
		//----------------------------------------------------------------
		if (!correctName) {
			System.out.println("txtName failed validation");
			txtName.setBackground(Color.RED);
		}
		else {
			txtName.setBackground(Color.WHITE);
		}
		//----------------------------------------------------------------
		if (!correctSurname) {
			System.out.println("txtSurname failed validation");
			txtSurname.setBackground(Color.RED);
		}
		else {
			txtSurname.setBackground(Color.WHITE);
		}
		//---------------------------------------------------------------
		if (!correctEmail) {
			System.out.println("txtEmail failed validation");
			txtEmail.setBackground(Color.RED);
		} else {
			txtEmail.setBackground(Color.WHITE);
			for (User user : Database.getUserDao()) {
				if (user.getEmail().equals(txtEmail.getText())) {
					System.out.println("email exist!");
					txtEmail.setBackground(Color.RED);
					lblEmailExist.setText("Usuario existente!");
					correctEmail = false;
				}
			}
		}
		//---------------------------------------------------------------
		if (!correctPass) {
			System.out.println("txtPass failed validation");
			txtPass.setBackground(Color.RED);
			txtConfirmPass.setBackground(Color.RED);
		}
		else {
			txtPass.setBackground(Color.WHITE);
			txtConfirmPass.setBackground(Color.WHITE);			
		}
		//---------------------------------------------------------------
		if (!correctState) {
			System.out.println("cbxStates failed validation");
			cbxStates.setBackground(Color.RED);
		}
		else {
			cbxStates.setBackground(Color.WHITE);
		}
		//---------------------------------------------------------------
		if (!correctTown) {
			System.out.println("txtTown failed validation");
			txtTown.setBackground(Color.RED);
		}
		else {
			txtTown.setBackground(Color.WHITE);
		}
		//---------------------------------------------------------------
		if (!correctStreet) {
			System.out.println("txtStreet failed validation");
			txtStreet.setBackground(Color.RED);
		}
		else {
			txtStreet.setBackground(Color.WHITE);
		}
		//---------------------------------------------------------------
		if (!correctNumber) {
			System.out.println("txtNumber failed validation");
			txtNumber.setBackground(Color.RED);
		}
		else {
			txtNumber.setBackground(Color.WHITE);
		}
		//---------------------------------------------------------------
		if (!correctCP) {
			System.out.println("txtCP failed validation");
			txtCP.setBackground(Color.RED);
		}
		else {
			txtCP.setBackground(Color.WHITE);
		}
		//---------------------------------------------------------------
		if (!correctPhone) {
			System.out.println("txtPhone failed validation");
			txtPhone.setBackground(Color.RED);
		}
		else {
			txtPhone.setBackground(Color.WHITE);
		}
		//---------------------------------------------------------------
		if (!correctCreditCardNumber) {
			System.out.println("txtCard# failed validation");
			txtCard1.setBackground(Color.RED);
			txtCard2.setBackground(Color.RED);
			txtCard3.setBackground(Color.RED);
			txtCard4.setBackground(Color.RED);
		}
		else {
			txtCard1.setBackground(Color.WHITE);
			txtCard2.setBackground(Color.WHITE);
			txtCard3.setBackground(Color.WHITE);
			txtCard4.setBackground(Color.WHITE);			
		}
		//---------------------------------------------------------------
		if (!correctCreditCardCode) {
			System.out.println("txtSecureCore failed validation");
			txtSecureCode.setBackground(Color.RED);
		}
		else {
			txtSecureCode.setBackground(Color.WHITE);
		}
		//---------------------------------------------------------------
		if ((correctName) && (correctSurname) && (correctEmail) && (correctPass) && (correctState) 
				&& (correctTown) && (correctStreet) && (correctNumber) && (correctCP) && (correctPhone) 
						&& (correctCreditCardNumber) && (correctCreditCardCode)){
			return true;
		}
		else {
			return false;
		}
	}
}
