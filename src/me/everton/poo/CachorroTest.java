package me.everton.poo;
public class CachorroTest {
	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro(10, "Pitbull");
		System.out.println(cachorro1.getRaça());
		System.out.println(cachorro1.getTamanho());
		cachorro1.latir();
		
		cachorro1.setRaça("Vira-Lata");
		cachorro1.setTamanho(5);
		System.out.println(cachorro1.getRaça());
		System.out.println(cachorro1.getTamanho());
		cachorro1.latir();
	}
}
