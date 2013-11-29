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
public class CancelPurchase extends JDialog {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CancelPurchase frame = new CancelPurchase();
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
	public CancelPurchase() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel(
				"Esta a punto de cancelar la compra de los art\u00EDculos");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(79, 60, 297, 14);
		contentPane.add(label);

		JLabel label_1 = new JLabel("que estan en su carrito de compra");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(117, 85, 197, 14);
		contentPane.add(label_1);

		JButton button = new JButton("Volver Atras");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				close();
			}
		});
		button.setBackground(new Color(153, 153, 255));
		button.setBounds(51, 175, 137, 23);
		contentPane.add(button);

		JButton button_1 = new JButton("Confirmar cancelacion");
		button_1.setBackground(new Color(153, 153, 255));
		button_1.setBounds(217, 175, 159, 23);
		contentPane.add(button_1);
	}
	
	private void close() {
		this.dispose();
	}
}