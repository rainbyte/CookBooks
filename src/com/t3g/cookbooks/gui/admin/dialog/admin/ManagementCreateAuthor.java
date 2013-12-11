package com.t3g.cookbooks.gui.admin.dialog.admin;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import com.t3g.cookbooks.db.Database;
import com.t3g.cookbooks.db.entities.Author;
import com.t3g.cookbooks.db.entities.Country;
import com.t3g.cookbooks.gui.ParentWindow;
import com.t3g.cookbooks.util.FieldValidator;

public class ManagementCreateAuthor extends JDialog {
	private static final long serialVersionUID = 1L;

	private ParentWindow parent;

	// Variables declaration
	private JInternalFrame internalFrame;
	private JLabel lblSurname, lblName, lblGender, lblSummary, lblLanguage;
	private JTextField txtSurname, txtGender, txtName, txtBirthDate;
	private JTextArea txtAbout;
	private JButton btnSave, btnCancel;
    private JComboBox<String> cbxCountry;
	
	private SimpleDateFormat dateFormat;
	private Date date;

	public ManagementCreateAuthor() {
		
		getContentPane().setBackground(new Color(153, 153, 255));
		setBackground(new Color(153, 153, 255));
		getContentPane().setPreferredSize(new Dimension(518, 432));
		setTitle("Catalogo");
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		internalFrame = new javax.swing.JInternalFrame();
		internalFrame.getContentPane().setBackground(new Color(153, 153, 255));
		internalFrame.setBounds(0, 0, 518, 433);

		lblSurname = new JLabel("Apellido");
		lblSurname.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSurname.setBounds(84, 16, 80, 14);
		lblName = new JLabel("Nombre");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(85, 46, 80, 14);
		lblGender = new JLabel("G\u00E9nero");
		lblGender.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGender.setBounds(50, 76, 115, 14);
		lblSummary = new JLabel("Informacion");
		lblSummary.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSummary.setBounds(37, 168, 130, 14);

		txtSurname = new JTextField("Mandici");
		txtSurname.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		txtSurname.setAlignmentX(Component.RIGHT_ALIGNMENT);
		txtSurname.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtSurname.setBounds(171, 9, 242, 25);
		txtGender = new JTextField("M");
		txtGender.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtGender.setBounds(171, 69, 40, 25);

		txtAbout = new JTextArea();
		txtAbout.setBounds(172, 163, 280, 200);

		btnSave = new JButton("Confirmar");
		btnSave.setBounds(257, 374, 89, 23);
		btnSave.setBackground(new java.awt.Color(255, 255, 255));
		btnSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				actionSave();
			}
		});
		btnCancel = new JButton("CANCELAR");
		btnCancel.setBackground(Color.RED);
		btnCancel.setBounds(10, 374, 105, 23);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionCancel();
			}
		});

		internalFrame.setBackground(new Color(153, 153, 255));
		internalFrame.setTitle("Cargar libro");
		internalFrame.setCursor(new java.awt.Cursor(
				java.awt.Cursor.DEFAULT_CURSOR));
		internalFrame.setName("Alta"); // NOI18N
		internalFrame.setVisible(true);
		getContentPane().setLayout(null);
		internalFrame.getContentPane().setLayout(null);
		internalFrame.getContentPane().add(lblSurname);
		internalFrame.getContentPane().add(lblSummary);
		internalFrame.getContentPane().add(lblGender);
		internalFrame.getContentPane().add(lblName);
		internalFrame.getContentPane().add(txtSurname);
		internalFrame.getContentPane().add(txtGender);
		internalFrame.getContentPane().add(txtAbout);
		internalFrame.getContentPane().add(btnCancel);
		internalFrame.getContentPane().add(btnSave);
		getContentPane().add(internalFrame);

		lblLanguage = new JLabel("Pa\u00EDs");
		lblLanguage.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLanguage.setBounds(27, 106, 137, 14);
		internalFrame.getContentPane().add(lblLanguage);
		
		JLabel label = new JLabel("*");
		label.setForeground(new Color(204, 0, 0));
		label.setBounds(423, 14, 15, 14);
		internalFrame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("*");
		label_1.setForeground(new Color(204, 0, 0));
		label_1.setBounds(423, 42, 15, 14);
		internalFrame.getContentPane().add(label_1);
		
		JLabel label_5 = new JLabel("*");
		label_5.setForeground(new Color(204, 0, 0));
		label_5.setBounds(331, 106, 15, 14);
		internalFrame.getContentPane().add(label_5);
		
		txtName = new JTextField("Gerardo");
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtName.setAlignmentY(1.0f);
		txtName.setAlignmentX(1.0f);
		txtName.setBounds(171, 39, 242, 25);
		internalFrame.getContentPane().add(txtName);
		
		cbxCountry = new JComboBox();
		cbxCountry.setBounds(171, 99, 150, 25);
		cbxCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Pa�s"}));
		internalFrame.getContentPane().add(cbxCountry);
		
		JLabel lblBirthdate = new JLabel("Fecha de Nacimiento");
		lblBirthdate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBirthdate.setBounds(27, 136, 137, 14);
		internalFrame.getContentPane().add(lblBirthdate);
		
		txtBirthDate = new JTextField("");
		txtBirthDate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtBirthDate.setBounds(171, 129, 150, 25);
		internalFrame.getContentPane().add(txtBirthDate);
		
		JLabel lblDateFormat = new JLabel("Ejemplo: 25-12-1956");
		lblDateFormat.setForeground(new Color(204, 0, 0));;
		lblDateFormat.setBounds(327, 129, 125, 25);
		internalFrame.getContentPane().add(lblDateFormat);
		addCountries();
		pack();
	}
	private void actionSave() {
		// TODO: Faltaria implementar la forma en que almacena las categorias
		// almacenadas
		boolean correctSurname = FieldValidator.isAlpha(txtSurname.getText());
		boolean correctName = FieldValidator.isAlpha(txtName.getText());
		boolean correctGender = FieldValidator.isGender(txtGender.getText());
		Country selectCountry = null;
		// -------------------------------------------
		boolean correctCountry;
		String selectCountry_s = (String) cbxCountry.getSelectedItem();
		if (selectCountry_s == "Seleccionar Pa�s") {
			correctCountry = false;
			cbxCountry.setBackground(Color.RED);
		} else {
			correctCountry = true;
			cbxCountry.setBackground(Color.WHITE);
		}
		// --------------------------------------------
		if (!correctSurname) {
			txtSurname.setBackground(Color.RED);
		} else {
			txtSurname.setBackground(Color.WHITE);
		}
		// --------------------------------------------
		if (!correctName) {
			txtName.setBackground(Color.RED);
		} else {
			txtName.setBackground(Color.WHITE);
		}
		// --------------------------------------------
		if (!correctGender) {
			txtGender.setBackground(Color.RED);
		} else {
			txtGender.setBackground(Color.WHITE);
		}
		// --------------------------------------------
		if ((correctCountry) && (correctSurname) && (correctName) && (correctGender)) {
			//----------------------------------------------------
			String data;
			// ---------------------------------------------------
			for (Country country : Database.getCountryDao()) {
				data = String.format("%s", country.getName());
				if (data.equals(selectCountry_s)) {
					selectCountry = country;
				}
			}
			//----------------------------------------------------
			dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			try {
				date = dateFormat.parse(txtBirthDate.getText());
			}   catch (Exception e) {
				date = null; //Si la fecha es mal ingresada, no se guarda nada.
				System.out.printf("Birthdate mal ingresada\n");
			}
			// ---------------------------------------------------
			Author author = new Author(
					txtName.getText(),
					txtSurname.getText(),
					selectCountry);

			author.setAbout(txtAbout.getText());
			author.setGender(txtGender.getText().charAt(0));
			author.setBirthdate(date); 
			// TODO: Revisar como se puede realizar el ingreso de la fecha de nacimiento (txt, calendario, etc)
			// ---------------------------------------------------
			try {
				Database.getAuthorDao().create(author);
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			close();
		}
	}

	private void actionCancel() {
		close();
	}

	private void addCountries() {
		String data;
		for (Country country : Database.getCountryDao()) {
			data = String.format("%s", country.getName());
			cbxCountry.addItem(data);
		}
	}

	private void close() {
		this.dispose();
	}
	
	/**
	 * Launch the dialog standalone.
	 */
	public static void main(String args[]) {
		/* Create and display the form */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ManagementCreateAuthor();
			}
		});
	}
}
