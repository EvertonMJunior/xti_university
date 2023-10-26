package me.everton.heranca;

import java.awt.Image;

public abstract class Animal {
	double peso;
	String comida;
	Image foto;
	
	public void dormir() {System.out.println("Dormiu");};
	public abstract void fazerBarulho();
}
