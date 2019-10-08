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
public class Mamifero extends Animal {
	private String corPelo;
	
	public String getCorPelo() {
		return this.corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void locomover() {
		System.out.println("Mamífero em locomoção");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamífero comendo");
	}

	@Override
	public void emitirSom() {
		System.out.println("Mamífero fazendo barulho");
	}
}