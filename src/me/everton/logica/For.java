package me.everton.logica;
import java.util.ArrayList;

public class For {
	public static void main(String[] args) {
		//For
		int tamanho = 20;
		for(int x = 0; x < tamanho; x++) {
			for (int i = 0; i < tamanho; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//ForEach
		int[] pares = {0, 2, 4, 6, 8};
		for (int par : pares) {
			System.out.println(par);
		}
		System.out.println();
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		for(int i : list) {
			System.out.println(i);
		}
	}
}
