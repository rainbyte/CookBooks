package com.t3g.cookbooks.gui.admin.dialog.admin;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import com.t3g.cookbooks.db.Database;
import com.t3g.cookbooks.db.entities.Purchase;
import com.t3g.cookbooks.db.entities.User;

/**
 * 
 * @author T3G
 */
public class DataOfOrder extends JDialog {
	private static final long serialVersionUID = 1L;
	ButtonGroup grupoBtn = new ButtonGroup();
	private JPanel contentPane;
	private User user;
	private JLabel lblData1, lblData2, lblData3, lblData4;
	private Purchase purchase;
	/**
	 * Create the frame.
	 */
	public DataOfOrder(long id) {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(800, 200, 566, 287);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnBack = new JButton("Volver Atras");
		btnBack.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				btnBackMousePressed();
			}
		});
		btnBack.setBackground(Color.RED);
		btnBack.setBounds(27, 216, 110, 23);
		contentPane.add(btnBack);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Datos del usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(27, 11, 501, 194);
		contentPane.add(panel);
		try {
			purchase = Database.getPurchaseDao().queryForId(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		user = purchase.getUser();
		String data1 = String.format(
				"Nombre: %s %s\n",
				user.getName(),
				user.getSurname()
		);
		String data2 = String.format(
				"Direccion: %s N°%s - Piso: %s - Depto: %s\n",
				user.getStreet(),
				user.getNro(),
				user.getFloor(),
				user.getDept()
		);
		String data3 = String.format(
				"Localidad: %s - Provincia: %s - Codigo Postal: %s\n",
				user.getCity(),
				user.getProvince(),
				user.getPostalCode(),
				user.getPhone(),
				user.getEmail()
		);
		String data4 = String.format(
				"Telefono: %s - Email: %s\n",
				user.getPhone(),
				user.getEmail()
		);
		panel.setLayout(null);
		lblData1 = new JLabel(data1);
		lblData1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblData1.setHorizontalAlignment(SwingConstants.CENTER);
		lblData1.setBounds(10, 21, 481, 14);
		panel.add(lblData1);
		
		lblData2 = new JLabel(data2);
		lblData2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblData2.setHorizontalAlignment(SwingConstants.CENTER);
		lblData2.setBounds(10, 59, 481, 14);
		panel.add(lblData2);
		
		lblData3 = new JLabel(data3);
		lblData3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblData3.setHorizontalAlignment(SwingConstants.CENTER);
		lblData3.setBounds(10, 103, 481, 14);
		panel.add(lblData3);
		
		lblData4 = new JLabel(data4);
		lblData4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblData4.setHorizontalAlignment(SwingConstants.CENTER);
		lblData4.setBounds(10, 149, 481, 14);
		panel.add(lblData4);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBackground(new Color(153, 153, 255));
		btnImprimir.setBounds(435, 216, 93, 23);
		contentPane.add(btnImprimir);
	}
	
	private void close() {
		this.dispose();
	}
	
	private void btnBackMousePressed() {
		close();
	}
}