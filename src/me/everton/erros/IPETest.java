package me.everton.erros;

import java.util.Scanner;

public class IPETest {
	private static void autenticar(String senha) throws IncorrectPasswordException {
		if(senha.equals("123")) {
			System.out.println("Autenticado");
		} else {
			throw new IncorrectPasswordException("Senha incorreta!");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Digite a senha");
		try {
			autenticar(new Scanner(System.in).next());
		} catch (IncorrectPasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}
