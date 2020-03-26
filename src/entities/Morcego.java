package entities;

public class Morcego extends Animal implements ISom {

	public Morcego(int idade, double tamanho, boolean voo) {
		super(idade, tamanho, voo);
	}

	
	@Override
	public void som() {
		System.out.println("PSK PSKPSK !");
	}
	
	
	
}
