package me.everton.poo;
public class Cachorro {
	int tamanho;
	String ra�a;
	
	public Cachorro(int size, String raca) {
		this.tamanho = size;
		this.ra�a = raca;
	}
	
	public Cachorro() {
		
	}
	
	public void setTamanho(int size) {
		this.tamanho = size;
	}
	
	public void setRa�a(String raca) {
		this.ra�a = raca;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public String getRa�a() {
		return ra�a;
	}
	
	public void latir() {
		System.out.println("Au, Au, Au!!");
	}
}
