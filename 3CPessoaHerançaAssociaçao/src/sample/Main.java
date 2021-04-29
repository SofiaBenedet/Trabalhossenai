package sample;


import sample.model.Endereco;
import sample.model.Pessoa;
import sample.model.PessoaFisica;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Jhow");
        System.out.println(pessoa);
        pessoa.setNome("Jhonatan");
        System.out.println(pessoa);

        Endereco endereco = new Endereco();
        endereco.setRua("Av. Rio Branco");
        endereco.setNumero(344);
        endereco.setBairro("Centro");
        endereco.setCep("88912-010");

        Pessoa pessoa2 = new PessoaFisica("Sofia", endereco);
        pessoa2.setRg("55.555.555");
        pessoa2.setCpf("90.883.999-12");
        System.out.println(pessoa2);

        PessoaFisica pessoa = new PessoaFisica("Jhow");
        pessoa.setEndereco("Rua dos Ricos", 12,
                "Jurere Internacional",
                "88222-123");
        pessoa.setRg("59.833.123");
        pessoa.setCpf("012.881.732");
        System.out.println(pessoa);

        @Override
        public String toString() {
            return "Nome: " + getNome()
                    + " CPF: " + cpf
                    + " RG: " + rg
                    + "\n" + getEndereco();
        }


    }
}