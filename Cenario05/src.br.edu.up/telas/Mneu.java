package br.edu.up.telas;
import java.util.Scanner;
import br.edu.up.controles.arquivo;

public class Mneu {

    Scanner leitor = new Scanner(System.in);

    public void mostrar() {
        int opcao;
        do{
            System.out.println("===Menu===");
            System.out.println("1.Inclusão de eventos e reservas");
            System.out.println("2.Alteração de eventos e reservas");
            System.out.println("3.Listagem de eventos e reservas");
            System.out.println("4.Exclusão de eventos e reservas");
            System.out.println("5.Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch(opcao) {
                case 1: 
                Inclusão de eventos e reservas();
                break;
                case 2:
                Alteração de eventos e reservas();
                break;
                case 3:
                Listagem de eventos e reservas();
                break;
                case 4:
                Exclusão de eventos e reservas();
                break;
                case 5:
                System.out.println("Saindo...");
                break;
                default:
                System.out.println("Opção inválida. Tente outra vez.");
            }
            while(opcao != 5);
        }
    }

    private void 

}
