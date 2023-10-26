package me.everton.logica;
/**
 * 
 * Apresentar os conceitos de variável.
 * @author Everton Marcelino Junior
 *
 */
public class Variavel {
	public static void main(String[] args) {
		String nome, segundoNome, ultimoNome;
		nome = "Everton";
		segundoNome = "Marcelino";
		ultimoNome = "Junior";
		String[] nomes = new String[] {nome, segundoNome, ultimoNome};
		int idade = 12;
		boolean estudando = true;
		
		System.out.println("Meu nome é " + String.join(" ", nomes) + ".");
		System.out.println("Tenho " + idade + " anos.");
		System.out.println("Estudando? " + estudando);
	}
}
