package monitoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static Pessoa criaObjPessoa(String nome, int idade, String corDosOlhos) {
		Pessoa pessoa = new Pessoa(nome, idade, corDosOlhos);
		return pessoa;
	}

	public static void main(String[] args) {
		List<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
		Scanner scan = new Scanner(System.in);
		Pessoa p1 = new Pessoa("Jeff", 30, "castanhos");

		int controle = 0;
		for (int i = 0; i < 2; i++) {
			System.out.println("Qual o nome?");
			String nome = scan.next();
			System.out.println("Qual a idade?");
			int idade = scan.nextInt();
			System.out.println("Qual a cor do olho?");
			String cor = scan.next();

			listaDePessoas.add(criaObjPessoa(nome, idade, cor));
		}

		while (controle == 0) {

			System.out.println("1 para sair \n 2 para adiconar amigo");
			int resposta = scan.nextInt();

			if (resposta == 2) {
				System.out.println("Qual o nome na lista?");
				String nome = scan.next();
				System.out.println("Qual o nome do amigo?");
				String nomeAmigo = scan.next();
				List<String> amigos = new ArrayList<String>();
				amigos.add(nomeAmigo);

				for (Pessoa pessoa : listaDePessoas) {
					if (pessoa.getNome().equalsIgnoreCase(nome)) {
						pessoa.adicionarAmigo(nomeAmigo);
					}
				}

			} else if (resposta == 1) {
				controle = 1;
			} else if (resposta == 3) {
				for (Pessoa pessoa : listaDePessoas) {
					System.out.println(pessoa);
				}
			} else {
				System.out.println("Não existe essa opição");
			}

		}

	}

}
