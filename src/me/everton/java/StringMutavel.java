package me.everton.java;

public class StringMutavel {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("Java");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		
		s1.reverse(); s1.append("a");
		System.out.println(s1);
		
		String s = "Oi" + " como " + " vai " + " você" + "?";
		
		//.append inclui; .delete exclui;
	}

}
