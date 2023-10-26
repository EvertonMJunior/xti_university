package me.everton.logica;
public class AuxiliaresFluxosRepeticao {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
		
		While1:
		while(true) {
			for(int i = 0; i < 10; i++) {
				System.out.println("Entrada");
				if(i == 2) {
					break While1;
				}
			}
			break;
		}
	}
}
