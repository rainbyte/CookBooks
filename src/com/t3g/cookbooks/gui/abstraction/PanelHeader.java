package com.t3g.cookbooks.gui.abstraction;

import javax.swing.JPanel;

public abstract class PanelHeader extends JPanel {
	private static final long serialVersionUID = 1L;

	protected MainWindowLogic mainWindow;
	
	public PanelHeader(MainWindowLogic mainWindow) {
		this.mainWindow = mainWindow;
		initialize();
	}
	
	protected abstract void initialize();
}
