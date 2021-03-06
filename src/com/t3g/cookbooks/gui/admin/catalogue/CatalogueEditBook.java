package com.t3g.cookbooks.gui.admin.catalogue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.t3g.cookbooks.db.Database;
import com.t3g.cookbooks.db.entities.Author;
import com.t3g.cookbooks.db.entities.Book;
import com.t3g.cookbooks.db.entities.Country;
import com.t3g.cookbooks.db.entities.Language;
import com.t3g.cookbooks.gui.ParentWindow;
import com.t3g.cookbooks.gui.ParentWindowDummy;
import com.t3g.cookbooks.util.FieldValidator;


import javax.swing.SwingConstants;
import javax.swing.JComboBox;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import java.awt.Rectangle;

public class CatalogueEditBook extends JDialog {
	private static final long serialVersionUID = 1L;

	private ParentWindow parent;
	// Variables declaration
	private JInternalFrame internalFrame;
	private JLabel lblTitle, lblAuthor, lblIsbn, lblPrice, lblTags, lblImage,
			lblPages, lblSummary, lblFirstPages;
	private JTextField txtTitle, txtIsbn, txtPrice, txtTags,
			txtImage, txtPages;
	private JTextArea txtSummary, txtAditional;
	private JButton btnCancelar;
	private JButton btnConfirmar;
	private JButton btnCreateAuthor;
	private JComboBox cbxAuthor, cbxLanguage;
	private int selectBook,i;
	private long id;

	public CatalogueEditBook(ParentWindow parent, int numBook) {
		this.parent = parent;
		selectBook = numBook;
		getContentPane().setPreferredSize(new Dimension(518, 578));
		getContentPane().setBackground(new Color(153, 153, 255));
		setBackground(new Color(153, 153, 255));
		setTitle("Catalogo");
		initComponents();
	}
	
	public CatalogueEditBook(ParentWindow parent) {
		this.parent = parent;
		getContentPane().setPreferredSize(new Dimension(518, 578));
		getContentPane().setBackground(new Color(153, 153, 255));
		setBackground(new Color(153, 153, 255));
		setTitle("Catalogo");
		initComponents();
	}

	private void initComponents() {

		internalFrame = new javax.swing.JInternalFrame();
		internalFrame.setResizable(true);
		internalFrame.getContentPane().setBackground(new Color(153, 153, 255));
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
		lblFirstPages = new javax.swing.JLabel("Primeras p\u00E1ginas");
		lblFirstPages.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstPages.setBounds(22, 386, 142, 14);
		
		txtTitle = new javax.swing.JTextField("");
		txtTitle.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		txtTitle.setAlignmentX(Component.RIGHT_ALIGNMENT);
		txtTitle.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTitle.setBounds(171, 9, 242, 25);
		txtIsbn = new javax.swing.JTextField("");
		txtIsbn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtIsbn.setBounds(171, 66, 92, 25);
		txtPrice = new javax.swing.JTextField("");
		txtPrice.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtPrice.setBounds(171, 96, 32, 25);
		txtImage = new javax.swing.JTextField("");
		txtImage.setBounds(171, 158, 253, 25);
		txtPages = new javax.swing.JTextField("");
		txtPages.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtPages.setBounds(171, 189, 32, 25);
		txtTags = new JTextField("Categorias");
		txtTags.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTags.setBounds(171, 127, 253, 25);

		txtSummary = new JTextArea();
		txtSummary.setBounds(172, 254, 280, 109);
		txtAditional = new JTextArea();
		txtAditional.setBounds(172, 381, 280, 116);
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		internalFrame.setBackground(new Color(153, 153, 255));
		internalFrame.setTitle("Editar libro");
		internalFrame.setCursor(new java.awt.Cursor(
				java.awt.Cursor.DEFAULT_CURSOR));
		internalFrame.setName("Alta"); // NOI18N
		internalFrame.setVisible(true);
		internalFrame.getContentPane().setLayout(null);
		internalFrame.getContentPane().add(lblFirstPages);
		internalFrame.getContentPane().add(lblPages);
		internalFrame.getContentPane().add(lblTitle);
		internalFrame.getContentPane().add(lblImage);
		internalFrame.getContentPane().add(lblSummary);
		internalFrame.getContentPane().add(lblTags);
		internalFrame.getContentPane().add(lblPrice);
		internalFrame.getContentPane().add(lblIsbn);
		internalFrame.getContentPane().add(lblAuthor);
		internalFrame.getContentPane().add(txtAditional);
		internalFrame.getContentPane().add(txtPages);
		internalFrame.getContentPane().add(txtTitle);
		internalFrame.getContentPane().add(txtIsbn);
		internalFrame.getContentPane().add(txtPrice);
		internalFrame.getContentPane().add(txtImage);
		internalFrame.getContentPane().add(txtTags);
		internalFrame.getContentPane().add(txtSummary);
		
		JLabel lblLanguage = new JLabel("Idioma");
		lblLanguage.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLanguage.setBounds(30, 223, 137, 14);
		internalFrame.getContentPane().add(lblLanguage);
		
		cbxLanguage = new JComboBox();
		cbxLanguage.setBounds(172, 219, 150, 25);
		cbxLanguage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Idioma"}));
		internalFrame.getContentPane().add(cbxLanguage);
		addLanguage();
		
		cbxAuthor = new JComboBox();
		cbxAuthor.setBounds(171, 37, 187, 25);
		cbxAuthor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Autor"}));
		internalFrame.getContentPane().add(cbxAuthor);
		addAuthors();
		
		btnCancelar = new JButton("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarMousePressed(evt);
            }
		});
		btnCancelar.setBackground(Color.RED);
		btnCancelar.setBounds(10, 515, 105, 23);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionCancel();
			}
		});
		internalFrame.getContentPane().add(btnCancelar);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				actionSave();
			}
		});
		btnConfirmar.setBounds(269, 515, 89, 23);
		internalFrame.getContentPane().add(btnConfirmar);
		
		btnCreateAuthor = new JButton("Nuevo Autor");
        btnCreateAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAuthorMousePressed(evt);
            }
		});
		btnCreateAuthor.setBounds(368, 37, 105, 25);
		internalFrame.getContentPane().add(btnCreateAuthor);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addComponent(internalFrame, GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addComponent(internalFrame, GroupLayout.PREFERRED_SIZE, 578, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(97, Short.MAX_VALUE))
		);
		getContentPane().setLayout(layout);
		//---------------------------------------------------
		i = 0;
		for (Book book : Database.getBookDao()) {
			if (selectBook == i ){
					txtTitle.setText(book.getTitle());
					txtPrice.setText(String.format("%s", book.getPrice()));
					cbxLanguage.setSelectedItem(String.format("%s",book.getLanguage().getName()));
					cbxAuthor.setSelectedItem(String.format("%s, %s", book.getAuthor().getSurname(), book.getAuthor().getName()));
					txtPages.setText(String.format("%s",book.getPages()));
					txtSummary.setText(book.getSummary());
					txtAditional.setText(book.getSample());	
					txtIsbn.setText(book.getIsbn());
					id = book.getId();
				}
				i++;
		}
		//txtPages.setText(String.format("%s", selectBook));
		pack();
	}
	
    private void btnCancelarMousePressed(ActionEvent evt) {
        // TODO Al presionar se debe cerrar la ventana de "Editar libro" y descartar los cambios
    }
    
    private void btnConfirmarMousePressed(ActionEvent evt) {
        // TODO Al presionar se deben validar los campos y, si son todos correctos, guardar la modificacion en la base de datos
    }
    
    private void btnCreateAuthorMousePressed(ActionEvent evt) {
        // TODO Al presionar se debe abrir la ventana de "Agregar Autor"
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
					CatalogueEditBook.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(
					CatalogueEditBook.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(
					CatalogueEditBook.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(
					CatalogueEditBook.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CatalogueEditBook(new ParentWindowDummy()).setVisible(true);
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
			try {
				Database.getBookDao().deleteById(id);
			} catch (SQLException e) {
				e.printStackTrace();
			}	
			Book book = new Book(txtIsbn.getText(), txtTitle.getText(),
				Integer.parseInt(txtPages.getText()),
				Float.parseFloat(txtPrice.getText()),
				selectAuthor,
				selectLanguage, "...");

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
