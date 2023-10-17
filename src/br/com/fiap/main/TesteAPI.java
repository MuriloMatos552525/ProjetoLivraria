package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.beans.Endereco;
import br.com.fiap.services.ViaCepService;

public class TesteAPI {

    public static void main(String[] args) throws ClientProtocolException, IOException {

        ViaCepService viaCepService = new ViaCepService();

        String cep = JOptionPane.showInputDialog("Informe o cep para busca");

        Endereco endereco = viaCepService.getEndereco(cep);

        String logradouro = endereco.getLogradouro();
        String bairro = endereco.getBairro();
        
        System.out.println(cep + "\n" + logradouro + "\n" + bairro);
        

    }
    
}
