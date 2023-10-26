package me.everton.logica;
import javax.swing.JOptionPane;

/**
 * 
 * Como recuperar as informações do usuário por uma Interface Gráfica.
 * @author Everton Marcelino Junior
 *
 */
public class EntradaGrafica {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog(null, "Qual seu nome?", "Nome", 3);
		JOptionPane.showMessageDialog(null, "Olá " + s + "!", "Bem-Vindo!", 1);
	}
}
