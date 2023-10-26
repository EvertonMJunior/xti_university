package me.everton.logica;
import java.util.Scanner;

/**
 * 
 * Como recuperar as informa��es do usu�rio.
 * @author Everton Marcelino Junior
 *
 */
public class Entrada {
	public static void main(String[] args) {
		//Chamada do Programa
		//System.out.println(args[0]);
		
		//Interagindo com o Usu�rio
		Scanner s = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		String nome = s.nextLine();
		System.out.println("Bem-Vindo " + nome + "!");
		System.out.println("Quantos anos voc� tem, " + nome + "?");
		int idade = s.nextInt();
		System.out.println("Legal, tenho " + (idade - 2) + " e voc� " + idade + "!");
		s.close();
	}
}
