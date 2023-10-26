package me.everton.logica;
public class AutoBoxing {
	public static void main(String[] args) {
		/*
		 * Antigo
		 * 
		 * Integer x = new Integer(555); //empacotado int a = x.intValue();
		 * //desempacotado a++;//incrementa x = new Integer(a);//re-empacotar
		 * System.out.println(x.intValue());
		 */

		Integer x = 555;
		x++;// desempacota, incrementa e re-empacota
		System.out.println(x);

		Boolean v = new Boolean("true");
		if (v.booleanValue()) {
			System.out.println(v);
		}
	}
}
