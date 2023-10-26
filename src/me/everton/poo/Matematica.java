package me.everton.poo;

public class Matematica {
	
	/**
	 * 
	 * @param um Primeiro Número
	 * @param dois Segundo Número
	 * @return O maior entre os dois números
	 */
	public int maior(int um, int dois) {
		return (um > dois) ? um : dois;
	}
	
	/**
	 * 
	 * @param numeros Números à serem somados
	 * @return Resultado da soma dos números
	 */
	public double soma(double ... numeros) {
		double resultado = 0;
		for (double d : numeros) {
			resultado += d;
		}
		return resultado;
	}
	
	/**
	 * 
	 * @return Raiz Quadrada de acordo com a equação de Pell.
	 */
	public int raiz(int numero) {
		int raiz = 0;
		int impar = 1;
		
		while(numero - impar >= 0) {
			numero -= impar;
			impar += 2;
			raiz++;
		}
		
		return raiz;
	}
}
