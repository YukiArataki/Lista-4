package br.edu.up.telas.menu;
import java.util.Scanner;
import br.edu.up.controle.Dado;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do{
            exibirMenu();
            opcao = scanner.nexInt();
            scanner.nextLine();

            switc(opcao){
                case 1:
                incluirClientePessoa();
                break;
                case 2:
                incluirClienteEmpresa();
                break;
                case 3:
                mostrarDadosClientePessoa()
                break;
                case 4:
                mostrarDadosClienteEmpressa();
                break;
                case 5:
                emprestrarParaClientePessoa();
                break;
                case 6:
                emprestrarParaClienteEmpressa();
                break;
                case 7:
                devolucaoDeClientePessoa();
                break;
                case 8:
                devolucaoDeClienteEmpressa();
                break;
                case 9:
                System.out.println("Saindo...");
                break;
                default:
                System.out.println("Opcao inválida. Tente novamente.");
                break;
            }
        }while(opcao =! 9);
    }

    private static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Incluir cliente pessoa");
        System.out.println("2. Incluir cliente empresa");
        System.out.println("3. Mostrar dados cliente pessoa");
        System.out.println("4. Mostrar dados cliente empressa");
        System.out.println("5. Emprestrar para cliente pessoa");
        System.out.println("6. Emprestrar para cliente empressa")
        System.out.println("7. Devolução de cliente pessoa");
        System.out.println("8. Devolução de cliente empressa");
        System.out.println("9. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void incluirClientePessoa() {
        
    }
}