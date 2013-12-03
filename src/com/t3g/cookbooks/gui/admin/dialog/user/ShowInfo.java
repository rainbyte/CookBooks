package com.t3g.cookbooks.gui.admin.dialog.user;

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
import javax.swing.ButtonGroup;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;

/**
 * 
 * @author T3G
 */
public class ShowInfo extends JDialog {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ShowInfo() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(400, 200, 546, 210);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnBack = new JButton("Volver Atras");
		btnBack.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				close();
			}
		});
		btnBack.setBackground(new Color(153, 153, 255));
		btnBack.setBounds(218, 152, 110, 23);
		contentPane.add(btnBack);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Acerca de", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(27, 11, 501, 130);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSummary = new JLabel("Resumen:");
		lblSummary.setBounds(23, 35, 164, 14);
		panel.add(lblSummary);
		
		JLabel lblSummaryInfo = new JLabel(""); //TODO (T3G) Completar con el book.getSummary() del libro seleccionado en la tabla 
		lblSummaryInfo.setBounds(33, 55, 444, 27);
		panel.add(lblSummaryInfo);
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
				new ShowInfo().setVisible(true);
			}
		});
	}
}