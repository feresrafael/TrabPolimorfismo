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
public class Peixe extends Animal {
	
	private String corEscama;
	
	public String getCorEscama() {
		return this.corEscama;
	}
	
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	public void soltarBolha() {
		System.out.println("Peixe soltando bolhas");
	}
	
	@Override
	public void locomover() {
		System.out.println("Peixe nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Peixe comendo ração");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe fazendo barulho");
	}
}