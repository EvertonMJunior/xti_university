package me.everton.poo;

public class CarroTest {

	public static void main(String[] args) {
		Motor v12 = new Motor("V12", 660);
		Carro carro = new Carro("Ferrari Enzo", v12, 349, 3.2);
		
		System.out.println(carro.getMotor().getPotencia());
	}

}
