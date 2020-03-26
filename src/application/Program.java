package application;

import java.util.Scanner;

import entities.Animal;
import entities.Galinha;
import entities.Morcego;
import entities.Pato;
import entities.Vaca;

public class Program {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	Animal a1 = new Galinha(2, 0.70, false);
	System.out.println("Caracteristicas da Galinha: ");
	System.out.println(a1);
	a1.som();
	
	Animal a2 = new Pato(1, 0.70, true);
	System.out.println("\nCaracteristicas do Pato: ");
	System.out.println(a2);
	a2.som();
	
	Animal a3 = new Morcego(3, 0.25, true);
	System.out.println("\nCaracteristicas do Morcego: ");
	System.out.println(a3);
	a3.som();
	
	
	Animal a4 = new Vaca(4, 1.50, false);
	System.out.println("\nCaracteristicas do Vaca: ");
	System.out.println(a4);
	a4.som();
	
	
	sc.close();
	
	
	}

}
