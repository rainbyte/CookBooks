package com.t3g.cookbooks.gui.panel.body;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import com.t3g.cookbooks.db.Database;
import com.t3g.cookbooks.db.entities.Book;
import com.t3g.cookbooks.gui.ParentWindow;
import com.t3g.cookbooks.gui.abstraction.DataWindow;
import com.t3g.cookbooks.gui.abstraction.MainWindowLogic;
import com.t3g.cookbooks.gui.abstraction.PanelBody;
import com.t3g.cookbooks.gui.admin.dialog.user.BuyList;
import com.t3g.cookbooks.gui.admin.dialog.user.CancelPurchase;
import com.t3g.cookbooks.resources.Resources;

public class Home extends PanelBody implements ParentWindow, DataWindow {
	private static final long serialVersionUID = 1L;

	private JComboBox<String> comboBoxSelectTheme;
	private JTable tableBookList;
	private JTable tableBuyList;
	private JTable tablePurchaces;
	private DefaultTableModel tableBooksModel;

	public Home(MainWindowLogic mainWindow) {
		super(mainWindow);
		updateTableModel();
	}

	protected void initialize() {

		setBackground(new java.awt.Color(153, 153, 255));
		setAutoscrolls(true);
		setName(""); // NOI18N
		setPreferredSize(new Dimension(732, 541));

		comboBoxSelectTheme = new JComboBox<String>();
		comboBoxSelectTheme.setBounds(172, 219, 150, 25);
		comboBoxSelectTheme
				.setModel(new javax.swing.DefaultComboBoxModel<String>(
						new String[] { "Seleccionar Tema: (click aqui)",
								"Comida Arabe", "Comida Judia",
								"Comida Oriental", "Comida Espa�ola",
								"Comida Peruana", "Vegetariano", "Parilladas",
								"Postres", "Otro" }));
		comboBoxSelectTheme.setEditable(true);

		JScrollPane scrollPanelBookList = new JScrollPane();

		JLabel lblCarrito = new JLabel("");
		lblCarrito.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				JDialog dialog = new BuyList();
				dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
				dialog.setVisible(true);
			}
		});
		lblCarrito.setIcon(Resources.getIconCarrito());

		JScrollPane scrollPanelBuyList = new JScrollPane(); // Lista de libros
															// agregados al
															// carrito

		JButton btnBuy = new JButton("");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBuy.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Accion del boton comprar, para confirmar lo añadido al
				// carrito
			}
		});
		btnBuy.setBackground(new Color(153, 153, 255));
		btnBuy.setIcon(Resources.getIconBuy());

		JButton btnNotBuy = new JButton("");
		btnNotBuy.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnNotBuyMousePressed();
			}
		});
		
		btnNotBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNotBuy.setBackground(new Color(153, 153, 255));
		btnNotBuy.setIcon(Resources.getIconNotBuy());

		JScrollPane scrollPanelPurchaces = new JScrollPane();

		JLabel label = new JLabel("DESARROLLADO POR T3G");

		JButton btnInfo = new JButton("Ver Info");
		btnInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Muestra la informacion del libro seleccionado de la
				// tabla
			}
		});
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnInfo.setBackground(UIManager.getColor("Button.background"));

		JButton btnPreView = new JButton("Hojear");
		btnPreView.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Muestra las primas "imagenes" del libro, hojeado
			}
		});
		btnPreView.setBackground(UIManager.getColor("Button.background"));

		JButton btnAdd = new JButton("Agregar al carrito");
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Agregar a la lista del carrito, el libro seleccionado en
				// la tabla
			}
		});
		btnAdd.setBackground(UIManager.getColor("Button.background"));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(comboBoxSelectTheme, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnInfo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnPreView)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAdd))
						.addComponent(scrollPanelBookList))
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addGap(31)
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnNotBuy, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnBuy, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addGap(18)
									.addComponent(lblCarrito))
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addGap(7)
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(scrollPanelBuyList, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
										.addComponent(scrollPanelPurchaces, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))))
							.addGap(88))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addContainerGap())))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(lblCarrito)
							.addGap(11)
							.addComponent(scrollPanelBuyList, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
							.addGap(1)
							.addComponent(btnBuy, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNotBuy, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPanelPurchaces, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label)
							.addContainerGap())
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBoxSelectTheme, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnInfo)
								.addComponent(btnPreView)
								.addComponent(btnAdd))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPanelBookList, GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))))
		);
		
		tablePurchaces = new JTable();
		tablePurchaces.setModel(new DefaultTableModel(new Object[][] {
			// TODO Precio y nombre de la ultima compra
			{ "Compra 5", null }, { null, null },
			// TODO Precio y nombre de la compra 4
			{ "Compra 4", null }, { null, null },
			// TODO Precio y nombre de la compra 3
			{ "Compra 3", null }, { null, null },
			// TODO Precio y nombre de la compra 2
			{ "Compra 2", null }, { null, null },
			// TODO Precio y nombre de la compra 1
			{ "Compra 1", null }, { null, null },
		}, new String[] { "Nombre", "Precio" }));
		scrollPanelPurchaces.setColumnHeaderView(tablePurchaces);

		//TODO las compras en el carrito, tienen que ser una estructura dinamica,
			// y no estar guardadas en memoria
		tableBuyList = new JTable();
		tableBuyList.setModel(new DefaultTableModel(
			new Object[][] {
				{"Hola", "J"},
				{"Juli", "g"},
			},
			new String[] {
				"Mi compra actual (nombre)", "Valor ($)"
			}
		));
		scrollPanelBuyList.setViewportView(tableBuyList);
		
		
		
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
	
	private void btnNotBuyMousePressed() {
		JDialog dialog = new CancelPurchase(this);
		dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
		dialog.setVisible(true);
	}
	
	private void updateTableModel() {
		tableBooksModel = new DefaultTableModel();
		tableBooksModel.addColumn("Id");
		tableBooksModel.addColumn("Titulo");
		tableBooksModel.addColumn("Autor");
		tableBooksModel.addColumn("Precio");
		tableBooksModel.addColumn("Categorias");
		tableBooksModel.addColumn("ISBN");

		for (Book book : Database.getBookDao()) {
			Object[] rowData = new Object[] {
				book.getId(),
				book.getTitle(),
				String.format("%s, %s", book.getAuthor().getSurname(), book.getAuthor().getName()),
				book.getPrice(),
				"???",	// TODO (Alvaro) add categories support
				book.getIsbn()
			};
			
			tableBooksModel.addRow(rowData);
		}

		tableBookList.setModel(tableBooksModel);
		
		tableBookList.getColumnModel().getColumn(1).setMinWidth(200);
		tableBookList.getColumnModel().getColumn(3).setMaxWidth(50);
		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment( JLabel.RIGHT );
		tableBookList.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
		
		// Hide Id column
		tableBookList.removeColumn(tableBookList.getColumnModel().getColumn(0));
	}

	public void update() {
		updateTableModel();
	}

	@Override
	public void deleteData() {
		int rowCount =	tableBuyList.getModel().getRowCount();
		for (int i=rowCount-1; i >= 0; i--) {
			((DefaultTableModel) tableBuyList.getModel()).removeRow(i);
		}
	}
}
