package com.t3g.cookbooks.resources;

import javax.swing.ImageIcon;

public class Resources {
	private final static ImageIcon logo = new ImageIcon(Resources.class.getResource("/com/t3g/cookbooks/resources/cookbookLogoReducido.png"));
	
	public static ImageIcon getLogo() {
		return logo;
	}
}
