package me.everton.logica;
import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<>();
		cores.add("Branco");
		cores.add("Amarelo");
		cores.add("Azul");
		cores.add("Vermelho");
		
		System.out.println("Elementos=" + cores.toString().substring(1, cores.toString().length() - 1) + ".");
		System.out.println("Tamanho=" + cores.size() + ".");
		System.out.println("Elemento2=" + cores.get(2) + ".");
		System.out.println("Índice Branco=" + cores.indexOf("Branco") + ".");
		
		cores.remove("Branco");
		
		System.out.println("Tem Amarelo=" + ((cores.contains("Amarelo")) ? "Sim" : "Não"));
		System.out.println("Tem Cinza=" + ((cores.contains("Cinza")) ? "Sim" : "Não"));
	}
}
