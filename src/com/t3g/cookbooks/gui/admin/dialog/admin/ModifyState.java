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

		JButton btnBack = new JButton("Volver Atras");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				close();
			}
		});
		btnBack.setBackground(new Color(153, 153, 255));
		btnBack.setBounds(27, 140, 123, 23);
		contentPane.add(btnBack);

		JButton btnAply = new JButton("Aplicar");
		btnAply.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				JRadioButton rbtnSelected = getSelection(grupoBtn);
				System.out.print(rbtnSelected.getText());
				// TODO: Cambiar el estado del pedido según este seleccionado el botón:
				// rbtnDispatched = ENVIADO
				// rbtnCanceled = CANCELADO
				// EN rbtnSelected esta el botón seleccionado
				// Se le podría hacer un rbtnSelected.getText() y directamente aplicarlo a la base de datos...
				// No sé bien como se maneja pero supongo que podrás escrbir así
			}
		});
		btnAply.setBackground(new Color(153, 153, 255));
		btnAply.setBounds(27, 106, 123, 23);
		contentPane.add(btnAply);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Opciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(27, 11, 123, 84);
		contentPane.add(panel);
		
		JRadioButton rbtnDispatched = new JRadioButton("ENVIADO");
		rbtnDispatched.setSelected(true);
		panel.add(rbtnDispatched);
		
		JRadioButton rbtnCanceled = new JRadioButton("CANCELADO");
		panel.add(rbtnCanceled);
		
		grupoBtn.add(rbtnDispatched);
		grupoBtn.add(rbtnCanceled);
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
				new ModifyState().setVisible(true);
			}
		});
	}
}