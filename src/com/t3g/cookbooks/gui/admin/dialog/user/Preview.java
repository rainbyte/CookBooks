package com.t3g.cookbooks.gui.admin.dialog.user;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import com.t3g.cookbooks.db.Database;
import com.t3g.cookbooks.db.entities.Book;


/**
 * 
 * @author T3G
 */
public class Preview extends JDialog {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private Book book;
	/**
	 * Create the frame.
	 */
	public Preview(long id) {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(400, 200, 566, 225);
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
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Primeras p\u00E1ginas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(27, 11, 501, 130);
		contentPane.add(panel);
		panel.setLayout(null);
		//-------------------------
		try {
			book = Database.getBookDao().queryForId(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//-------------------------
		JLabel lblSample = new JLabel(book.getSample());
		lblSample.setBounds(33, 55, 444, 27);
		panel.add(lblSample);
	}
	
	private void close() {
		this.dispose();
	}
}