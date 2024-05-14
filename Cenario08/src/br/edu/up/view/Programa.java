package main.java.view;

import java.util.List;
import java.util.Scanner;

import main.java.controller.AgendaController;
import main.java.model.Contato;
import main.java.model.ContatoPessoal;
import main.java.model.ContatoComercial;

public class Programa {
    private static Scanner scanner = new Scanner(System.in);
    private static AgendaController agenda = new AgendaController();

    public static void main(String[] args)  {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarContatoPessoal();
                    break;
                case 2:
                    adicionarContatoComercial();
                    break;
                case 3:
                    removerContato();
                    break;
                case 4:
                    exibirContato();
                    break;
                case 5:
                    exibirTodosContatos();
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 6);
    }

    private static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Adicionar contato pessoal");
        System.out.println("2. Adicionar contato comercial");
        System.out.println("3. Remover contato");
        System.out.println("4. Exibir contato");
        System.out.println("5. Exibir todos os contatos");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarContatoPessoal() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        ContatoPessoal contatoPessoal = new ContatoPessoal(nome, telefone, email);
        agenda.adicionarContato(contatoPessoal);
        System.out.println("Contato pessoal adicionado com sucesso.");
    }

    private static void adicionarContatoComercial() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Empresa: ");
        String empresa = scanner.nextLine();
        ContatoComercial contatoComercial = new ContatoComercial(nome, telefone, empresa);
        agenda.adicionarContato(contatoComercial);
        System.out.println("Contato comercial adicionado com sucesso.");
    }

    private static void removerContato() {
        System.out.print("Índice do contato a ser removido: ");
        int indice = scanner.nextInt();
        agenda.removerContato(indice);
        System.out.println("Contato removido com sucesso.");
    }

    private static void exibirContato() {
        System.out.print("Índice do contato a ser exibido: ");
        int indice = scanner.nextInt();
        Contato contato = agenda.obterContato(indice);
        if (contato != null) {
            System.out.println(contato.obterInformacoes());
        }
    }

    private static void exibirTodosContatos() {
        List<Contato> contatos = agenda.listarContatos();
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println("Contato " + (i + 1) + ":");
            System.out.println(contatos.get(i).obterInformacoes());
            System.out.println();
        }
    }
}