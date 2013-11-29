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
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmPurchase frame = new ConfirmPurchase();
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
	public ConfirmPurchase() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblConfirm1 = new JLabel(
				"Esta a punto de comprar los art\u00EDculos que estan");
		lblConfirm1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblConfirm1.setBounds(88, 60, 273, 14);
		contentPane.add(lblConfirm1);

		JLabel lblConfirm2 = new JLabel("en su carrito de compra");
		lblConfirm2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblConfirm2.setBounds(152, 85, 137, 14);
		contentPane.add(lblConfirm2);

		JButton btnBack = new JButton("Volver Atras");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				close();
			}
		});
		btnBack.setBackground(new Color(153, 153, 255));
		btnBack.setBounds(51, 175, 137, 23);
		contentPane.add(btnBack);

		JButton btnConfirm = new JButton("Confirmar compra");
		btnConfirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Confirmar pedido y guardarlo en la datebase
			}
		});
		btnConfirm.setBackground(new Color(153, 153, 255));
		btnConfirm.setBounds(239, 175, 137, 23);
		contentPane.add(btnConfirm);

		JLabel lblPrice = new JLabel("Costo Total: $");
		lblPrice.setBounds(161, 125, 68, 14);
		contentPane.add(lblPrice);

		// TODO Completar con el precio total de la compra del carrito
		JLabel lblTotal = new JLabel(""); 
		lblTotal.setBounds(239, 125, 46, 14);
		contentPane.add(lblTotal);
	}
	
	private void close() {
		this.dispose();
	}
}
