package me.everton.logica;
/**
 * 
 * Operadores Matemáticos (+, -, *, /, %, -, +, ++, --).
 * 
 * @author Everton Marcelino Junior
 *
 */
public class OperadorMatematico {
	public static void main(String[] args) {
		int x = 6;
		//int y = ++x; Pré-Incremento
		int y = x++; //Pós Incremento
		
		System.out.println(x);
		System.out.println(y);
	}
}
