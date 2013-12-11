package com.t3g.cookbooks.gui.admin.dialog.admin;

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
import com.t3g.cookbooks.db.entities.BookTag;

/**
 * 
 * @author T3G
 */
public class WarningDelete extends JDialog {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private long id;
	/**
	 * Create the frame.
	 */
	public WarningDelete(long id1) {
		setTitle("ADVERTENCIA!");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(420, 100, 385, 154);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		id = id1;

		JButton btnBack = new JButton("Volver Atras");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				close();
			}
		});
		btnBack.setBackground(new Color(153, 153, 255));
		btnBack.setBounds(10, 93, 136, 23);
		contentPane.add(btnBack);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Baja de un libro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(82, 11, 224, 71);
		contentPane.add(panel);
		
		JLabel lblDebeIniciarSesin = new JLabel("Esta a punto de eliminar un libro");
		panel.add(lblDebeIniciarSesin);
		
		JLabel lblParaPoderAcceder = new JLabel("\u00BFA\u00FAn desea hacerlo?");
		panel.add(lblParaPoderAcceder);
		
		JButton btnConfirmarBaja = new JButton("Confirmar baja");
		btnConfirmarBaja.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				// Remove from db
				try {
					for (BookTag bookTag : Database.getBookTagDao()){
						if (bookTag.getBook().getId() == (id)){
							Database.getBookTagDao().deleteById(bookTag.getId());
						}
					}
					Database.getBookDao().deleteById(id);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				close();
			}
		});
		btnConfirmarBaja.setBackground(new Color(153, 153, 255));
		btnConfirmarBaja.setBounds(231, 93, 136, 23);
		contentPane.add(btnConfirmarBaja);
	}
	
	private void close() {
		this.dispose();
	}

}