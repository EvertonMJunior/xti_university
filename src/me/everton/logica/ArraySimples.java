package me.everton.logica;
import java.util.Arrays;

public class ArraySimples {
	public static void main(String[] args) {
		String[] paises = {"Brasil", "Rússia", "Índia", "China"};
		System.out.println(Arrays.toString(paises));
		
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));
		
		Double[] valores = {12.35, 3455.6565};
		System.out.println(valores[0].doubleValue());
	}
}
