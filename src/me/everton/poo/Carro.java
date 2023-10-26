package me.everton.poo;

public class Carro {
	private String modelo;
	private int velocidadeMaxima;
	private double segundosZeroACem;
	private Motor motor;
	
	public Carro(String modelo, Motor motor, int velocidadeMaxima, double segundosZeroACem){
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
		this.setMotor(motor);
	}
	
	public double getSegundosZeroACem() {
		return segundosZeroACem;
	}
	public void setSegundosZeroACem(double segundosZeroACem) {
		this.segundosZeroACem = segundosZeroACem;
	}
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
}
