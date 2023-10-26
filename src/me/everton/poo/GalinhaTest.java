package me.everton.poo;

public class GalinhaTest {
	public static void main(String[] args) {
		Galinha g1 = new Galinha();
		g1.botar().botar().botar();
		
		Galinha g2 = new Galinha();
		g2.botar().botar().botar().botar();
		
		System.out.println(g1.ovos);
		System.out.println(g2.ovos);
		
		System.out.println(Galinha.ovosDaGranja);
		
		System.out.println(Galinha.getMediaDeOvos(2));
	}
}
