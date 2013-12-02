package com.t3g.cookbooks.gui.panel.body.admin;

import java.awt.Color;
import java.awt.Dialog;
import java.sql.SQLException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import com.t3g.cookbooks.db.Database;
import com.t3g.cookbooks.db.entities.Book;
import com.t3g.cookbooks.gui.ParentWindow;
import com.t3g.cookbooks.gui.abstraction.MainWindowLogic;
import com.t3g.cookbooks.gui.abstraction.PanelBody;
import com.t3g.cookbooks.gui.admin.dialog.admin.CatalogueCreateBook;
import com.t3g.cookbooks.gui.admin.dialog.admin.CatalogueEditBook;
import com.t3g.cookbooks.gui.admin.dialog.admin.DataOfOrder;
import com.t3g.cookbooks.gui.admin.dialog.admin.WarningDelete;

/**
 * 
 * @author T3G
 */
public class Catalogue extends PanelBody implements ParentWindow {
	private static final long serialVersionUID = 1L;

	private JButton btnBack;
	private JTable tableBooks;
	private DefaultTableModel tableBooksModel;

	/**
	 * Creates new form Register
	 */
	public Catalogue(MainWindowLogic mainWindow) {
		super(mainWindow);
		
		setBackground(new Color(153, 153, 255));
		
		updateTableModel();
	}

    /**
     * This method is called from within the constructor to initialize the form.
     */
	protected void initialize() {
    
        JScrollPane spanelBooks = new JScrollPane();
        
        JButton btnEdit = new JButton("Editar");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        
        JButton btnAddBook = new JButton("Subir un libro");
        btnAddBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddBookMouseClicked(evt);
            }
        });
        
        JButton btnDelete = new JButton("Eliminar");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        
        btnBack = new JButton("VOLVER AL INICIO");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        btnBack.setBackground(Color.RED);
        
        JLabel lblT3G = new JLabel("DESARROLLADO POR T3G");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        					.addGroup(jPanel2Layout.createSequentialGroup()
        						.addComponent(spanelBooks, GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        						.addContainerGap())
        					.addGroup(jPanel2Layout.createSequentialGroup()
        						.addComponent(btnAddBook)
        						.addPreferredGap(ComponentPlacement.RELATED, 545, Short.MAX_VALUE)
        						.addComponent(btnEdit)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(btnDelete)
        						.addGap(14)))
        				.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        					.addComponent(btnBack)
        					.addGap(181)
        					.addComponent(lblT3G)
        					.addGap(23))))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnAddBook)
        				.addComponent(btnDelete)
        				.addComponent(btnEdit))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(spanelBooks, GroupLayout.PREFERRED_SIZE, 473, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblT3G)
        				.addComponent(btnBack))
        			.addGap(159))
        );
        
        tableBooks = new JTable();
        spanelBooks.setViewportView(tableBooks);
        this.setLayout(jPanel2Layout);
    }
    
	private void btnAddBookMouseClicked(java.awt.event.MouseEvent evt) {
		JDialog dialog = new CatalogueCreateBook(this);
		dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
		dialog.setVisible(true);

		updateTableModel();
	}

	private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO Al presionarse debe abrise la ventana de "Editar libro" para
		// modificar los datos del libro seleccionado
		if (!(tableBooks.getSelectedRow() == -1)){
			int selectedRow = tableBooks.getSelectedRow();
			long id = (Long) tableBooks.getModel().getValueAt(selectedRow, 0);
			JDialog dialog = new CatalogueEditBook(this, id);
			dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
			dialog.setVisible(true);

			updateTableModel();
		}
	}

	private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {
		// Obtain Id from selected row
		int selectedRow = tableBooks.getSelectedRow();
		long id = (Long) tableBooks.getModel().getValueAt(selectedRow, 0);
		JDialog dialog = new WarningDelete(id);
		dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
		dialog.setVisible(true);


		// Update JTable and Model
		updateTableModel();
	}

	private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO Al presionase debe volver a la pagina anterior
	}

	private void updateTableModel() {
		tableBooksModel = new DefaultTableModel();
		tableBooksModel.addColumn("Id");
		tableBooksModel.addColumn("Titulo");
		tableBooksModel.addColumn("Autor");
		tableBooksModel.addColumn("Precio");
		tableBooksModel.addColumn("Categorias");
		tableBooksModel.addColumn("ISBN");

		for (Book book : Database.getBookDao()) {
			Object[] rowData = new Object[] {
				book.getId(),
				book.getTitle(),
				String.format("%s, %s", book.getAuthor().getSurname(), book.getAuthor().getName()),
				book.getPrice(),
				"???",	// TODO (Alvaro) add categories support
				book.getIsbn()
			};
			
			tableBooksModel.addRow(rowData);
		}

		tableBooks.setModel(tableBooksModel);

		tableBooks.getColumnModel().getColumn(1).setMinWidth(250);
		tableBooks.getColumnModel().getColumn(3).setMaxWidth(50);
		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment( JLabel.RIGHT );
		tableBooks.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
		// Hide Id column
		tableBooks.removeColumn(tableBooks.getColumnModel().getColumn(0));
	}

	public void update() {
		updateTableModel();
	}
}
