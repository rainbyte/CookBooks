package com.t3g.cookbooks.gui.panel.body;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
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

import com.t3g.cookbooks.gui.admin.catalogue.Home;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BodyHome extends JPanel {
	private JPanel panel, panel_1, panel_5;
	private JComboBox comboBoxSelectTheme;
	private JTable tableBookList;
	private JTable tableBuyList;
	private JTable tablePurchaces;

	public BodyHome() {
		initialize();
	}

	public void initialize() {

		setBackground(new java.awt.Color(153, 153, 255));
		setAutoscrolls(true);
		setName(""); // NOI18N
		setPreferredSize(new java.awt.Dimension(674, 500));
		
		comboBoxSelectTheme = new JComboBox();
		comboBoxSelectTheme.setBounds(172, 219, 150, 25);
		comboBoxSelectTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Tema: (click aqui)", "Comida Arabe","Comida Judia","Comida Oriental", "Comida Española","Comida Peruana","Vegetariano",  "Parilladas","Postres","Otro"}));
        comboBoxSelectTheme.setEditable(true);
		
		JScrollPane scrollPanelBookList = new JScrollPane();
		
		JLabel lblCarrito = new JLabel("");
		lblCarrito.setIcon(new ImageIcon(BodyHome.class.getResource("/com/t3g/cookbooks/resources/Carrito.png")));
		
		JScrollPane scrollPanelBuyList = new JScrollPane(); // Lista de libros agregados al carrito
		
		JButton btnBuy = new JButton("");
        btnBuy.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        btnBuy.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent arg0) {
        		//TODO Accion del boton comprar, para confirmar lo añadido al carrito
        	}
        });
        btnBuy.setBackground(new Color(153, 153, 255));
        btnBuy.setIcon(new ImageIcon(Home.class.getResource("/com/t3g/cookbooks/resources/IconBtnBuy.png")));
        
        JButton btnNotBuy = new JButton("");
        btnNotBuy.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent e) {
        		//TODO Accion del boton No comprar, cancelar lo añadido al carrito
        	}
        });
        btnNotBuy.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        btnNotBuy.setBackground(new Color(153, 153, 255));
        btnNotBuy.setIcon(new ImageIcon(Home.class.getResource("/com/t3g/cookbooks/resources/IconBtnNotBuy.png")));
		
		JScrollPane scrollPanelPurchaces = new JScrollPane();
		
		JLabel label = new JLabel("DESARROLLADO POR T3G");
		
		JButton btnInfo = new JButton("Ver Info");
		btnInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Muestra la informacion del libro seleccionado de la tabla
			}
		});
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnInfo.setBackground(new Color(153, 153, 255));
		
		JButton btnPreView = new JButton("Hojear");
		btnPreView.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Muestra las primas "imagenes" del libro, hojeado
			}
		});
		btnPreView.setBackground(new Color(153, 153, 255));
		
		JButton btnAdd = new JButton("Agregar al carrito");
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//TODO Agregar a la lista del carrito, el libro seleccionado en la tabla
			}
		});
		btnAdd.setBackground(new Color(153, 153, 255));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(comboBoxSelectTheme, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnInfo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnPreView)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAdd))
						.addComponent(scrollPanelBookList, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
									.addGap(79))
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addGap(7)
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(scrollPanelPurchaces, Alignment.TRAILING)
										.addComponent(scrollPanelBuyList, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
									.addGap(98)))
							.addGroup(jPanel2Layout.createSequentialGroup()
								.addGap(31)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
									.addComponent(btnNotBuy, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnBuy, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
								.addContainerGap()))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(18)
							.addComponent(lblCarrito)
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
							.addComponent(scrollPanelPurchaces, 0, 0, Short.MAX_VALUE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBoxSelectTheme, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnInfo)
								.addComponent(btnPreView)
								.addComponent(btnAdd))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPanelBookList, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		tablePurchaces = new JTable();
		tablePurchaces.setModel(new DefaultTableModel(
				new Object[][] {
		        		{"Compra 5", null},
		        		{null, null}, // TODO  Precio y nombre de la ultima compra
		        		{"Compra 4", null},
		        		{null, null}, // TODO  Precio y nombre de la compra 4
		        		{"Compra 3", null},
		        		{null, null}, // TODO  Precio y nombre de la compra 3
		        		{"Compra 2", null},
		        		{null, null}, // TODO Precio y nombre de la compra 2
		        		{"Compra 1", null},
		        		{null, null}, // TODO Precio y nombre de la compra 1
		        	},
			new String[] {
				"Nombre", "Precio"
			}
		));
		scrollPanelPurchaces.setColumnHeaderView(tablePurchaces);
		
		tableBuyList = new JTable();
		tableBuyList.setModel(new DefaultTableModel(
			new Object[][] { //TODO las compras hechas en el carrito. Tiene que ser una estructura dinamica, no estar guardado en memoria
			},
			new String[] {
				"Mi compra actual (nombre)", "Valor ($)"
			}
		));
		scrollPanelBuyList.setViewportView(tableBuyList);
		
		
		
        tableBookList = new JTable();
        tableBookList.setToolTipText("");
        tableBookList.setModel(new DefaultTableModel(
        	new Object[][] { //TODO Rellenar con los libros de la db
        	},
        	new String[] {
        		"Nombre", "ISBN", "Autor", "Precio", "Categoria", "Informacion"
        	}
        ) {
        	Class[] columnTypes = new Class[] {
        		String.class, Integer.class, String.class, Float.class, String.class, Object.class
        	};
        	public Class getColumnClass(int columnIndex) {
        		return columnTypes[columnIndex];
        	}
        });
        
        scrollPanelBookList.setViewportView(tableBookList);
		setLayout(jPanel2Layout);
	}
}
