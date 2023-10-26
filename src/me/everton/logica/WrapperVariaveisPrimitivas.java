package me.everton.logica;
/**
 * 
 * Apresentar as Wrapper Classes Envólucros de Tipos Primitivos.
 * 
 * @author Everton Marcelino Junior
 *
 */
public class WrapperVariaveisPrimitivas {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Double preco = new Double("12.45");
		double d = preco.doubleValue();
		int i = preco.intValue();
		byte b = preco.byteValue();
		Boolean estudando = new Boolean("true");
		
		//CONVERSÃO ESTÁTICA
		double d1 = Double.parseDouble("123.45");
		int i1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("123.35F");
		
		int i2 = Integer.valueOf("100011", 2);
		System.out.println(i2);
	}
}
