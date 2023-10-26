package me.everton.poo;

public class MatematicaTest {
	public static void main(String[] args) {
		Matematica mtm = new Matematica();
		int ma = mtm.maior(10, 20);
		System.out.println(ma);
		
		double so = mtm.soma(10, 20);
		System.out.println(so);
		
		double so1 = mtm.soma(mtm.maior(2, 4), mtm.maior(3, 5));
		System.out.println(so1);
		
		System.out.println(mtm.raiz(27));
		System.out.println(Math.sqrt(27));
	}
}
