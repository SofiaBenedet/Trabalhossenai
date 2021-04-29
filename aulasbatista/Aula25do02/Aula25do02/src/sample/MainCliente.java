package sample;

import sample.model.Cliente;

public class MainCliente {

    public static void main(String [] args){
        Cliente cliente = new Cliente();

        cliente.setNome("Marcia");
        cliente.setEmail("marcia_ravadelli@estudante.sc.senai.br");
        cliente.setTelefone("(48) 92342-2342");
        cliente.setIdade(17);

        System.out.println(cliente);
    }

}
