package me.everton.erros;

import java.util.Scanner;

public class Assertion {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um número de 0 à 10");
		int numero = s.nextInt();
		
		assert(numero >= 0 && numero <= 10) : "Numero Invalido";
		System.out.println("Voce entrou " + numero);
	}
}
