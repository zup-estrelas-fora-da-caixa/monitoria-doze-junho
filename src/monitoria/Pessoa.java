package monitoria;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
	private String nome;
	private String corDeOlhos;
	private int idade;
	private List<String> amigos;
	
	public Pessoa(String nome, int idade, String corDeolhos) {
		this.idade = idade;
		this.nome = nome;
		this.corDeOlhos = corDeolhos;
	}
	public List<String> getAmigos() {
		return amigos;
	}
	public void setAmigos(List<String> amigos) {
		this.amigos = amigos;
	}
	public String getCorDeOlhos() {
		return corDeOlhos;
	}
	public void setCorDeOlhos(String corDeOlhos) {
		this.corDeOlhos = corDeOlhos;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	} 
	
	@Override
	public String toString() {
		String modelo="";
		modelo += "nome: " + this.nome+"\n";
		modelo += "idade: "+ this.idade + "\n";
		modelo += "cor dos Olhos: "+ this.corDeOlhos + "\n";
		modelo += "Lista de amigos: " + this.amigos + "\n";
		return modelo;
	}
	
	//Durante a monitoria faltou o "new ArrayList<String>();" no metodo.
	public void adicionarAmigo(String nome) {
		this.amigos = new ArrayList<String>();
		this.amigos.add(nome);
	}
	
	public String andar() {
		String andando = this.nome + " está andando";
		return andando;
	}
	
}
