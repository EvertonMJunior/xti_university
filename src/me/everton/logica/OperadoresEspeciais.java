package me.everton.logica;

import java.util.Scanner;

public class OperadoresEspeciais {
	public static void main(String[] args) {
		//Di�metro = 2r
		System.out.println("Informe o raio");
		Scanner scanner = new Scanner(System.in);
		double raio = scanner.nextDouble();
		scanner.close();
		double diametro = 2 * raio;
		//Circunfer�ncia = 2 PI r
		double pi = Math.PI;
		double circunferencia = 2 * pi * raio;
		System.out.println("Di�metro=" + diametro);
		System.out.println("Circunfer�ncia=" + circunferencia);
		
		//�rea = PI r2
		double area = pi * (raio * raio);
		System.out.println("�rea=" + area);
	}
}
