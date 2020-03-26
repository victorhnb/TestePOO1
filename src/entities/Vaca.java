package entities;

public class Vaca extends Animal {

	public Vaca(int idade, double tamanho, boolean voo) {
		super(idade, tamanho, voo);
	}

	public void som () {
		System.out.println("MUUUU !");
	}
	
	
}
