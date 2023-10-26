package me.everton.poo;
public class Cachorro {
	int tamanho;
	String raça;
	
	public Cachorro(int size, String raca) {
		this.tamanho = size;
		this.raça = raca;
	}
	
	public Cachorro() {
		
	}
	
	public void setTamanho(int size) {
		this.tamanho = size;
	}
	
	public void setRaça(String raca) {
		this.raça = raca;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public String getRaça() {
		return raça;
	}
	
	public void latir() {
		System.out.println("Au, Au, Au!!");
	}
}
