package com.t3g.cookbooks.gui.admin.catalogue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.t3g.cookbooks.db.Database;
import com.t3g.cookbooks.db.entities.Author;
import com.t3g.cookbooks.db.entities.Book;
import com.t3g.cookbooks.db.entities.Country;
import com.t3g.cookbooks.db.entities.Language;
import com.t3g.cookbooks.gui.ParentWindow;
import com.t3g.cookbooks.gui.ParentWindowDummy;
import com.t3g.cookbooks.util.FieldValidator;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;

public class CatalogueCreateBook extends JDialog {
	private static final long serialVersionUID = 1L;

	private ParentWindow parent;
	
	// Variables declaration
	private JInternalFrame internalFrame;
	private JLabel lblTitle, lblAuthor, lblIsbn, lblPrice, lblTags, lblImage,
			lblPages, lblSummary, lblSample, lblLanguage;
	private JTextField txtTitle, txtIsbn, txtPrice, txtTags,
			txtImage, txtPages;
	private JTextArea txtSummary, txtAditional;
	private JButton btnSave, btnCancel, btnCreateAuthor;
	private JComboBox cbxAuthor, cbxLanguage;
	
	public CatalogueCreateBook(ParentWindow parent) {
		this.parent = parent;
		
		getContentPane().setBackground(new Color(153, 153, 255));
		setBackground(new Color(153, 153, 255));
		getContentPane().setPreferredSize(new Dimension(518, 578));
		setTitle("Catalogo");
		initComponents();
	}

	private void initComponents() {

		internalFrame = new javax.swing.JInternalFrame();
		internalFrame.getContentPane().setBackground(new Color(153, 153, 255));
		internalFrame.setBounds(0, 0, 518, 578);
		
		lblTitle = new javax.swing.JLabel("Titulo");
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitle.setBounds(84, 14, 80, 14);
		lblAuthor = new javax.swing.JLabel("Autor");
		lblAuthor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAuthor.setBounds(85, 42, 80, 14);
		lblIsbn = new javax.swing.JLabel("ISBN");
		lblIsbn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIsbn.setBounds(85, 72, 80, 14);
		lblPrice = new javax.swing.JLabel("Precio");
		lblPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrice.setBounds(50, 101, 115, 14);
		lblTags = new javax.swing.JLabel("Categorias");
		lblTags.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTags.setBounds(36, 132, 130, 14);
		lblImage = new javax.swing.JLabel("Imagen de Portada");
		lblImage.setHorizontalAlignment(SwingConstants.RIGHT);
		lblImage.setBounds(8, 163, 157, 14);
		lblPages = new javax.swing.JLabel("Cantidad de Paginas");
		lblPages.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPages.setBounds(20, 194, 147, 14);
		lblSummary = new javax.swing.JLabel("Resumen");
		lblSummary.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSummary.setBounds(37, 259, 130, 14);
		lblSample = new javax.swing.JLabel("Primeras páginas");
		lblSample.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSample.setBounds(22, 386, 142, 14);
		
		txtTitle = new javax.swing.JTextField("La Cocina Japonesa de Harumi");
		txtTitle.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		txtTitle.setAlignmentX(Component.RIGHT_ALIGNMENT);
		txtTitle.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTitle.setBounds(171, 9, 242, 25);
		txtIsbn = new javax.swing.JTextField("84-253-3882-4");
		txtIsbn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtIsbn.setBounds(171, 66, 92, 25);
		txtPrice = new javax.swing.JTextField("300");
		txtPrice.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtPrice.setBounds(171, 96, 40, 25);
		txtImage = new javax.swing.JTextField("");
		txtImage.setBounds(171, 158, 253, 25);
		txtPages = new javax.swing.JTextField("165");
		txtPages.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtPages.setBounds(171, 189, 40, 25);
		txtTags = new JTextField("Categorias");
		txtTags.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTags.setBounds(171, 127, 253, 25);

		txtSummary = new JTextArea();
		txtSummary.setBounds(172, 254, 280, 109);
		txtAditional = new JTextArea();
		txtAditional.setBounds(172, 381, 280, 116);
		
		btnSave = new javax.swing.JButton("Confirmar");
		btnSave.setBounds(269, 515, 89, 23);
		btnSave.setBackground(new java.awt.Color(255, 255, 255));
		btnSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				actionSave();
			}
		});
		btnCancel = new javax.swing.JButton("CANCELAR");
		btnCancel.setBackground(Color.RED);
		btnCancel.setBounds(10, 515, 105, 23);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionCancel();
			}
		});
		
		btnCreateAuthor = new JButton("Nuevo Autor");
		btnCreateAuthor.setBounds(368, 37, 105, 25);
		internalFrame.getContentPane().add(btnCreateAuthor);
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		internalFrame.setBackground(new Color(153, 153, 255));
		internalFrame.setTitle("Cargar libro");
		internalFrame.setCursor(new java.awt.Cursor(
				java.awt.Cursor.DEFAULT_CURSOR));
		internalFrame.setName("Alta"); // NOI18N
		internalFrame.setVisible(true);
		getContentPane().setLayout(null);
		internalFrame.getContentPane().setLayout(null);
		internalFrame.getContentPane().add(lblSample);
		internalFrame.getContentPane().add(lblPages);
		internalFrame.getContentPane().add(lblTitle);
		internalFrame.getContentPane().add(lblImage);
		internalFrame.getContentPane().add(lblSummary);
		internalFrame.getContentPane().add(lblTags);
		internalFrame.getContentPane().add(lblPrice);
		internalFrame.getContentPane().add(lblIsbn);
		internalFrame.getContentPane().add(lblAuthor);
		internalFrame.getContentPane().add(txtPages);
		internalFrame.getContentPane().add(txtTitle);
		internalFrame.getContentPane().add(txtIsbn);
		internalFrame.getContentPane().add(txtPrice);
		internalFrame.getContentPane().add(txtImage);
		internalFrame.getContentPane().add(txtTags);
		internalFrame.getContentPane().add(txtAditional);
		internalFrame.getContentPane().add(txtSummary);
		internalFrame.getContentPane().add(btnCancel);
		internalFrame.getContentPane().add(btnSave);
		getContentPane().add(internalFrame);

		lblLanguage = new JLabel("Idioma");
		lblLanguage.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLanguage.setBounds(30, 223, 137, 14);
		internalFrame.getContentPane().add(lblLanguage);

		
		cbxLanguage = new JComboBox();
		cbxLanguage.setBounds(172, 219, 150, 25);
		cbxLanguage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Idioma"}));
		addLanguage();
		internalFrame.getContentPane().add(cbxLanguage);
		
		cbxAuthor = new JComboBox();
		cbxAuthor.setBounds(171, 37, 187, 25);
		cbxAuthor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Autor"}));
		internalFrame.getContentPane().add(cbxAuthor);
		addAuthors();
		pack();
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(
					CatalogueCreateBook.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(
					CatalogueCreateBook.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(
					CatalogueCreateBook.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(
					CatalogueCreateBook.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CatalogueCreateBook(new ParentWindowDummy()).setVisible(true);
			}
		});
	}
	
	private void actionSave() {
		// TODO: Faltaria implementar la forma en que almacena las categorias almacenadas
		boolean correctPrice = new FieldValidator().isNumberFloat(txtPrice.getText());
		boolean correctPages = new FieldValidator().isNumberInteger(txtPages.getText());
		boolean correctTitle = !txtTitle.getText().isEmpty();
		boolean correctTags = !txtTags.getText().isEmpty();
		boolean correctIsbn = new FieldValidator().isIsbn(txtIsbn.getText());
		Author selectAuthor = null;
		Language selectLanguage = null;
		//-------------------------------------------
		boolean correctLanguage;
		String selectLanguage_s = (String) cbxLanguage.getSelectedItem();
		if (selectLanguage_s == "Seleccionar Idioma") {
			correctLanguage =false;
			cbxLanguage.setBackground(Color.RED);
			} 
		else 
			{	
			correctLanguage =true;
			cbxLanguage.setBackground(Color.WHITE);
		}
		//--------------------------------------------
		boolean correctAuthor;
		String selectAuthor_s = (String) cbxAuthor.getSelectedItem();
		if (selectAuthor_s == "Seleccionar Autor") {
			correctAuthor =false;
			cbxAuthor.setBackground(Color.RED);
			} 
		else 
			{	
			correctAuthor =true;
			cbxAuthor.setBackground(Color.WHITE);
		}
		//--------------------------------------------
		if (!correctPages){
			txtPages.setBackground(Color.RED);
			}
		else
			{
			txtPages.setBackground(Color.WHITE);
		}
		//--------------------------------------------
		if (!correctPrice){
			txtPrice.setBackground(Color.RED);
			}
		else
			{
			txtPrice.setBackground(Color.WHITE);
		}
		//--------------------------------------------
		if (!correctTitle){
			txtTitle.setBackground(Color.RED);
			}
		else
			{
			txtTitle.setBackground(Color.WHITE);
		}
		//--------------------------------------------
		if (!correctTags){
			txtTags.setBackground(Color.RED);
			}
		else
			{
			txtTags.setBackground(Color.WHITE);
		}
		//--------------------------------------------
		if (!correctIsbn){
			txtIsbn.setBackground(Color.RED);
			}
		else
			{
			txtIsbn.setBackground(Color.WHITE);
		}
		//--------------------------------------------
		if ((correctPages) && (correctPrice) && (correctTitle) && (correctTags) && (correctIsbn) && (correctAuthor) && (correctLanguage)){
			String data;
			for (Author author : Database.getAuthorDao()) {
				data = String.format("%s, %s", author.getSurname(), author.getName());
				if (data.equals(selectAuthor_s)){
					selectAuthor = author;
				}
			}
			//---------------------------------------------------
			for (Language language : Database.getLanguageDao()) {
				data = String.format("%s", language.getName());
				if (data.equals(selectLanguage_s)){
					selectLanguage = language;
				}
			}
			//---------------------------------------------------
			// TODO: implement support for image_path.
			Book book = new Book(txtIsbn.getText(), txtTitle.getText(),
				Integer.parseInt(txtPages.getText()),
				Float.parseFloat(txtPrice.getText()),
				selectAuthor,
				selectLanguage,
				"???");

			book.setSummary(txtSummary.getText());
			book.setSample(txtAditional.getText());
			//---------------------------------------------------
			try {
				Database.getBookDao().create(book);
			} catch (SQLException ex) {
				ex.printStackTrace();
			}

			close();
		}
	}

	private void actionCancel() {
		close();
	}
	
	private void addAuthors(){
		String data;
		for (Author author : Database.getAuthorDao()) {
			data = String.format("%s, %s", author.getSurname(), author.getName());
			cbxAuthor.addItem(data);
		}
	}
	
	private void addLanguage(){
		String data;
		for (Language language : Database.getLanguageDao()) {
			data = String.format("%s",language.getName());
			cbxLanguage.addItem(data);
		}
	}
	
	private void close() {
		this.dispose();
		parent.update();
	}
}
