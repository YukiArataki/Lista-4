package br.edu.up.telas;
import java.util.Scanner;
import br.edu.up.controles.arquivo;

public class Menu {

    private static void Scanner leitor = new leitor(System.in);

    public void mostrar() {
        int opcao; 

            switch(opcao) {
                case 1: 
                Inclusãodeeventosereservas();
                break;
                case 2:
                Alteraçãodeeventosereservas();
                break;
                case 3:
                Listagemdeeventosereservas();
                break;
                case 4:
                Exclusãodeeventosereservas();
                break;
                case 5:
                System.out.println("Saindo...");
                break;
                default:
                System.out.println("Opção inválida. Tente outra vez.");
            }
            while(opcao != 5);
        }

        private static void exibirMenu(){
            System.out.println("===Menu===");
            System.out.println("1.Inclusão de eventos e reservas");
            System.out.println("2.Alteração de eventos e reservas");
            System.out.println("3.Listagem de eventos e reservas");
            System.out.println("4.Exclusão de eventos e reservas");
            System.out.println("5.Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();
        }

        private static void Inclusãodeeventosereservas(){
            System.out.println("Tipo de evento e reserva:");
            System.out.println("1. evento");
            System.out.println("2. reserva");
            int tipo = leitor.nextInt();
            leitor.nextLine();

            System.out.print("Número de reservas: ");
            String numeroReserva = leitor.nextLine();
    
        }

        private static void Exclusãodeeventosereservas() {
            System.out.print("Número da Apólice: ");
            String numeroReserva = scanner.nextLine();
            if (controller.Exclusãodeeventosereservas(numeroReserva)) {
                System.out.println(" Reserva excluído com sucesso.");
            } else {
                System.out.println("Reserva não encontrado.");
            }
    }
}
