package com.t3g.cookbooks.gui.admin.dialog.user;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @author T3G
 */
public class ConfirmPurchase extends JDialog {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ConfirmPurchase(float total) {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		setBounds(100, 100, 450, 210);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblConfirm1 = new JLabel(
				"Esta a punto de comprar los art\u00EDculos que estan");
		lblConfirm1.setForeground(new Color(204, 0, 0));
		lblConfirm1.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirm1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConfirm1.setBounds(10, 29, 414, 25);
		contentPane.add(lblConfirm1);

		JLabel lblConfirm2 = new JLabel("en su carrito de compra");
		lblConfirm2.setForeground(new Color(204, 0, 0));
		lblConfirm2.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirm2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConfirm2.setBounds(10, 54, 414, 25);
		contentPane.add(lblConfirm2);

		JButton btnBack = new JButton("Volver Atras");
		btnBack.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				close();
			}
		});
		btnBack.setBackground(Color.RED);
		btnBack.setBounds(10, 142, 137, 23);
		contentPane.add(btnBack);

		JButton btnConfirm = new JButton("Confirmar compra");
		btnConfirm.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				// TODO Confirmar pedido y guardarlo en la datebase
			}
		});
		btnConfirm.setBackground(new Color(153, 153, 255));
		btnConfirm.setBounds(210, 142, 214, 23);
		contentPane.add(btnConfirm);

		JLabel lblPrice = new JLabel("Costo Total: $");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPrice.setBounds(161, 110, 150, 14);
		contentPane.add(lblPrice);

		// TODO Completar con el precio total de la compra del carrito
		JLabel lblTotal = new JLabel(String.format("%s", total));
		lblTotal.setForeground(new Color(204, 0, 0));
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTotal.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotal.setBounds(266, 110, 150, 14);
		contentPane.add(lblTotal);
	}
	
	private void close() {
		this.dispose();
	}
}
