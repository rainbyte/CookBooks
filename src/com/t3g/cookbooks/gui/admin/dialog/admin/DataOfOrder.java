package com.t3g.cookbooks.gui.admin.dialog.admin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.EtchedBorder;

/**
 * 
 * @author T3G
 */
public class DataOfOrder extends JDialog {
	private static final long serialVersionUID = 1L;
	ButtonGroup grupoBtn = new ButtonGroup();
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public DataOfOrder() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(800, 200, 546, 277);
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
		btnBack.setBounds(27, 216, 110, 23);
		contentPane.add(btnBack);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Datos del usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(27, 11, 501, 194);
		contentPane.add(panel);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBackground(new Color(153, 153, 255));
		btnImprimir.setBounds(435, 216, 93, 23);
		contentPane.add(btnImprimir);
	}
	
	
	/**
	 * Método para la lógica de selección de los estados de un pedido
	 * @return Opción seleccionada
	 */
	public static JRadioButton getSelection(ButtonGroup group) 
	{
	        for (Enumeration<AbstractButton> e=group.getElements(); e.hasMoreElements(); ) 
	        {
	            JRadioButton b = (JRadioButton)e.nextElement();
	            if (b.getModel() == group.getSelection()) 
	            {
	                return b;
	            }
	        }

	        return null;
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
				new DataOfOrder().setVisible(true);
			}
		});
	}
}