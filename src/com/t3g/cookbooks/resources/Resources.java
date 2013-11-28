package com.t3g.cookbooks.resources;

import javax.swing.ImageIcon;

public class Resources {
	private final static ImageIcon logo = new ImageIcon(Resources.class.getResource("/com/t3g/cookbooks/resources/cookbookLogoReducido.png"));
	private final static ImageIcon iconCarrito = new ImageIcon(Resources.class.getResource("/com/t3g/cookbooks/resources/Carrito.png"));
	private final static ImageIcon iconBuy = new ImageIcon(Resources.class.getResource("/com/t3g/cookbooks/resources/IconBtnBuy.png"));
	private final static ImageIcon iconNotBuy = new ImageIcon(Resources.class.getResource("/com/t3g/cookbooks/resources/IconBtnNotBuy.png"));
	
	private Resources() {
		// This class should not be instantiated.
	}
	
	public static ImageIcon getLogo() {
		return logo;
	}
	
	public static ImageIcon getIconCarrito() {
		return iconCarrito;
	}

	public static ImageIcon getIconBuy() {
		return iconBuy;
	}

	public static ImageIcon getIconNotBuy() {
		return iconNotBuy;
	}
}
