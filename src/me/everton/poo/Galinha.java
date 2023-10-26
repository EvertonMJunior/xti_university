package me.everton.poo;

public class Galinha {
	public static int ovosDaGranja;//váriavel global
	
	public int ovos; //total de ovos do objeto galinha
	
	public Galinha botar() {
		this.ovos++;
		Galinha.ovosDaGranja++;
		return this;
	}
	
	public static double getMediaDeOvos(int galinhas) {
		return ovosDaGranja / galinhas;
	}
}
