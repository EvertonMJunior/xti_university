package me.everton.logica;
import javax.swing.JOptionPane;

public class IMC {
	public static void main(String[] args) {
		try {
			Double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua massa", "Cálculo do IMC", 3));
			Double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua altura", "Cálculo do IMC", 3));
			double imc = peso / (altura * altura);
			String msg = (imc >= 0 && imc <= 25) ? "um Peso Ideal" : "Sobrepeso.\nO peso ideal é o de um IMC entre 20 e 25";
			JOptionPane.showMessageDialog(null, "Você tem " + msg + "!\nSeu IMC é de " + imc + "!", "Cálculo do IMC", 1);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Você tem que usar números!", "Cálculo do IMC", 1);
		}
	}
}
