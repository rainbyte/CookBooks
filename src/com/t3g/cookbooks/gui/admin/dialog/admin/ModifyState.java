package com.t3g.cookbooks.gui.admin.dialog.admin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @author T3G
 */
public class ModifyState extends JDialog {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ModifyState() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

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

		JButton btnAply = new JButton("Aplicar");
		btnAply.setBackground(new Color(153, 153, 255));
		btnAply.setBounds(217, 175, 159, 23);
		contentPane.add(btnAply);

		JCheckBox cbxDispatched = new JCheckBox("ENVIADO");
		cbxDispatched.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO: Enviado seleccionado... si aplican... cambiar estado
				// del pedido
				// Ademas logica que si esta uno apretado el otro no
			}
		});
		cbxDispatched.setBackground(new Color(0, 255, 0));
		cbxDispatched.setBounds(159, 37, 97, 23);
		contentPane.add(cbxDispatched);

		JCheckBox cbxCanceled = new JCheckBox("CANCELADO");
		cbxCanceled.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO: Enviado seleccionado... si aplican... cambiar estado
				// del pedido
				// Ademas logica que si esta apretado uno, el otro no
			}
		});
		cbxCanceled.setBackground(new Color(255, 0, 0));
		cbxCanceled.setBounds(159, 87, 97, 23);
		contentPane.add(cbxCanceled);
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
				new ModifyState().setVisible(true);
			}
		});
	}
}