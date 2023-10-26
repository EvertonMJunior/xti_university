package me.everton.poo;

public class Motor {
	private String tipo;
	private int potencia;
	
	public Motor(String tipo, int potencia) {
		this.tipo = tipo;
		this.potencia = potencia;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getPotencia() {
		return this.potencia;
	}
	
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
