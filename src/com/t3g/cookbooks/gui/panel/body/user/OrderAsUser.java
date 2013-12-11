package com.t3g.cookbooks.gui.panel.body.user;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import com.t3g.cookbooks.db.Database;
import com.t3g.cookbooks.db.entities.Purchase;
import com.t3g.cookbooks.db.entities.BookTag;
import com.t3g.cookbooks.gui.ParentWindow;
import com.t3g.cookbooks.gui.abstraction.MainWindowLogic;
import com.t3g.cookbooks.gui.abstraction.PanelBody;
import com.t3g.cookbooks.session.SessionManager;

public class OrderAsUser extends PanelBody implements ParentWindow {
	private static final long serialVersionUID = 1L;

	private JTable tableBookList;
	public static JFrame cancelarCompra;
	private DefaultTableModel tableBooksModel;

	public OrderAsUser(MainWindowLogic mainWindow) {
		super(mainWindow);
		
		updateTableModel();
	}

	protected void initialize() {

		setBackground(new java.awt.Color(153, 153, 255));
		setAutoscrolls(true);
		setName(""); // NOI18N
		setPreferredSize(new Dimension(732, 541));

		JScrollPane scrollPanelBookList = new JScrollPane();

		JLabel label = new JLabel("DESARROLLADO POR T3G");

		JButton btnBack = new JButton("Volver al inicio");
		btnBack.setBackground(new Color(255, 0, 0));
		btnBack.setForeground(new Color(0, 0, 0));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				this);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout
				.createParallelGroup(Alignment.TRAILING)
				.addGroup(
						jPanel2Layout.createSequentialGroup().addGap(342)
								.addComponent(btnBack).addGap(151)
								.addComponent(label)
								.addContainerGap(12, Short.MAX_VALUE))
				.addGroup(
						Alignment.LEADING,
						jPanel2Layout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(scrollPanelBookList,
										GroupLayout.DEFAULT_SIZE, 722,
										Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				Alignment.LEADING)
				.addGroup(
						jPanel2Layout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(scrollPanelBookList,
										GroupLayout.PREFERRED_SIZE, 489,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(
										jPanel2Layout
												.createParallelGroup(
														Alignment.BASELINE)
												.addComponent(label)
												.addComponent(btnBack))
								.addGap(21)));

		tableBookList = new JTable();
		tableBookList.setToolTipText("");
		scrollPanelBookList.setViewportView(tableBookList);
		setLayout(jPanel2Layout);
	}

	private void updateTableModel() {
		tableBooksModel = new DefaultTableModel();
		tableBooksModel.addColumn("Id");
		tableBooksModel.addColumn("ISBN");
		tableBooksModel.addColumn("Libro");
		tableBooksModel.addColumn("Categoria");
		tableBooksModel.addColumn("Precio");
		tableBooksModel.addColumn("Estado");
		
		for (Purchase purchase : Database.getPurchaseDao()) {
			if (purchase.getUser().getId() == SessionManager.getUser().getId()){
				StringBuilder tagListBuilder = new StringBuilder();
				boolean firstBookTag = true;
				for (BookTag bookTag : Database.getBookTagDao()) {
					if (purchase.getBook().getId() == bookTag.getBook().getId()) {
						if (firstBookTag) {
							firstBookTag = false;
						} else {
							tagListBuilder.append(",");
						}
						tagListBuilder.append(bookTag.getTag().getName());
					}
				}
				
				Object[] rowData = new Object[] {
						purchase.getId(),
						purchase.getBook().getIsbn(),
						purchase.getBook().getTitle(),
						tagListBuilder.toString(),
						purchase.getBook().getPrice(),
						purchase.getStatus()
				};
				tableBooksModel.addRow(rowData);
			}
		}

		tableBookList.setModel(tableBooksModel);
		tableBookList.getColumnModel().getColumn(1).setMinWidth(90);
		tableBookList.getColumnModel().getColumn(2).setMinWidth(300);
		tableBookList.getColumnModel().getColumn(3).setMinWidth(200);
		tableBookList.getColumnModel().getColumn(4).setMinWidth(30);
		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment( JLabel.RIGHT );
		tableBookList.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
		// Hide Id column
		tableBookList.removeColumn(tableBookList.getColumnModel().getColumn(0));
	}

	public void update() {
		updateTableModel();
	}
}
