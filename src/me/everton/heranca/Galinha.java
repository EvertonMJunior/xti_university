package me.everton.heranca;

public class Galinha extends Animal implements AreaCalculavel{

	@Override
	public void fazerBarulho() {
		System.out.println("C�, C�!");
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
