package me.everton.logica;
import java.util.ArrayList;

public class Fibonacci {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(0);
		numeros.add(1);
		numeros.add(2);
		
		while(numeros.get(numeros.size() - 1) <= 50) {
			int adicionar = numeros.get(numeros.size() - 1) + numeros.get(numeros.size() - 2);
			if(adicionar >= 50) {
				break;
			}
			numeros.add(adicionar);
		}
		
		System.out.println("Os n�meros Fibonacci de 0 � 50 s�o:");
		System.out.println(numeros.toString().substring(1, numeros.toString().length() - 1));
	}
}
