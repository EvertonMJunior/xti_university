package me.everton.logica;
/**
 * 
 * Apresentar as v�riaveis primitivas.
 * @author Everton Marcelino Junior
 *
 */
public class TiposPrimitivos {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int idade = 12;
		double preco = 12.45;
		char sexo = 'M'; //Unicode
		boolean estudando = true;
		byte b = 127; //Suporta at� 127.
		short s = 32_767; //Suporta at� 32.768.
		int i = 2_147_483_647; //Suporta at� 2.147.483.647.
		long l = 9_223_372_036_854_775_807L; //Suporta at� 9.223.372.036.854.775.807.
		double d = 1.7976931348623157E+308; //Suporta at� 1.7976931348623157E+308. IEE754
		float f = 3.4028235E+38F; //Suporta at� 3.4028235E+38.
		
		i = s;//Cast Impl�cito
		System.out.println("Cast Impl�cito");
		System.out.println(i);
		System.out.println(s);
		System.out.println();
		
		i = (int) l;//Cast Expl�cito
		System.out.println("Cast Expl�cito");
		System.out.println(l);
		System.out.println(i);
		System.out.println();
		
		//FORMA BIN�RIA
		byte bb = 0b01010101; //8 bits/ 1 byte.
		short ss = 0b0101010101010101;//16 bits/ 2 bytes.
		int ii = 0b01010101010101010101010101010101;//32 bits/ 4 bytes.
	}
}
