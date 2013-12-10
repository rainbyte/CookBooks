package com.t3g.cookbooks.gui.admin.dialog.admin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
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
import javax.swing.UIManager;

import com.t3g.cookbooks.db.Database;
import com.t3g.cookbooks.db.entities.Purchase;

/**
 * 
 * @author T3G
 */
public class ModifyState extends JDialog {
	private static final long serialVersionUID = 1L;
	ButtonGroup grupoBtn = new ButtonGroup();
	private JPanel contentPane;
	private long id;
	private Purchase purchase;

	/**
	 * Create the frame.
	 */
	public ModifyState(long id) {
		this.id = id;
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(800, 200, 183, 242);
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
		
		btnBack.setBackground(Color.RED);
		btnBack.setBounds(27, 170, 123, 23);
		contentPane.add(btnBack);

		JButton btnAply = new JButton("Aplicar");
		btnAply.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				btnAplyMousePressed();
			}
		});
		
		btnAply.setBackground(UIManager.getColor("Button.background"));
		btnAply.setBounds(27, 136, 123, 23);
		contentPane.add(btnAply);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Opciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(27, 11, 123, 114);
		contentPane.add(panel);
		
		JRadioButton rbtnDispatched = new JRadioButton("ENVIADO");
		rbtnDispatched.setSelected(true);
		panel.add(rbtnDispatched);
		
		JRadioButton rbtnCanceled = new JRadioButton("CANCELADO");
		panel.add(rbtnCanceled);
		
		
		JRadioButton rbtnPending = new JRadioButton("PENDIENTE");
		panel.add(rbtnPending);
		
		grupoBtn.add(rbtnDispatched);
		grupoBtn.add(rbtnCanceled);
		grupoBtn.add(rbtnPending);
	}
	
	public static JRadioButton getSelection(ButtonGroup group) {
		for (Enumeration<AbstractButton> e=group.getElements(); e.hasMoreElements();) {
				JRadioButton b = (JRadioButton)e.nextElement();
	            if (b.getModel() == group.getSelection()) {
	                return b;
	            }
	        }
	        return null;
	}
	
	private void close() {
		this.dispose();
	}
	
	private void btnAplyMousePressed() {
		JRadioButton rbtnSelected = getSelection(grupoBtn);
		System.out.print(rbtnSelected.getText());
		try {
			purchase = Database.getPurchaseDao().queryForId(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		purchase.setStatus(rbtnSelected.getText());
		System.out.print(rbtnSelected.getText());
		try {
			Database.getPurchaseDao().update(purchase);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
	}
}