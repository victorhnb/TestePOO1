package entities;

public class Pato extends Animal  {

	
	public Pato(int idade, double tamanho, boolean voo) {
		super(idade, tamanho, voo);
	}

	@Override
	public void som() {
		System.out.println("quack quack!");
		
	}

	
	
}
