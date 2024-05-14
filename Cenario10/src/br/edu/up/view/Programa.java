package br.edu.up.view;

import java.util.List;
import java.util.Scanner;

import br.edu.up.controller.SeguroController;
import br.edu.up.model.Seguro;
import br.edu.up.model.SeguroVida;
import br.edu.up.model.SeguroVeiculo;

public class Programa {
    private static Scanner scanner = new Scanner(System.in);
    private static SeguroController controller = new SeguroController();

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    incluirSeguro();
                    break;
                case 2:
                    localizarSeguro();
                    break;
                case 3:
                    excluirSeguro();
                    break;
                case 4:
                    excluirTodosSeguros();
                    break;
                case 5:
                    listarTodosSeguros();
                    break;
                case 6:
                    verQuantidadeSeguros();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 7);
    }

    private static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Incluir seguro");
        System.out.println("2. Localizar seguro");
        System.out.println("3. Excluir seguro");
        System.out.println("4. Excluir todos os seguros");
        System.out.println("5. Listar todos os seguros");
        System.out.println("6. Ver quantidade de seguros");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void incluirSeguro() {
        System.out.println("Tipo de seguro:");
        System.out.println("1. Seguro de Vida");
        System.out.println("2. Seguro de Veículo");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Número da Apólice: ");
        String numeroApolice = scanner.nextLine();

        if (controller.localizarSeguro(numeroApolice) != null) {
            System.out.println("Número da apólice já existe. Tente novamente.");
            return;
        }

        System.out.print("Nome do Segurado: ");
        String nomeSegurado = scanner.nextLine();

        if (tipo == 1) {
            System.out.print("Valor da Cobertura: ");
            double valorCobertura = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer

            SeguroVida seguroVida = new SeguroVida(numeroApolice, nomeSegurado, valorCobertura);
            controller.adicionarSeguro(seguroVida);
            System.out.println("Seguro de Vida adicionado com sucesso.");
        } else if (tipo == 2) {
            System.out.print("Placa do Veículo: ");
            String placaVeiculo = scanner.nextLine();

            SeguroVeiculo seguroVeiculo = new SeguroVeiculo(numeroApolice, nomeSegurado, placaVeiculo);
            controller.adicionarSeguro(seguroVeiculo);
            System.out.println("Seguro de Veículo adicionado com sucesso.");
        } else {
            System.out.println("Tipo de seguro inválido. Tente novamente.");
        }
    }

    private static void localizarSeguro() {
        System.out.print("Número da Apólice: ");
        String numeroApolice = scanner.nextLine();
        Seguro seguro = controller.localizarSeguro(numeroApolice);
        if (seguro != null) {
            System.out.println(seguro.obterDetalhes());
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    private static void excluirSeguro() {
        System.out.print("Número da Apólice: ");
        String numeroApolice = scanner.nextLine();
        if (controller.excluirSeguro(numeroApolice)) {
            System.out.println("Seguro excluído com sucesso.");
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    private static void excluirTodosSeguros() {
        System.out.print("Tem certeza que deseja excluir todos os seguros? (S/N): ");
        String confirmacao = scanner.nextLine();
        if (confirmacao.equalsIgnoreCase("S")) {
            controller.excluirTodosSeguros();
            System.out.println("Todos os seguros foram excluídos.");
        } else {
            System.out.println("Operação cancelada.");
        }
    }

    private static void listarTodosSeguros() {
        List<Seguro> seguros = controller.listarTodosSeguros();
        if (seguros.isEmpty()) {
            System.out.println("Nenhum seguro cadastrado.");
        } else {
            for (Seguro seguro : seguros) {
                System.out.println(seguro.obterDetalhes());
            }
        }
    }

    private static void verQuantidadeSeguros() {
        int quantidade = controller.quantidadeSeguros();
        System.out.println("Quantidade de seguros cadastrados: " + quantidade);
    }
}