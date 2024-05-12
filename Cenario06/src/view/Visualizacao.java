package view;

import controller.Controlador;
import model.Passageiro;
import model.Passagem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Visualizacao {
    private Controlador controlador;
    private Scanner scanner;

    public Visualizacao(Controlador controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Adicionar Passageiro");
            System.out.println("2. Adicionar Tripulação");
            System.out.println("3. Adicionar Aeronave");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarPassageiro();
                    break;
                case 2:
                    adicionarTripulacao();
                    break;
                case 3:
                    adicionarAeronave();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    private void adicionarPassageiro() {
        System.out.println("Digite o nome do passageiro:");
        String nome = scanner.nextLine();
        System.out.println("Digite o RG do passageiro:");
        String rg = scanner.nextLine();
        System.out.println("Digite o identificador de bagagem do passageiro:");
        String identificadorBagagem = scanner.nextLine();
        System.out.println("Digite o número do assento:");
        int numeroAssento = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite a classe do assento:");
        String classeAssento = scanner.nextLine();
        System.out.println("Digite a data do voo (dd/MM/yyyy HH:mm):");
        String dataVooStr = scanner.nextLine();
        Date dataVoo = null;
        try {
            dataVoo = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dataVooStr);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido.");
            return;
        }
        Passagem passagem = new Passagem(numeroAssento, classeAssento, dataVoo);
        Passageiro passageiro = new Passageiro(nome, rg, identificadorBagagem, passagem);
        controlador.adicionarPassageiro(passageiro);
        System.out.println("Passageiro adicionado com sucesso!");
    }

    private void adicionarTripulacao() {
        
    }

    private void adicionarAeronave() {
       
    }
}