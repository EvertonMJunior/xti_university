package me.everton.heranca;

public class InterfaceTest {
	public static void area(AreaCalculavel o) {
		System.out.println(o.calcularArea());
	}
	
	public static void volume(VolumeCalculavel o) {
		System.out.println(o.calculaVolume());
	}
	
	public static void main(String[] args) {
		area(new Quadrado(2));
		volume(new Cubo(2));
	}
}
