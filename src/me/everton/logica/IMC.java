package me.everton.logica;
import javax.swing.JOptionPane;

public class IMC {
	public static void main(String[] args) {
		try {
			Double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua massa", "C�lculo do IMC", 3));
			Double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua altura", "C�lculo do IMC", 3));
			double imc = peso / (altura * altura);
			String msg = (imc >= 0 && imc <= 25) ? "um Peso Ideal" : "Sobrepeso.\nO peso ideal � o de um IMC entre 20 e 25";
			JOptionPane.showMessageDialog(null, "Voc� tem " + msg + "!\nSeu IMC � de " + imc + "!", "C�lculo do IMC", 1);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Voc� tem que usar n�meros!", "C�lculo do IMC", 1);
		}
	}
}
