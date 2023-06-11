package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.usuario;
import views.Login;
import views.MenuUsuario;

public class LoginControlador implements ActionListener {
	private Login cartelito;
	
	public LoginControlador(Login cartelito) {
		this.cartelito = cartelito;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String nombre = cartelito.getNombre();
		String password = cartelito.getpassword();
		

        if(usuario.validarUsuario(nombre, password)){
            MenuUsuario menu = new MenuUsuario();
            menu.setVisible(true);
            cartelito.dispose();	 
        }else {
            JOptionPane.showMessageDialog(cartelito, "Usuario o Contraseña no son válidos");
        }
	}

}
