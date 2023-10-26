package me.everton.pessoal;

import java.util.Scanner;

public class Portugues {
	public static void main(String[] args) {
		final double I = 1.35;
		double i = 1.35;
		int i2 = 0;
		while(i2 <= 20) {
			System.out.println(i + I);
			i += I;
			i2++;
		}
	}
}
