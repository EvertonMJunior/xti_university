package me.everton.logica;
import java.util.Random;

import javax.swing.JOptionPane;

public class DesafioDoDado {
	static int jogadasRestantes = 6;
	
	public static void main(String[] args) {
		openJanela();
	}
	
	public static void openJanela() {
		JOptionPane.showMessageDialog(null, "Olá! \nAqui você poderá palpitar sobre que número cairá sobre o dado! Você tem " + jogadasRestantes + " jogadas restantes!", "Desafio do Dado", 1);
		int input;
		try {
			input = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual seu palpite?", "Desafio do Dado", 3));
		} catch(Exception e) {
			openJanela();
			return;
		}
		int dado = new Random().nextInt(6) + 1;
		if(input < 0 || input > 6) {
			JOptionPane.showMessageDialog(null, "Use números entre 1 e 6!", "Desafio do Dado", 0);
			openJanela();
			return;
		}
		if(input == dado) {
			JOptionPane.showMessageDialog(null, "Você acertou! \nParabéns! :D", "Desafio do Dado", 1);
		} else {
			JOptionPane.showMessageDialog(null, "Você errou! \nO dado caiu sobre o número " + dado + "! \nMais sorte na próxima! :(", "Desafio do Dado", 0);
		}
		jogadasRestantes--;
		if(jogadasRestantes > 0) {
			openJanela();
		} else {
			JOptionPane.showMessageDialog(null, "Suas chances acabaram! \nTe vejo daqui a pouco ;D", "Desafio do Dado", 0);
		}
	}
}
