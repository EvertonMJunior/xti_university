package me.everton.poo;

public class Matematica {
	
	/**
	 * 
	 * @param um Primeiro N�mero
	 * @param dois Segundo N�mero
	 * @return O maior entre os dois n�meros
	 */
	public int maior(int um, int dois) {
		return (um > dois) ? um : dois;
	}
	
	/**
	 * 
	 * @param numeros N�meros � serem somados
	 * @return Resultado da soma dos n�meros
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
	 * @return Raiz Quadrada de acordo com a equa��o de Pell.
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
