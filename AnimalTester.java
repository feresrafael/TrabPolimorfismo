/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author feres
 */
public class AnimalTester {

	public static void main(String[] args) {

		Ave a1 = new Ave();
		Mamifero m1 = new Mamifero();
		Peixe p1 = new Peixe();
		Reptil r1 = new Reptil();
		
		a1.setCorPena("Vermelha");
		a1.setIdade(3);
		a1.setMembros(2);
		a1.setPeso(3);
		a1.fazerNinho();
		a1.alimentar();
		a1.emitirSom();
		a1.locomover();
		System.out.println("------------------------------------------");
		
		m1.setIdade(6);
		m1.setMembros(4);
		m1.setPeso(30);
		m1.setCorPelo("Marron");
		m1.alimentar();
		m1.emitirSom();
		m1.locomover();
		System.out.println("------------------------------------------");
		
		p1.setCorEscama("Dourada");
		p1.setMembros(3);
		p1.setIdade(1);
		p1.setPeso(1);
		p1.soltarBolha();
		p1.alimentar();
		p1.emitirSom();
		p1.locomover();
		System.out.println("------------------------------------------");
		
		r1.setIdade(4);
		r1.setMembros(5);
		r1.setPeso(10);
		r1.setCorEscama("Verde");
		r1.alimentar();
		r1.emitirSom();
		r1.locomover();
		System.out.println("------------------------------------------");
	}
}