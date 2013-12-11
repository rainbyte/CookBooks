package com.t3g.cookbooks.gui.panel.body.user;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.t3g.cookbooks.db.Database;
import com.t3g.cookbooks.db.entities.User;
import com.t3g.cookbooks.gui.abstraction.MainWindowLogic;
import com.t3g.cookbooks.gui.abstraction.PanelBody;
import com.t3g.cookbooks.session.SessionManager;
import com.t3g.cookbooks.util.FieldValidator;

public class MyAccount extends PanelBody {
	private static final long serialVersionUID = 1L;

	private JButton btnBack, btnConfirm, btnConfirmPass;
	private JComboBox<String> cbxStates;
	private JLabel jLabel2, jLabel23, jLabel24, jLabel25, jLabel26, jLabel27,
			jLabel29, jLabel3, jLabel30, jLabel31, jLabel32, jLabel33, jLabel4, jlabel35, jlabel36, jlabel37, jlabel38;;
	private JSeparator jSeparator1;
	private JLabel lblCP, lblCard, lblDepto, lblFirmat3g, lblFloor,
			lblNumber, lblPhone, lblSecureCode, lblStates, 
			lblStreet, lblTown,lblSurname ,lblEmail ,lblName, lblActualPass, lblNewPass; ;
	private JTextField txtCP, txtCard1, txtCard2, txtCard3, txtCard4, 
			txtDepto, txtFloor, txtNumber, txtPhone,
			txtSecureCode, txtStreet, txtTown, txtSurname, txtName, txtEmail; 
	private JPasswordField txtNewPass, txtActualPass, txtConfirmPass;

	public MyAccount(MainWindowLogic mainWindow) {
		super(mainWindow);
	}

	protected void initialize() {
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
		txtActualPass = new JPasswordField();
		txtNewPass = new JPasswordField();
		txtConfirmPass = new JPasswordField();
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

		btnBack.setBackground(new java.awt.Color(255, 0, 0));
		btnBack.setText("VOLVER ATRAS");
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
		
		btnConfirmPass = new JButton();
		btnConfirmPass.setText("CONFIRMAR");
		btnConfirmPass.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				btnConfirmPassMousePressed(evt);
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

		//---------------------------------------------------
		txtName.setText(SessionManager.getUser().getName());
		txtSurname.setText(SessionManager.getUser().getSurname());
		txtEmail.setText(SessionManager.getUser().getEmail());
		txtTown.setText(SessionManager.getUser().getCity());
		txtStreet.setText(SessionManager.getUser().getStreet());
		txtNumber.setText(String.format("%s",SessionManager.getUser().getNro()));
		txtFloor.setText(String.format("%s",SessionManager.getUser().getFloor()));
		txtDepto.setText(String.format("%s",SessionManager.getUser().getDept()));
		txtCP.setText(String.format("%s",SessionManager.getUser().getPostalCode()));
		txtPhone.setText(String.format("%s",SessionManager.getUser().getPhone()));
		String[] code = SessionManager.getUser().getCardNumber().split("-");
		txtCard1.setText(code[0]);
		txtCard2.setText(code[1]);
		txtCard3.setText(code[2]);
		txtCard4.setText(code[3]);
		cbxStates.getModel().setSelectedItem(SessionManager.getUser().getProvince());
		txtSecureCode.setText(String.format("%s",SessionManager.getUser().getCardCode()));
		//---------------------------------------------------
		
		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.TRAILING)
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
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGap(38)
							.addComponent(btnConfirmPass, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)))
					.addGap(129))
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
								.addComponent(jLabel27, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(txtCard1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtCard2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnConfirm)
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addComponent(txtCard3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtCard4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(jLabel31)))))
					.addGap(97))
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jLabel3)
							.addPreferredGap(ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
							.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblFirmat3g))
					.addGap(26))
				.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
					.addGap(18)
					.addComponent(btnBack)
					.addContainerGap(549, Short.MAX_VALUE))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
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
									.addComponent(jLabel24)
									.addComponent(btnConfirmPass)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtConfirmPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblConfirmPass)
								.addComponent(jlabel33))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(jlabel34)
							.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
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
								.addComponent(jLabel32)))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(141)
							.addComponent(jlabel35)
							.addPreferredGap(ComponentPlacement.RELATED, 311, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFirmat3g)
								.addComponent(btnConfirm))
							.addGap(35))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(btnBack)
							.addContainerGap())))
		);
		setLayout(jPanel2Layout);
	}

	private void btnConfirmMousePressed(java.awt.event.MouseEvent evt) {
		boolean ready = validateInput();
		if (!ready) {
			return;
		}
		SessionManager.getUser().setId(SessionManager.getUser().getId());
		SessionManager.getUser().setName(txtName.getText());
		SessionManager.getUser().setSurname(txtSurname.getText());
		SessionManager.getUser().setEmail(txtEmail.getText());
		SessionManager.getUser().setProvince(cbxStates.getSelectedItem().toString());
		SessionManager.getUser().setCity(txtTown.getText());
		SessionManager.getUser().setStreet(txtStreet.getText());
		SessionManager.getUser().setNro(Integer.parseInt(txtNumber.getText()));
		SessionManager.getUser().setPostalCode(Integer.parseInt(txtCP.getText()));
		SessionManager.getUser().setPhone(txtPhone.getText());
		SessionManager.getUser().setCardNumber(String.format(
				"%s-%s-%s-%s",
				txtCard1.getText(),
				txtCard2.getText(),
				txtCard3.getText(),
				txtCard4.getText()));
		SessionManager.getUser().setCardCode(txtSecureCode.getText());
		try {
			Database.getUserDao().update(SessionManager.getUser());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(this, "         Datos Modificados Correctamente      ");
		mainWindow.goHome();
	}
	
	private void btnConfirmPassMousePressed(java.awt.event.MouseEvent evt) {
		txtActualPass.setBackground(Color.WHITE);
		txtNewPass.setBackground(Color.WHITE);
		txtConfirmPass.setBackground(Color.WHITE);
		boolean correctPass = SessionManager.getUser().getPassword().equals(new String(txtActualPass.getPassword()));
		if (correctPass) {
			String password = new String(txtNewPass.getPassword());
			String passwordValidator = new String(txtConfirmPass.getPassword());
			boolean correctNewPass = ((password.equals(passwordValidator)) && (!password.isEmpty()));
			if (correctNewPass) {
				SessionManager.getUser().setPassword(password);
				try {
					Database.getUserDao().update(SessionManager.getUser());
				} catch (SQLException e) {
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(this, "         Contraseña cambiada             \n Inicie sesion nuevamente con su nueva contraseña");
				SessionManager.signOut();
				mainWindow.useHeaderUnregistered();
				mainWindow.goHome();
			}
			else {
				System.out.print("Wrong confirm new pass");
				txtNewPass.setBackground(Color.RED);
				txtConfirmPass.setBackground(Color.RED);
			}
		}
		else {
			System.out.print("Wrong actual pass");
			txtActualPass.setBackground(Color.RED);
		}
	}

	private void btnBackMousePressed(java.awt.event.MouseEvent evt) {
		mainWindow.goPrevious();
	}
	
	private boolean validateInput() {
		boolean correctName = FieldValidator.isAlpha(txtName.getText());
		boolean correctSurname = FieldValidator.isAlpha(txtSurname.getText());
		boolean correctEmail = FieldValidator.isEmail(txtEmail.getText());
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
				if (user.getEmail().equals(txtEmail.getText()) && (user.getId() != SessionManager.getUser().getId())) {
					System.out.println("email exist!");
					txtEmail.setBackground(Color.RED);
					JOptionPane.showMessageDialog(this, "    El email ingresado esta asociado a otra cuenta   ");
					correctEmail = false;
				}
			}
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
		if ((correctName) && (correctSurname) && (correctEmail) && (correctState) 
				&& (correctTown) && (correctStreet) && (correctNumber) && (correctCP) && (correctPhone) 
						&& (correctCreditCardNumber) && (correctCreditCardCode)){
			return true;
		}
		else {
			return false;
		}
	}
}
