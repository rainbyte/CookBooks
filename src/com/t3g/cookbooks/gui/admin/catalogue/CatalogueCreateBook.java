package com.t3g.cookbooks.gui.admin.catalogue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
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

public class CatalogueCreateBook extends JFrame {
	private static final long serialVersionUID = 1L;

	// Variables declaration
	private JInternalFrame internalFrame;
	private JLabel lblTitle, lblAuthor, lblIsbn, lblPrice, lblTags, lblImage,
			lblPages, lblSummary, lblSample;
	private JTextField txtTitle, txtAuthor, txtIsbn, txtPrice, txtTags,
			txtImage, txtPages;
	private JTextArea txtSummary, txtAditional;
	private JButton btnSave, btnCancel;

	public CatalogueCreateBook() {
		setTitle("Catalogo");
		initComponents();
	}

	private void initComponents() {

		internalFrame = new javax.swing.JInternalFrame();
		
		lblTitle = new javax.swing.JLabel("Titulo");
		lblAuthor = new javax.swing.JLabel("Autor");
		lblIsbn = new javax.swing.JLabel("ISBN");
		lblPrice = new javax.swing.JLabel("Precio");
		lblTags = new javax.swing.JLabel("Categorias");
		lblImage = new javax.swing.JLabel("Imagen de Portada");
		lblPages = new javax.swing.JLabel("Cantidad de Paginas");
		lblSummary = new javax.swing.JLabel("Resumen");
		lblSample = new javax.swing.JLabel("Paginas de muestra");
		
		txtTitle = new javax.swing.JTextField("La Cocina Japonesa de Harumi");
		txtAuthor = new javax.swing.JTextField("Harumi Kurihara");
		txtIsbn = new javax.swing.JTextField("84-253-3882-4");
		txtPrice = new javax.swing.JTextField("300");
		txtImage = new javax.swing.JTextField("");
		txtPages = new javax.swing.JTextField("165");
		txtTags = new JTextField("Categorias");

		txtSummary = new JTextArea();
		txtAditional = new JTextArea();
		
		btnSave = new javax.swing.JButton("Aceptar");
		btnSave.setBackground(new java.awt.Color(255, 255, 255));
		btnSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				actionSave();
			}
		});
		btnCancel = new javax.swing.JButton("Cancelar");
		btnCancel.setBackground(new java.awt.Color(255, 255, 255));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionCancel();
			}
		});
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		internalFrame.setBackground(new java.awt.Color(153, 102, 255));
		internalFrame.setTitle("Cargar libro");
		internalFrame.setCursor(new java.awt.Cursor(
				java.awt.Cursor.DEFAULT_CURSOR));
		internalFrame.setName("Alta"); // NOI18N
		internalFrame.setVisible(true);

		javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(
				internalFrame.getContentPane());
		jInternalFrame1Layout
				.setHorizontalGroup(jInternalFrame1Layout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								jInternalFrame1Layout
										.createSequentialGroup()
										.addGap(26)
										.addGroup(
												jInternalFrame1Layout
														.createParallelGroup(
																Alignment.TRAILING)
														.addComponent(
																lblSample)
														.addComponent(lblPages)
														.addComponent(lblTitle)
														.addGroup(
																jInternalFrame1Layout
																		.createParallelGroup(
																				Alignment.LEADING)
																		.addGroup(
																				jInternalFrame1Layout
																						.createSequentialGroup()
																						.addGap(43)
																						.addComponent(
																								lblImage))
																		.addComponent(
																				lblSummary,
																				Alignment.TRAILING)
																		.addComponent(
																				lblTags,
																				Alignment.TRAILING)
																		.addComponent(
																				lblPrice,
																				Alignment.TRAILING)
																		.addComponent(
																				lblIsbn,
																				Alignment.TRAILING))
														.addComponent(lblAuthor))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												jInternalFrame1Layout
														.createParallelGroup(
																Alignment.LEADING,
																false)
														.addGroup(
																jInternalFrame1Layout
																		.createSequentialGroup()
																		.addComponent(
																				btnCancel)
																		.addPreferredGap(
																				ComponentPlacement.RELATED,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				btnSave))
														.addComponent(
																txtAditional)
														.addComponent(
																txtPages,
																Alignment.TRAILING)
														.addComponent(
																txtTitle,
																GroupLayout.DEFAULT_SIZE,
																280,
																Short.MAX_VALUE)
														.addComponent(txtAuthor)
														.addComponent(txtIsbn)
														.addComponent(txtPrice)
														.addComponent(txtImage)
														.addComponent(txtTags)
														.addComponent(
																txtSummary,
																Alignment.TRAILING))
										.addGap(55)));
		jInternalFrame1Layout
				.setVerticalGroup(jInternalFrame1Layout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								jInternalFrame1Layout
										.createSequentialGroup()
										.addGap(13)
										.addGroup(
												jInternalFrame1Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblTitle)
														.addComponent(
																txtTitle,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												jInternalFrame1Layout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(lblAuthor)
														.addComponent(
																txtAuthor,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												jInternalFrame1Layout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(lblIsbn)
														.addComponent(
																txtIsbn,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												jInternalFrame1Layout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(lblPrice)
														.addComponent(
																txtPrice,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGroup(
												jInternalFrame1Layout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																jInternalFrame1Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				lblTags))
														.addGroup(
																jInternalFrame1Layout
																		.createSequentialGroup()
																		.addGap(11)
																		.addComponent(
																				txtTags,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												jInternalFrame1Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblImage)
														.addComponent(
																txtImage,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												jInternalFrame1Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblPages)
														.addComponent(
																txtPages,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED, 17,
												Short.MAX_VALUE)
										.addGroup(
												jInternalFrame1Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblSummary)
														.addComponent(
																txtSummary,
																GroupLayout.PREFERRED_SIZE,
																109,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(
												jInternalFrame1Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblSample)
														.addComponent(
																txtAditional,
																GroupLayout.PREFERRED_SIZE,
																116,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(
												jInternalFrame1Layout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(btnCancel)
														.addComponent(btnSave))
										.addGap(132)));
		internalFrame.getContentPane().setLayout(jInternalFrame1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				internalFrame));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				internalFrame));

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
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CatalogueCreateBook().setVisible(true);
			}
		});
	}
	
	private void actionSave() {
		// TODO: add country label and textfield
		Book book = new Book(txtIsbn.getText(), txtTitle.getText(),
				Integer.parseInt(txtPages.getText()),
				Float.parseFloat(txtPrice.getText()),
				new Author(txtAuthor.getText(), "??", new Country("???")),
				new Language("Español"));

		book.setSummary(txtSummary.getText());
		book.setSample(txtAditional.getText());

		try {
			Database.getBookDao().create(book);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		System.out.printf("Save pressed, title is %s\n", txtTitle.getText());
	}

	private void actionCancel() {
		System.out.printf("Cancel pressed\n");
	}
}
