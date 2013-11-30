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
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

/**
 * 
 * @author T3G
 */
public class ModifyState extends JDialog {
	private static final long serialVersionUID = 1L;
	ButtonGroup grupoBtn = new ButtonGroup();
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ModifyState() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(800, 200, 183, 203);
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
		button.setBounds(27, 140, 123, 23);
		contentPane.add(button);

		JButton btnAply = new JButton("Aplicar");
		btnAply.setBackground(new Color(153, 153, 255));
		btnAply.setBounds(27, 106, 123, 23);
		contentPane.add(btnAply);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Opciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(27, 11, 123, 84);
		contentPane.add(panel);
		
		JRadioButton rbtnDispatched = new JRadioButton("ENVIADO");
		panel.add(rbtnDispatched);
		
		JRadioButton rbtnCancel = new JRadioButton("CANCELADO");
		panel.add(rbtnCancel);
		
		grupoBtn.add(rbtnDispatched);
		grupoBtn.add(rbtnCancel);
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