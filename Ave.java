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
public class Ave extends Animal {
	
	private String corPena;
	public void fazerNinho() {
		System.out.println("Pássaro construindo ninho");
	}
	
	@Override
	public void locomover() {
		System.out.println("Voando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Alimentado com ração de pássaro");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Pássaro fazendo barulho");
	}
	
	public String getCorPena() {
		return this.corPena;
	}
	
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
}