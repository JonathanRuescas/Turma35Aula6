package br.com.generation.heran?as;

public class Animal {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//metodo
	
	void emitirSom(String som) {
		System.out.println("Som emitidido: " + som);
	}

}
