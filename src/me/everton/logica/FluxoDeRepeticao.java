package me.everton.logica;
public class FluxoDeRepeticao {
	public static void main(String[] args) {
		int i = 3;
		while(i < 2) {
			System.out.println(i);
			i++;
		}
		
		do {
			System.out.println(i);
			i++;
		} while (i < 2);
	}
}
