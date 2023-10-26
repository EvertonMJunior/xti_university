package me.everton.java;

public class StringToken {
	public static void main(String[] args) {
		String s = "XHTML; CSS; JavaScript; jQuery; Java";
		s = "Venha trabalhar na XTI";
		String[] tokens = s.split("a");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}
}
