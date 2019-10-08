/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

public abstract class Animal {
	
	private int peso;
	private int idade;
	private int membros;
	
	public int getPeso() {
		return this.peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getMembros() {
		return this.membros;
	}
	
	public void setMembros(int membros) {
		this.membros = membros;
	}
	
	public abstract void locomover();
	
	public abstract void alimentar();
	
	public abstract void emitirSom();
	
}

