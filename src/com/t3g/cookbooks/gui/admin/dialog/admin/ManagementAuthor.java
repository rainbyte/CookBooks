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
import java.io.File;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import com.t3g.cookbooks.db.Database;
import com.t3g.cookbooks.db.entities.Author;
import com.t3g.cookbooks.db.entities.Book;
import com.t3g.cookbooks.db.entities.Country;
import com.t3g.cookbooks.db.entities.Language;
import com.t3g.cookbooks.gui.ParentWindow;
import com.t3g.cookbooks.gui.ParentWindowDummy;
import com.t3g.cookbooks.util.FieldValidator;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ManagementAuthor extends JDialog {
	private static final long serialVersionUID = 1L;

	private ParentWindow parent;

	// Variables declaration
	private JInternalFrame internalFrame;
	private JButton btnCancel, btnAddAuthor, btnDeleteAuthor, btnEditAuthor;

	private JTable tableAuthors;
	private DefaultTableModel tableAuthorsModel;

	public ManagementAuthor() {

		getContentPane().setBackground(new Color(153, 153, 255));
		setBackground(new Color(153, 153, 255));
		getContentPane().setPreferredSize(new Dimension(700, 450));
		setTitle("Catalogo");
		initComponents();
		updateTableModel();
		
	}

	private void initComponents() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		internalFrame = new javax.swing.JInternalFrame();
		internalFrame.getContentPane().setBackground(new Color(153, 153, 255));
		internalFrame.setBounds(0, 0, 700, 450);
		btnCancel = new JButton("CANCELAR");
		btnCancel.setBackground(Color.RED);
		btnCancel.setBounds(10, 390, 105, 23);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionCancel();
			}
		});

		internalFrame.setBackground(new Color(153, 153, 255));
		internalFrame.setTitle("Gestion de Autor");
		internalFrame.setCursor(new java.awt.Cursor(
				java.awt.Cursor.DEFAULT_CURSOR));
		internalFrame.setName("Alta"); // NOI18N
		internalFrame.setVisible(true);
		getContentPane().setLayout(null);
		internalFrame.getContentPane().setLayout(null);
		internalFrame.getContentPane().add(btnCancel);
		
		JScrollPane scrollPaneAuthors = new JScrollPane();
		scrollPaneAuthors.setBounds(10, 43, 664, 343);
		tableAuthors = new JTable();
		scrollPaneAuthors.setViewportView(tableAuthors);
		internalFrame.getContentPane().add(scrollPaneAuthors);
		
		btnAddAuthor = new JButton("Agregar Autor");
		btnAddAuthor.setBounds(10, 11, 175, 23);
		internalFrame.getContentPane().add(btnAddAuthor);
		
		btnDeleteAuthor = new JButton("Eliminar");
		btnDeleteAuthor.setBounds(585, 11, 89, 23);
		internalFrame.getContentPane().add(btnDeleteAuthor);
		
		btnEditAuthor = new JButton("Editar");
		btnEditAuthor.setBounds(486, 11, 89, 23);
		internalFrame.getContentPane().add(btnEditAuthor);
		getContentPane().add(internalFrame);
		pack();
	}

	private void actionCancel() {
		close();
	}

	private void close() {
		this.dispose();
	}
	
	private void updateTableModel() {
		tableAuthorsModel = new DefaultTableModel();
		tableAuthorsModel.addColumn("Id");
		tableAuthorsModel.addColumn("Apellido");
		tableAuthorsModel.addColumn("Nombre");
		tableAuthorsModel.addColumn("Pais");
		tableAuthorsModel.addColumn("Nacimiento");
		
		//----
		System.out.printf("Hola");
		//----
		Country country = null;
		long id;
		for (Author author : Database.getAuthorDao()) {
			id = author.getCountry().getId();
			try {
				country = Database.getCountryDao().queryForId(id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			Object[] rowData = new Object[] {
				author.getId(),
				author.getSurname(),
				author.getName(),
				country.getName(),
				String.format("%s,", author.getBirthdate()),
			};
			tableAuthorsModel.addRow(rowData);
		}

		tableAuthors.setModel(tableAuthorsModel);

		/*tableAuthors.getColumnModel().getColumn(1).setMinWidth(250);
		tableAuthors.getColumnModel().getColumn(3).setMaxWidth(50);
		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment( JLabel.RIGHT );
		tableAuthors.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);*/
		
		// Hide Id column
		tableAuthors.removeColumn(tableAuthors.getColumnModel().getColumn(0));
	}

	public void update() {
		updateTableModel();
	}
	/**
	 * Launch the dialog standalone.
	 */
	public static void main(String args[]) {
		/* Create and display the form */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ManagementAuthor();
			}
		});
	}
}
