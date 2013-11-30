package com.t3g.cookbooks.gui.admin.dialog.admin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;

/**
 * 
 * @author T3G
 */
public class AccesDenied extends JDialog {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AccesDenied() {
		setTitle("ACCESO DENEGADO");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(420, 100, 310, 151);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnBack = new JButton("Volver Atras");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				close();
			}
		});
		btnBack.setBackground(new Color(153, 153, 255));
		btnBack.setBounds(91, 93, 110, 23);
		contentPane.add(btnBack);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Iniciar sesi\u00F3n \u00F3 Registrarse", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(27, 11, 250, 71);
		contentPane.add(panel);
		
		JLabel lblDebeIniciarSesin = new JLabel("Debe iniciar sesi\u00F3n o registrarse");
		panel.add(lblDebeIniciarSesin);
		
		JLabel lblParaPoderAcceder = new JLabel("para poder acceder a esta secci\u00F3n");
		panel.add(lblParaPoderAcceder);
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
				new AccesDenied().setVisible(true);
			}
		});
	}
}