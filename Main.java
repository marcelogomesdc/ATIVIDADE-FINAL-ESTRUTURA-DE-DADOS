import java.io.IOException;
import java.util.Scanner;

import br.edu.iftm.controller.AgendaController;
import br.edu.iftm.model.Pessoa;
public class Main {
	static Scanner ler = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		menu();
	}

	private static void menu() throws IOException { // menu principal
		int opcao = 0;
		
		
		do {
			System.out.println("\n\n                   ATIVIDADE FINAL ESTRUTURA DE DADOS");
			System.out.println("\n                 ALUNO: MARCELO GOMES | MATRÍCULA:2124666");
			System.out.println("\n                 ALUNO: RAFAEL SANTIAGO | MATRÍCULA:2124655");
			System.out.println("\n\n                    ---- MENU AGENDA TELEFONICA ----");
			System.out.println("\n                  ===================================");
			System.out.println("                  |     1 - Adicionar contato         |");
			System.out.println("                  |     2 - Remover contato           |");
			System.out.println("                  |     3 - Exibir lista de contatos  |");
			System.out.println("                  |     4 - Alterar contato           |");
			System.out.println("                  |     5 - Pesquisar na agenda       |");
			System.out.println("                  |     0 - Sair                      |");
			System.out.println("                  ===================================\n");
			System.out.print("\nOpção -> ");
			opcao = ler.nextInt();
			System.out.print("\n");
			switch (opcao) {
			case 1:
				adicionar();
				break;
			case 2:
				remover();
				break;

			case 3:
				listar();
				break;
			case 4:
				alterar();
				break;
			case 5:
				pesquisar();
				break;
			case 0:
				System.out.println("Aplicação Finalizada");
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
	}
	
	public static void adicionar() throws IOException {
		
		String nome;
		String telefone;
		String endereco;
		String email;
		String celular;
		
		System.out.print("Nome: ");
		nome = ler.next();
		
		System.out.print("Telefone: ");
		telefone = ler.next();
		
		System.out.print("Nascimento: ");
		endereco = ler.next();
		
		ler.nextLine();
		
		System.out.print("E-mail: ");
		email = ler.nextLine();

		System.out.print("Celular: ");
		celular = ler.nextLine();
		
		
		Pessoa pessoa = new Pessoa(nome, telefone, endereco, email, celular);
		System.out.println("\n" + AgendaController.adicionandoPessoa(pessoa));
		
		System.out.print("\n\n|Pressione <<<<ENTER>>>> para continuar|");
		System.in.read();
	}
	public static void remover() throws IOException {
		int id;
		if (AgendaController.listarPessoas() != null){
			System.out.println(AgendaController.listarPessoas());
			
			System.out.print("\nDigite o id do contato a ser removido: ");
			id = ler.nextInt();
			System.out.println(AgendaController.removePessoa(id));
		}

		System.out.print("\n\n|Pressione <<<<ENTER>>>> para continuar|");
		System.in.read();
	}
	
	public static void listar() throws IOException {
		if (AgendaController.listarPessoas() != null) {
			System.out.println(AgendaController.listarPessoas());
		}

		System.out.print("\n\n|Pressione <<<<ENTER>>>> para continuar|");
		System.in.read();
	}
	
	public static void alterar() throws IOException {
		int id;
		if (AgendaController.listarPessoas() != null) {
			System.out.println(AgendaController.listarPessoas());
			System.out.print("\nDigite o id do contato a ser alterado: ");
			id = ler.nextInt();
			System.out.println(AgendaController.alteraInformacao(id));
		}
		
		System.out.print("\n\n|Pressione <<<<ENTER>>>> para continuar|");
		System.in.read();
	}
	public static void pesquisar() throws IOException {
		if (AgendaController.listarPessoas() != null) {
			System.out.println(AgendaController.pesquisaInformacao());
		}

		
	}
}
