package br.edu.up.telas.menu;
import java.util.Scanner;
import br.edu.up.controle.Dado;

public class Menu {
     Scanner leitor = new Scanner(System.in);
        int opcao;
        do{
            exibirMenu();
            opcao = scanner.nexInt();
            scanner.nextLine();

            switc(opcao){
                case 1:
                incluirClientePessoaEmpressa();
                break;
                case 2:
                mostrarDadosClientePessoaEmpressa();
                break;
                case 3:
                emprestrarParaClientePessoaEmpressa()
                break;
                case 4:
                devolucaoDeClientePessoaEmpressa();
                break;
                case 5:
                System.out.println("Saindo...");
                break;
                default:
                System.out.println("Opcao inválida. Tente novamente.");
                break;
            }
        }while(opcao =! 5);
    }

    private static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Incluir cliente pessoa/empresa");
        System.out.println("2. Mostrar dados cliente pessoa/empresa");
        System.out.println("3. Emprestrar para cliente pessoa/empresa");
        System.out.println("4. Devolução de cliente pessoa/empresa");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void incluirClientePessoa() {
        System.out.println("Tipo de cliente: ");
        System.out.println("1. cliente pessoa");
        System.out.println("2. cliente empressa");
        int tipo = scanner.nextInt();
        scanner.nextLine(); 
    }

    System.out.print("Nome do cliente pessoa/empressa: ");
    String nome = leitor.nextLine();

    if (tipo == 1){
    System.out.println("Qual o CPF do cliente?");
    string cpf = leitor.nextString();
    System.out.println("Qual a altura do cliente?")
    double altura = leitor.nextDouble();
    string.out.println("Qual o peso do cliente?");
    double altura = leitor.nextDouble();
    leitor.nextLine();
    }else if (tipo == 2) {
        System.out.println("Qual o CNPJ da empressa");
        string cnpj = leitor.nextString();
        System.out.println("Qual o INSC Estadual da empressa");
        string inscEstadual = leitor.nextString();
        System.out.println("Em que ano a empressa foi fundada");
        int anoFundacao = leitor.nexInt();
    }

    private static void mostrarDadosClientePessoa/Empressa() {

    }
    