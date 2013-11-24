package com.t3g.cookbooks.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
*
* @author T3G
*/
public class BuyList extends JFrame {

	private JPanel contentPane;
	private JTable tableBuyList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyList frame = new BuyList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BuyList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuestion = new JLabel("\u00BFC\u00FAal libro desea quitar?");
		lblQuestion.setForeground(new Color(0, 0, 0));
		lblQuestion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQuestion.setBounds(26, 11, 181, 14);
		contentPane.add(lblQuestion);
		
		JButton btnDelete = new JButton("Quitar del carrito");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//TODO Borrar del carrito el libro seleccionado de la lista
			}
		});
		btnDelete.setBackground(new Color(153, 153, 255));
		btnDelete.setBounds(248, 9, 141, 23);
		contentPane.add(btnDelete);
		
		JScrollPane scrollPanelBuyList = new JScrollPane();
		scrollPanelBuyList.setBounds(26, 36, 321, 186);
		contentPane.add(scrollPanelBuyList);
		
		tableBuyList = new JTable();
		tableBuyList.setModel(new DefaultTableModel(
			new Object[][] { //TODO Agregar los libros del carrito en la lista
			},
			new String[] {
				"Mi compra actual (nombre)"
			}
		));
		scrollPanelBuyList.setViewportView(tableBuyList);
		
		JButton btnBack = new JButton("Volver atras");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//TODO Volver a la interfez principal
			}
		});
		btnBack.setBackground(new Color(153, 153, 255));
		btnBack.setBounds(26, 233, 105, 23);
		contentPane.add(btnBack);
	}
}
