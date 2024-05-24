package br.edu.up.controle;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.modelo.Cliente;
import br.edu.up.daos.GerenciadorDeArquivosDAO;
import br.edu.up.modelos.ClientePessoa;

public class ControleDeClientes{
    
    private List <cliente> clientes;

    public ControleDeClientes(){
        GerenciadorDeArquivosDAO dao = new GerenciadorDeArquivosDAO();
        this.clientes = dao.getClientes();
    }

    public List<ClientePessoa> getClientesPessoa(){
        List<ClientePessoa> clientesPessoa = new ArrayList<>();

        for (Cliente cliente : clientes) {
            if (cliente instanceof ClientePessoa){
                clientesPessoa.add((ClientePessoa)cliente);
            }
        }
        return clientesPessoa;
    }

}