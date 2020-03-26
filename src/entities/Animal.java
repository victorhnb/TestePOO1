package entities;

public class Animal implements ISom {

	private int idade;
	private double tamanho; 
	private boolean voo;
		
	public Animal(int idade, double tamanho, boolean voo) {
		this.idade = idade;
		this.tamanho = tamanho;
		this.voo = voo;
		
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isVoo() {
		return voo;
	}

	public void setVoo(boolean voo) {
		this.voo = voo;
	}

	@Override
	public String toString() {
		return "Animal [idade=" + idade + " anos " + ", tamanho=" + tamanho + "m"+ ", voo=" + voo + "]";
	}

	@Override
	public void som() {
		
	}


	
	
	
	
	
	
}
