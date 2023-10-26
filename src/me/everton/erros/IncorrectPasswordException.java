package me.everton.erros;

@SuppressWarnings("serial")
public class IncorrectPasswordException extends Exception{
	public IncorrectPasswordException(String mensagem) {
		super(mensagem);
	}
}
