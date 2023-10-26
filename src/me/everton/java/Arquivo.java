package me.everton.java;

import java.io.IOException;

public class Arquivo {
	public static void main(String[] args) throws IOException {
		double numeroAChegar = 16;
		double tamanhoDoUltimoPedaco = 8;
		double tamanhoDoPedaco = 8;
		int cortesRealizados = 0;
		
		while(tamanhoDoPedaco != numeroAChegar) {
			tamanhoDoPedaco += tamanhoDoUltimoPedaco / 2;
			tamanhoDoUltimoPedaco /= 2;
			cortesRealizados++;
		}
		
		System.out.println(cortesRealizados + 1);
	}
}
