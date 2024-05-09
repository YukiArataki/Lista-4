package br.edu.up.telas;
import java.util.Scanner;
import br.edu.up.controles.Estacionamento;

public class Menu {

    Scanner leitor = new Scanner(System.in);

    public void mostrar(){
        int opcao;
        String msgMenu = "";
        msgMenu += "Entre com opção desejada: \n";
        msgMenu += "1 - Entrada de veículos\n"; 
        msgMenu += "2 - Sair\n";

        System.out.println(msgMenu);
        
        opcao = leitor.nextInt();
        
        switch(opcao){
            case 1:
            registrarVeiculo();
                break;

            case 2:
            saida();
                break;

            default:
                System.out.println("Opção Inválida!"); 
        }
        
    }

    public void registrarVeiculo(){
        int tmpTipo, numVaga;
        System.out.println("Qual  a quantidade de vagas?");
        int vagas = leitor.nextInt();

        Estacionamento a[] = new Estacionamento[vagas];
        String c="";

        for(int i=0;i<vagas;i++) {
            a[i]= new Estacionamento();
            System.out.println("Qual a cor do carro: "+i);
            String marca = leitor.next();

            System.out.println("Qual o modelo do carro: "+i);
            String modelo = leitor.next();

            System.out.println("Qual a placa do carro: "+i);
            String placa = leitor.next();

            System.out.println("Qual  a hora de entrada do carro "+i);
            float entrada = leitor.nextFloat();

            System.out.println("Qual  a hora de saida do carro "+i);
            float saida = leitor.nextFloat();
            c = a[i].Criarcarro(marca, modelo, placa, entrada,saida);
        }

        for(int i=0;i<vagas;i++) {
        System.out.println(" O "+(i+1)+ " Carro é: " +c +"\n"+" A entrada foi as: "+a[i].getEntrada() +" horas "+ "\n" + " A hora de saida foi: "+a[i].getSaida()+ "horas"+"\n" +" O preço foi: R$:"+ a[i].getPreco() +"\n");
        }
    }

    public void saida (){

    }
}