package me.everton.logica;

import java.util.Scanner;

public class OperadoresEspeciais {
	public static void main(String[] args) {
		//Diâmetro = 2r
		System.out.println("Informe o raio");
		Scanner scanner = new Scanner(System.in);
		double raio = scanner.nextDouble();
		scanner.close();
		double diametro = 2 * raio;
		//Circunferência = 2 PI r
		double pi = Math.PI;
		double circunferencia = 2 * pi * raio;
		System.out.println("Diâmetro=" + diametro);
		System.out.println("Circunferência=" + circunferencia);
		
		//Área = PI r2
		double area = pi * (raio * raio);
		System.out.println("Área=" + area);
	}
}
