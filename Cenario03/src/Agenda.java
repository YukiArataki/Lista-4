import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private Map<String, Compromisso> compromissos;

    public Agenda() {
        compromissos = new HashMap<>();
    }

    public void adicionarCompromisso(String data, int hora, String pessoa, String local, String assunto) {
        String chave = data + "-" + hora;
        Compromisso compromisso = new Compromisso(pessoa, local, assunto);
        compromissos.put(chave, compromisso);
    }

    public Compromisso obterCompromisso(String data, int hora) {
        String chave = data + "-" + hora;
        return compromissos.get(chave);
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarCompromisso("2024-05-08", 14, "João", "Café", "Reunião de Projeto");
        agenda.adicionarCompromisso("2024-05-09", 10, "Maria", "Escritório", "Apresentação de Vendas");

        Compromisso compromisso1 = agenda.obterCompromisso("2024-05-08", 14);
        if (compromisso1 != null) {
            System.out.println("Compromisso em 2024-05-08 às 14h: " + compromisso1);
        } else {
            System.out.println("Nenhum compromisso encontrado em 2024-05-08 às 14h.");
        }

        Compromisso compromisso2 = agenda.obterCompromisso("2024-05-09", 10);
        if (compromisso2 != null) {
            System.out.println("Compromisso em 2024-05-09 às 10h: " + compromisso2);
        } else {
            System.out.println("Nenhum compromisso encontrado em 2024-05-09 às 10h.");
        }
    }
}

class Compromisso {
    private String pessoa;
    private String local;
    private String assunto;

    public Compromisso(String pessoa, String local, String assunto) {
        this.pessoa = pessoa;
        this.local = local;
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return "Compromisso{" +
                "pessoa='" + pessoa + '\'' +
                ", local='" + local + '\'' +
                ", assunto='" + assunto + '\'' +
                '}';
    }
}