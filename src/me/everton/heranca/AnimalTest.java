package me.everton.heranca;

public class AnimalTest {
	public static void main(String[] args) {
		Cachorro bulldog = new Cachorro();
		bulldog.comida = "Carne";
		bulldog.dormir();
		
		Galinha carijo = new Galinha();
		carijo.comida = "Alimento";
		carijo.dormir();
	}
}
