package me.everton.heranca;

public class Cubo implements AreaCalculavel, VolumeCalculavel{
	double lado;
	
	public Cubo(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaVolume() {
		// TODO Auto-generated method stub
		return 6 * lado * lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return lado * lado * lado;
	}

}
