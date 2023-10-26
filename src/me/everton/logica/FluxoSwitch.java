package me.everton.logica;
public class FluxoSwitch {
	public static void main(String[] args) {
		char sexo = 'M';
		switch (sexo) {
		case 'M':
			System.out.println("Masculino");
			break;
			
		case 'F':
			System.out.println("Feminino");
			break;
			
		default:
			System.out.println("Indefinido");
			break;
		}
	}
}
