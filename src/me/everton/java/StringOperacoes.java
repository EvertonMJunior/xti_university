package me.everton.java;

public class StringOperacoes {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s1 = "Write Once";
		String s2 = s1 + "Write Once";
		String s3 = new String("JVM");
		char[] array = {'O', 'I'};
		String s4 = new String(array);
		
		//OPERAÇÕES
		int tamanho = s1.length();
		char c1 = s1.charAt(0);
		String texto = s1.toString();
		
		//LOCALIZAÇÃO
		int posicao = s3.indexOf('V');
		int posicao2 = s3.indexOf("VM");
		int posicao3 = s3.lastIndexOf("e");
		boolean estaVazio = s3.isEmpty();
		
		//COMPARAÇÃO
		String xti = "XTI";
		boolean x = xti.equals("xti");
		boolean x2 = xti.equalsIgnoreCase("xti");
		boolean x3 = xti.startsWith("XT");
		boolean x4 = xti.endsWith("TI");
		
		int c = "amor".compareTo("bola");
		System.out.println(c);
		
		String so = "Olhe, olhe!";
		boolean b1 = so.regionMatches(6, "Olhe", 0, 4);
		boolean b2 = so.regionMatches(true, 6, "Olhe", 0, 4);
		
		String l = "O Brasil é Lindo";
		String l1 = l.substring(11);
		String l2 = l.substring(2, 8);
		l1 = l.concat(" que Maravilha");
		l1 = l.replace('s', 'z');
		l1 = l.replaceFirst(" ", "x");
		l1 = l.replaceAll(" ", "x");
		l1 = l.toUpperCase();
		l1 = l.toLowerCase();
		System.out.println("    espaços    ".trim());
		
	}
}
