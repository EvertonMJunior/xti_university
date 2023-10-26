package me.everton.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import me.everton.poo.Conta;

public class Arquivo3 {
	static Path path = Paths.get("C:/Users/Everton/Documents/workspace/XTI - Java SE/ARQUIVOS/ContasBanco.txt");
	
	public static void main(String[] args) {
		ArrayList<Conta> contas = new ArrayList<>();
		Conta c1 = new Conta("Everton", 1_002.50);
		Conta c2 = new Conta("Gabriel", 123);
		Conta c3 = new Conta("Ricardo", -100);
		Conta c4 = new Conta("Everton", -4_678.15);
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		
		gravarContas(contas);
		ArrayList<Conta> contas2 = getContas();
		for (Conta conta : contas2) {
			conta.exibeSaldo();
		}
	}
	
	public static void gravarContas(ArrayList<Conta> contas) {
		try(BufferedWriter w = Files.newBufferedWriter(path, StandardCharsets.UTF_8)){
			for (Conta c : contas) {
				w.write(c.getCliente() + "§" + c.getSaldo() + "\n");
			}
		} catch(IOException e) {
			System.err.println("Ocorreu um erro");
		}
	}
	
	public static ArrayList<Conta> getContas() {
		ArrayList<Conta> contas = new ArrayList<>();
		try(BufferedReader r = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
			String conta = null;
			while((conta = r.readLine()) != null) {
				String cliente = conta.split("§")[0];
				Double saldo = Double.parseDouble(conta.split("§")[1]);
				Conta c = new Conta(cliente, saldo);
				contas.add(c);
				System.out.println(c.getCliente() + c.getSaldo());
			}
			return contas;
		} catch(IOException e) {
			return null;
		}
	}
}
