package me.everton.logica;
import javax.swing.JOptionPane;

/**
 * 
 * Como recuperar as informa��es do usu�rio por uma Interface Gr�fica.
 * @author Everton Marcelino Junior
 *
 */
public class EntradaGrafica {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog(null, "Qual seu nome?", "Nome", 3);
		JOptionPane.showMessageDialog(null, "Ol� " + s + "!", "Bem-Vindo!", 1);
	}
}
