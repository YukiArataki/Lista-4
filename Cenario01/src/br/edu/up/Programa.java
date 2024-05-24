package br.edu.up;
import java.util.Scanner;

import br.edu.up.modelos.Livro;

public class  Programa{

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual é o código do livro ?");
        String codigo = leitor.next();

        System.out.println("Qual o titulo do livro ?");
        String titulo = leitor.next();

        System.out.println("Quem são os autores ?");
        String autor = leitor.next();

        System.out.println("Digite a ISBN do livro ");
        String isbn = leitor.next();

        System.out.println("Qual o ano de publicação do livro ?");
        int ano = leitor.nextInt();

        for (int i = 0; i < 2; i++) {
            
        }
    }
}
