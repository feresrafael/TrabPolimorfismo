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
public class Reptil extends Animal {
	
	private String corEscama;
	
	@Override
	public void locomover() {
		System.out.println("Réptil andando");
	}

	public String getCorEscama() {
		return this.corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void alimentar() {
		System.out.println("Réptil comendo");
	}

	@Override
	public void emitirSom() {
		System.out.println("Réptil fazendo barulho");
	}
}