package entities;

public class Vaca extends Animal implements ISom{

	public Vaca(int idade, double tamanho, boolean voo) {
		super(idade, tamanho, voo);
	}
	
	@Override
	public void som () {
		System.out.println("MUUUU !");
	}
	
	
}
