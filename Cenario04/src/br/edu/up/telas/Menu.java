package br.edu.up.telas;
import java.util.Scanner;
import br.edu.up.controles.Estacionamento;

public class Menu {

    Scanner leitor = new Scanner(System.in);

    public void mostrar(){
        int opcao;
        String msgMenu = "";
        msgMenu += "Entre com opção desejada: \n";
        msgMenu += "1 - Visualizar mapa de vagas\n"; 
        msgMenu += "2 - Entrada de veículos\n";
        msgMenu += "3 - Saída de veículos\n";
        msgMenu += "4 - Relatório\n";
        msgMenu += "5 - Sair\n";
       
        do{
        
        opcao = leitor.nextInt();
        
        switch(opcao){
            case 1:
                leitor.nextInt()(null,leitor.next(),"CIC Park",leitor.nextInt());
                break;

            case 2:
                registrarVeiculo();
                break;

            case 3:
                liberarVaga();
                break;

            case 4:
                leitor.nextI(null, leitor.next());
                break;

            case 5:
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida!","Estacionamento",leitor.WARNING_MESSAGE); 
        }
        
        }while(opcao!=5);
    }  
    public static void registrarVeiculo(){
        int tmpTipo, numVaga;
        int vagas = Integer.parseInt(leitor.showInputDialog("Qual  a quantidade de vagas"));
        Estacionamento a[] = new Estacionamento[vagas];
        String c="";

        for(int i=0;i<vagas;i++) {
            a[i]= new Estacionamento();
            String marca = leitor.showInputDialog("Qual a marca do carro: "+i);
            String modelo = leitor.showInputDialog("Qual o modelo do carro: "+i);
            String placa = leitor.showInputDialog("Qual a placa do carro: "+i);
            float entrada = Float.parseFloat(leitor.showInputDialog("Qual  a hora de entrada do carro "+i));
            float saida = Float.parseFloat(leitor.showInputDialog("Qual  a hora de saida do carro "+i));
            c = a[i].Criarcarro(marca, modelo, placa, entrada,saida);
        }

        for(int i=0;i<vagas;i++) {
            leitor.showMessageDialog(null," O "+(i+1)+ " Carro é: " +c +"\n"+" A entrada foi as: "+a[i].getEntrada() +" horas "+ "\n" + " A hora de saida foi: "+a[i].getSaida()+ "horas"+"\n" +" O preço foi: R$:"+ a[i].getPreco() +"\n");
        }
    }

    }
