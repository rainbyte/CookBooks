package com.t3g.cookbooks.gui.admin.dialog.user;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author T3G
 */
public class BuyList extends JDialog {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTable tableBuyList;

	/**
	 * Create the frame.
	 */
	public BuyList() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

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
				// TODO Borrar del carrito el libro seleccionado de la lista
				int selectedRow = tableBuyList.getSelectedRow();
				((DefaultTableModel) tableBuyList.getModel()).removeRow(selectedRow);
			}
		});
		btnDelete.setBackground(new Color(153, 153, 255));
		btnDelete.setBounds(248, 9, 141, 23);
		contentPane.add(btnDelete);

		JScrollPane scrollPanelBuyList = new JScrollPane();
		scrollPanelBuyList.setBounds(26, 36, 321, 186);
		contentPane.add(scrollPanelBuyList);

		// TODO Agregar los libros del carrito en la lista
		tableBuyList = new JTable();
		tableBuyList.setModel(
			new DefaultTableModel(
			new Object[][] {},
			new String[] {
				"Mi compra actual (nombre)"
			}
		)
		);
		scrollPanelBuyList.setViewportView(tableBuyList);

		JButton btnBack = new JButton("Volver atras");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				close();
			}
		});
		btnBack.setBackground(new Color(153, 153, 255));
		btnBack.setBounds(26, 233, 105, 23);
		contentPane.add(btnBack);
	}
	
	private void close() {
		this.dispose();
	}
	
	/**
	 * Launch the dialog standalone.
	 */
	public static void main(String[] args) {
		/* Create and display the form */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new BuyList().setVisible(true);
			}
		});
	}
}
