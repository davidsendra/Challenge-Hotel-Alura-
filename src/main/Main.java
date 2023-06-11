package main;

import java.awt.EventQueue;

import views.MenuPrincipal;


public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal menuPrincipal=new MenuPrincipal();
					menuPrincipal.setVisible(true);	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
