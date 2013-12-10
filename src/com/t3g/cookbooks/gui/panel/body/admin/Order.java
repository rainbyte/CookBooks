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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import com.t3g.cookbooks.db.Database;
import com.t3g.cookbooks.db.entities.BookTag;
import com.t3g.cookbooks.db.entities.Purchase;
import com.t3g.cookbooks.gui.ParentWindow;
import com.t3g.cookbooks.gui.abstraction.MainWindowLogic;
import com.t3g.cookbooks.gui.abstraction.PanelBody;
import com.t3g.cookbooks.gui.admin.dialog.admin.DataOfOrder;
import com.t3g.cookbooks.gui.admin.dialog.admin.ModifyState;
import com.t3g.cookbooks.session.SessionManager;

public class Order extends PanelBody implements ParentWindow {
	private static final long serialVersionUID = 1L;

	private JTable tableBookList;
	private DefaultTableModel tableBooksModel;

	public Order(MainWindowLogic mainWindow) {
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
		
		JButton btnDataView = new JButton("Ver datos del pedido");
		btnDataView.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				JDialog dialog = new DataOfOrder();
				dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
				dialog.setVisible(true);
				// TODO: Al ser presionado, muestra los siiguientes datos de un pedido en el JDialog DataOfOrder:
				// Nombre, Direcci�n( Calle, Ciudad, Provinicia, CP), Tel�fono, libro solicitado e ISBN
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGap(342)
					.addComponent(btnBack)
					.addGap(151)
					.addComponent(label)
					.addContainerGap(12, Short.MAX_VALUE))
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap(512, Short.MAX_VALUE)
					.addComponent(btnDataView)
					.addPreferredGap(ComponentPlacement.RELATED)
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
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnModifyState)
						.addComponent(btnDataView))
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
		
		for (Purchase purchase : Database.getPurchaseDao()) {
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
						String.format("%s %s",purchase.getUser().getSurname(), purchase.getUser().getName()),
						purchase.getBook().getIsbn(),
						purchase.getBook().getTitle(),
						tagListBuilder.toString(),
						purchase.getBook().getPrice(),
						purchase.getStatus()
				};
				tableBooksModel.addRow(rowData);
		}

		tableBookList.setModel(tableBooksModel);
		tableBookList.getColumnModel().getColumn(1).setMinWidth(90);
		tableBookList.getColumnModel().getColumn(2).setMinWidth(90);
		tableBookList.getColumnModel().getColumn(3).setMinWidth(200);
		tableBookList.getColumnModel().getColumn(5).setMinWidth(30);
		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment( JLabel.RIGHT );
		tableBookList.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
		// Hide Id column
		tableBookList.removeColumn(tableBookList.getColumnModel().getColumn(0));
	}

	public void update() {
		updateTableModel();
	}
}
