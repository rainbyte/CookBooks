package com.t3g.cookbooks.gui.panel.body.admin;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import com.t3g.cookbooks.gui.ParentWindow;
import com.t3g.cookbooks.gui.admin.dialog.admin.ModifyState;

public class Order extends JPanel implements ParentWindow {
	private static final long serialVersionUID = 1L;

	private JTable tableBookList;
	private DefaultTableModel tableBooksModel;

	public Order() {
		initialize();
		updateTableModel();
	}

	public void initialize() {

		setBackground(new java.awt.Color(153, 153, 255));
		setAutoscrolls(true);
		setName(""); // NOI18N
		setPreferredSize(new Dimension(732, 541));

		JScrollPane scrollPanelBookList = new JScrollPane();

		JLabel label = new JLabel("DESARROLLADO POR T3G");

		JButton btnModifyState = new JButton("Modificar estado");
		btnModifyState.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JDialog dialog = new ModifyState();
				dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
				dialog.setVisible(true);
			}
		});
		btnModifyState.setBackground(UIManager.getColor("Button.background"));

		JButton btnBack = new JButton("Volver al inicio");
		btnBack.setBackground(new Color(255, 0, 0));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGap(342)
					.addComponent(btnBack)
					.addGap(151)
					.addComponent(label)
					.addContainerGap(142, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
					.addContainerGap(603, Short.MAX_VALUE)
					.addComponent(btnModifyState)
					.addContainerGap())
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPanelBookList, GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnModifyState)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPanelBookList, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(btnBack))
					.addGap(21))
		);
		
		
		
        tableBookList = new JTable();
        tableBookList.setToolTipText("");
        /*tableBookList.setModel(new DefaultTableModel(
        	new Object[][] { //TODO Rellenar con los libros de la db
        	},
        	new String[] {
        		"Nombre", "ISBN", "Autor", "Precio", "Categoria"
        	}
        ) {
        	Class[] columnTypes = new Class[] {
        		String.class, Integer.class, String.class, Float.class, String.class, Object.class
        	};
        	public Class getColumnClass(int columnIndex) {
        		return columnTypes[columnIndex];
        	}
        });
        */
        
        scrollPanelBookList.setViewportView(tableBookList);
		setLayout(jPanel2Layout);
	}

	private void updateTableModel() {
		tableBooksModel = new DefaultTableModel();
		tableBooksModel.addColumn("Id");
		tableBooksModel.addColumn("Usuario");
		tableBooksModel.addColumn("ISBN");
		tableBooksModel.addColumn("Libro");
		tableBooksModel.addColumn("Categoria");
		tableBooksModel.addColumn("Precio");
		tableBooksModel.addColumn("Estado");
		
		//Logica para la base de datos de pedidos 
		/*for (Book book : Database.getBookDao()) {
			Object[] rowData = new Object[] {
				book.getId(),
				book.getTitle(),
				String.format("%s, %s", book.getAuthor().getSurname(), book.getAuthor().getName()),
				book.getPrice(),
				"???",	// TODO add categories support
				book.getIsbn()
			};
			
			tableBooksModel.addRow(rowData);
		
		}
		*/

		tableBookList.setModel(tableBooksModel);
		// Hide Id column
		tableBookList.removeColumn(tableBookList.getColumnModel().getColumn(0));
	}

	public void update() {
		updateTableModel();
	}
}
