package app7;

public class MinutoInvalidoException extends Exception{
	public MinutoInvalidoException() {
		super("O minuto digitado � inv�lido\n");
	}
}
