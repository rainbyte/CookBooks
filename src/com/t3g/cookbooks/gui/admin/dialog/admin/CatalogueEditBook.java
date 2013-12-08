package com.t3g.cookbooks.gui.admin.dialog.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dialog;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.t3g.cookbooks.db.Database;
import com.t3g.cookbooks.db.entities.Author;
import com.t3g.cookbooks.db.entities.Book;
import com.t3g.cookbooks.db.entities.Country;
import com.t3g.cookbooks.db.entities.Language;
import com.t3g.cookbooks.db.entities.BookTag;
import com.t3g.cookbooks.db.entities.Tag;
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
import java.io.File;

public class CatalogueEditBook extends JDialog {
	private static final long serialVersionUID = 1L;

	private ParentWindow parent;
	// Variables declaration
	private JInternalFrame internalFrame;
	private JLabel lblTitle, lblAuthor, lblIsbn, lblPrice, lblTags, lblImage,
			lblPages, lblSummary, lblFirstPages;
	private JTextField txtTitle, txtIsbn, txtPrice, txtTags, txtPages;
	private JTextArea txtSummary, txtAditional;
	private JButton btnCancelar, btnConfirmar, btnManagementAuthor, btnImagePath;
	private JComboBox<String> cbxAuthor, cbxLanguage;
	private long id;
	private Book book;
	private String imagePath = "";

	public CatalogueEditBook(ParentWindow parent, long ID) {
		this.parent = parent;
		id = ID;
		getContentPane().setPreferredSize(new Dimension(518, 578));
		getContentPane().setBackground(new Color(153, 153, 255));
		setBackground(new Color(153, 153, 255));
		setTitle("Catalogo");
		initComponents();
	}
	
	/**
	 * @wbp.parser.constructor
	 */
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
		btnImagePath = new JButton("Seleccionar imagen ...");
		btnImagePath.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				loadImagePath();
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
		
		btnManagementAuthor = new JButton("Gestion de Autor");
		btnManagementAuthor.setBounds(362, 37, 130, 25);
		btnManagementAuthor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnManagementAuthorMousePressed();
			}
		});

		internalFrame.getContentPane().add(btnManagementAuthor);

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
		try {
			book = Database.getBookDao().queryForId(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		StringBuilder tagListBuilder = new StringBuilder();
		boolean firstBookTag = true;
		for (BookTag bookTag : Database.getBookTagDao()) {
			if (book.getId() == bookTag.getBook().getId()) {
				if (firstBookTag) {
					firstBookTag = false;
				} else {
					tagListBuilder.append(",");
				}
				tagListBuilder.append(bookTag.getTag().getName());
			}
		}
		txtTitle.setText(book.getTitle());
		txtPrice.setText(String.format("%s", book.getPrice()));
		cbxLanguage.setSelectedItem(String.format("%s",book.getLanguage().getName()));
		cbxAuthor.setSelectedItem(String.format("%s, %s", book.getAuthor().getSurname(), book.getAuthor().getName()));
		txtPages.setText(String.format("%s",book.getPages()));
		txtSummary.setText(book.getSummary());
		txtAditional.setText(book.getSample());	
		txtIsbn.setText(book.getIsbn());
		txtTags.setText(tagListBuilder.toString());
		btnImagePath.setBounds(171, 158, 253, 25);
		internalFrame.getContentPane().add(btnImagePath);
		
		JLabel label = new JLabel("*");
		label.setForeground(new Color(204, 0, 0));
		label.setBounds(423, 14, 23, 14);
		internalFrame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("*");
		label_1.setForeground(new Color(204, 0, 0));
		label_1.setBounds(493, 42, 17, 14);
		internalFrame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("*");
		label_2.setForeground(new Color(204, 0, 0));
		label_2.setBounds(273, 72, 17, 14);
		internalFrame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("*");
		label_3.setForeground(new Color(204, 0, 0));
		label_3.setBounds(213, 101, 17, 14);
		internalFrame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("*");
		label_4.setForeground(new Color(204, 0, 0));
		label_4.setBounds(434, 132, 18, 14);
		internalFrame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("*");
		label_5.setForeground(new Color(204, 0, 0));
		label_5.setBounds(434, 163, 23, 14);
		internalFrame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("*");
		label_6.setForeground(new Color(204, 0, 0));
		label_6.setBounds(213, 194, 17, 14);
		internalFrame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("*");
		label_7.setForeground(new Color(204, 0, 0));
		label_7.setBounds(332, 224, 17, 14);
		internalFrame.getContentPane().add(label_7);
		imagePath = book.getImagePath();
		addAuthors();
		pack();
	}

	private void btnManagementAuthorMousePressed () {
		JDialog dialog = new ManagementAuthor();
		dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
		dialog.setVisible(true);
		
		cbxAuthor.removeAllItems();
		cbxAuthor.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Seleccionar Autor" }));
		addAuthors();
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
		boolean correctPrice = FieldValidator.isNumberFloat(txtPrice.getText());
		boolean correctPages = FieldValidator.isNumberInteger(txtPages.getText());
		boolean correctTitle = !txtTitle.getText().isEmpty();
		boolean correctTags = !txtTags.getText().isEmpty();
		boolean correctIsbn = FieldValidator.isIsbn(txtIsbn.getText());
		boolean correctImagePath = FieldValidator.isImagePath(imagePath);
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

		if (!correctImagePath) {
			btnImagePath.setBackground(Color.RED);
		} else {
			btnImagePath.setBackground(Color.WHITE);
		}
		// -------------------------------------------
		if (!correctIsbn) {
			txtIsbn.setBackground(Color.RED);
		} else {
			txtIsbn.setBackground(Color.WHITE);
			for (Book book2 : Database.getBookDao()) {
				if (book2.getIsbn().equals(txtIsbn.getText()) && (book2.getId() != book.getId())){
						txtIsbn.setBackground(Color.RED);
						correctIsbn = false;
						JOptionPane.showMessageDialog(this, "ISBN ya existente en la Base de Datos");
				}
			}
		}
		// --------------------------------------------
		if ((correctPages) && (correctPrice) && (correctTitle) && (correctTags) 
				&& (correctIsbn) && (correctAuthor) && (correctLanguage) && (correctImagePath)){
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
			book.setIsbn(txtIsbn.getText());
			book.setAuthor(selectAuthor);
			book.setImagePath(imagePath);
			book.setLanguage(selectLanguage);
			book.setPrice(Float.parseFloat(txtPrice.getText()));
			book.setPages(Integer.parseInt(txtPages.getText()));
			book.setTitle(txtTitle.getText());
			book.setSummary(txtSummary.getText());
			book.setSample(txtAditional.getText());
			
			System.out.printf("imagePath = %s\n", imagePath);
			//---------------------------------------------------
			try {
				Database.getBookDao().update(book);
			} catch (SQLException e) {
				e.printStackTrace();
			}	
			//---------------------------------------------------
			String[] arrStrTags = txtTags.getText().split(",");
			List<String> arrStrTagsNotAdd = new ArrayList<String>();
			System.out.printf("%s\n", arrStrTagsNotAdd);
			boolean delete = true;
			List<Long> deleteIds = new ArrayList<Long>();
			String notAddString = "";
			try {
				for (BookTag bookTag : Database.getBookTagDao()){
					delete = true;
					if (bookTag.getBook().getId() == (book.getId())){
						for (String strTag : arrStrTags) {
							if (strTag.equals(bookTag.getTag().getName())){
								delete = false;
								arrStrTagsNotAdd.add(strTag);
							}	
						}
						if (delete){
							deleteIds.add(bookTag.getId());
						}
					}
				}
				System.out.printf("%s\n", arrStrTagsNotAdd);
				//------------------------------------------------------
				for (Long ID : deleteIds) {
					Database.getBookTagDao().deleteById(ID);
				}
				//------------------------------------------------------
				for (String strTag2 : arrStrTags) {
					if (!arrStrTagsNotAdd.contains(strTag2)){
						Tag tag = new Tag(strTag2);
							List<Tag> res = Database.getTagDao().queryForMatching(tag);
							if (res.size() > 0) {
								tag.setId(res.get(0).getId());
							} else {
								Database.getTagDao().create(tag);
							}
							BookTag bookTag = new BookTag(book, tag);					
							Database.getBookTagDao().create(bookTag);
					}
				}
				//------------------------------------------------------
			} catch (SQLException e) {
				e.printStackTrace();			
			}		
			//---------------------------------------------------
			close();
		}
	}
	
	private void loadImagePath() {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(this);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			imagePath = file.getAbsolutePath();
		} else {
			System.out.println("File error");
		}

		System.out.println(imagePath);
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
