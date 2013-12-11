package com.t3g.cookbooks.gui.admin.dialog.user;

import java.awt.Color;
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

import com.t3g.cookbooks.gui.abstraction.DataWindow;

/**
 * 
 * @author T3G
 */
public class CancelPurchase extends JDialog {
	private static final long serialVersionUID = 1L;
	
	private DataWindow dataWindow;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public CancelPurchase(DataWindow dataWindow) {
		super();
		
		this.dataWindow = dataWindow;
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		setBounds(100, 100, 450, 210);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel(
				"Esta a punto de cancelar la compra de los art\u00EDculos");
		label.setForeground(new Color(204, 0, 0));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(10, 29, 414, 25);
		contentPane.add(label);

		JLabel label_1 = new JLabel("que estan en su carrito de compra");
		label_1.setForeground(new Color(204, 0, 0));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(10, 54, 414, 25);
		contentPane.add(label_1);

		JButton button = new JButton("Volver Atras");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				close();
			}
		});
		button.setBackground(Color.RED);
		button.setBounds(10, 142, 137, 23);
		contentPane.add(button);

		JButton button_1 = new JButton("Confirmar cancelacion");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				btnCancelPurchaseMousePressed();	
			}
		});
		button_1.setBackground(new Color(153, 153, 255));
		button_1.setBounds(210, 142, 214, 23);
		contentPane.add(button_1);
	}
	
	private void btnCancelPurchaseMousePressed() {
		dataWindow.deleteData();
		close();
	}
	
	private void close() {
		this.dispose();
	}
}