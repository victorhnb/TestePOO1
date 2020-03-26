package entities;

public class Galinha extends Animal implements ISom {

	public Galinha(int idade, double tamanho, boolean voo) {
		super(idade, tamanho, voo);
	}

	public void som() {
		System.out.println("có có !");
	}
	
	
	
}
