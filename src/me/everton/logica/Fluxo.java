package me.everton.logica;
public class Fluxo {
	public static void main(String[] args) {
		int nota = 6;
		if(nota >= 7) {
			System.out.println("Passou");
		} else {
			System.out.print("Reprovou");
			if(nota >= 6) {
				System.out.print(" mas pode fazer a recuperação");
			}
		}
	}
}
