package me.everton.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
	public static void dividir(Scanner s) throws InputMismatchException, ArithmeticException{
		System.out.println("Numero: ");
		int a = s.nextInt();
		System.out.println("Divisor: ");
		int b = s.nextInt();
		
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			dividir(s);
			main(args);
		} catch(InputMismatchException | ArithmeticException e) {
			System.err.println("Numero Invalido");
			e.printStackTrace();
			main(args);
		} finally {
			System.out.println("Finally Executado...");
		}
	}

}
