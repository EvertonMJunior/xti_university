package me.everton.java;

public class ExpressaoRegular {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String padrao = "Java";
		String texto = "Java";
		boolean b = texto.matches(padrao);
		
		//System.out.println("Digite seu nick fake");
		//Scanner s = new Scanner(System.in);
		//String fake = s.next();
		//System.out.println(fake.matches("\\w{1,16}"));
		
		String cep = "\\d{5}-\\d{3}";
		String data = "\\d{2}/\\d{2}/\\d{4}";
		
		String comeca = "^";
		String termina = "$";
		
		String nome = "[A-Z][a-zA-Z]*";
		
		String email = "\\w+@\\w+\\.\\w+[\\.\\w+]";
		System.out.println("marcelinojreverton@gmail.com".matches(email));
	}

}
