package com.t3g.cookbooks.gui.panel.body;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BoxLayout;

import java.awt.GridLayout;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

import com.t3g.cookbooks.db.Database;
import com.t3g.cookbooks.db.entities.Book;
import com.t3g.cookbooks.gui.CancelPurchase;
import com.t3g.cookbooks.gui.ParentWindow;
import com.t3g.cookbooks.gui.admin.catalogue.CatalogueEditBook;
import com.t3g.cookbooks.resources.Resources;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;

import javax.swing.UIManager;

public class UserOrder extends JPanel implements ParentWindow  {
	private JPanel panel, panel_1, panel_5;
	private JTable tableBookList;
	public static JFrame cancelarCompra;
	private DefaultTableModel tableBooksModel;

	public UserOrder() {
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
		
		JButton btnBack = new JButton("Volver al inicio");
		btnBack.setBackground(new Color(255, 0, 0));
		btnBack.setForeground(new Color(0, 0, 0));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGap(342)
					.addComponent(btnBack)
					.addGap(151)
					.addComponent(label)
					.addContainerGap(12, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPanelBookList, GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPanelBookList, GroupLayout.PREFERRED_SIZE, 489, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(btnBack))
					.addGap(21))
		);
		
		
		
        tableBookList = new JTable();
        tableBookList.setToolTipText("");     
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
		
		//L�gica para la base de datos de pedidos 
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