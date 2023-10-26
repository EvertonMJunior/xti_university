package me.everton.poo;

public class Conta {
	private String cliente;
	private double saldo;
	
	public Conta(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public void exibeSaldo() {
		System.out.println(getCliente() + ", seu saldo é " + getSaldo());
	}
	
	public void saca(double valor) {
		this.setSaldo(this.getSaldo() - valor);
	}
	
	public void deposita(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	public void tranferePara(Conta destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
		System.out.println("Você transferiu " + valor + " para a conta de " + destino.getCliente());
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
