package br.edu.up.telas;
import java.util.Scanner;
import br.edu.up.contrles.;

public class Menu {
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
                    incluirclientePessoal();
                    break;
                case 2:
                    incluirclienteEmprasa();
                    break;
                case 3:
                    mostratdadosclientePessoa();
                    break;
                case 4:
                    mostrardadosclienteEmpresa();
                    break;
                case 5:
                    emprestrarparaclientePessoa();
                    break;
                case 6:
                    emprestrarparaclienteEmpresa();
                    break;
                case 7:
                    devolucaodeclientePessoa();
                    break;
                case 8:
                    devolucaodeclienteEmpresa();
                    break;
                case 9:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 9);
    }
    private static void main

}
