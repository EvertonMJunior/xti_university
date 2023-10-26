package me.everton.heranca;

public class Quadrado implements AreaCalculavel{
	double lado;
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		return lado * lado;
	}
}
