package com.t3g.cookbooks.gui.admin.catalogue;

import java.awt.event.ActionEvent;
import java.io.File;
import java.sql.SQLException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTextField;

import org.swixml.SwingEngine;

import com.t3g.cookbooks.db.Database;
import com.t3g.cookbooks.db.entities.Author;
import com.t3g.cookbooks.db.entities.Book;
import com.t3g.cookbooks.db.entities.Country;
import com.t3g.cookbooks.db.entities.Language;

public class Catalogue extends SwingEngine {
	private static final long serialVersionUID = -2907267498978855266L;

	private JTextField txtTitle;
	private JTextField txtAuthor;
	private JTextField txtIsbn;
	private JTextField txtPrice;
	private JTextField txtTags;
	private JTextField txtImage;
	private JTextField txtDescription;
	private JTextField txtAditional;
	
	private JButton btnSave, btnCancel;
	
	public Catalogue() {
		super();
		
		try {
			this.render(new File("xml/Catalogue.xml")).setVisible(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Actions	
	
	private Action save = new AbstractAction() {
		public void actionPerformed(ActionEvent e) {
			save();
		}
	};

	private Action cancel = new AbstractAction() {
		public void actionPerformed(ActionEvent e) {
			cancel();
		}
	};

	
	
	public void save() {
		Book book = new Book(txtIsbn.getText(), txtTitle.getText(), 0, Float.parseFloat(txtPrice.getText()),
				new Author(txtAuthor.getText(), "??", new Country("???")),
				new Language("Español"));
		
		book.setSummary(txtDescription.getText());
		book.setSample(txtAditional.getText());
		
		try {
			Database.getBookDao().create(book);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.printf("Save pressed, title is %s\n", txtTitle.getText());
	}

	
	public void cancel() {
		System.out.printf("Cancel pressed\n");
	}

	public static void main(String[] args) {
		new Catalogue();
	}

}
