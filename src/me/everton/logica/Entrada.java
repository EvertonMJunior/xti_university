package me.everton.logica;
import java.util.Scanner;

/**
 * 
 * Como recuperar as informações do usuário.
 * @author Everton Marcelino Junior
 *
 */
public class Entrada {
	public static void main(String[] args) {
		//Chamada do Programa
		//System.out.println(args[0]);
		
		//Interagindo com o Usuário
		Scanner s = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		String nome = s.nextLine();
		System.out.println("Bem-Vindo " + nome + "!");
		System.out.println("Quantos anos você tem, " + nome + "?");
		int idade = s.nextInt();
		System.out.println("Legal, tenho " + (idade - 2) + " e você " + idade + "!");
		s.close();
	}
}
