package me.everton.poo;

public class ContaTest {
	public static void main(String[] args) {
		Conta conta = new Conta(null, 0);
		conta.setCliente("Ricardo");
		conta.setSaldo(10_000.00);
		conta.exibeSaldo();
		
		Conta conta2 = new Conta(null, 0);
		conta2.setCliente("Lawrence");
		conta2.setSaldo(8_000.00);
		conta2.exibeSaldo();
		
		conta.tranferePara(conta2, 1_550.00);
		
		conta.exibeSaldo();
		conta2.exibeSaldo();
	}
}
