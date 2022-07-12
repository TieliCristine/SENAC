package principal;

import entidade.Endereco;
import entidade.Funcionario;
import entidade.Gerente;

import java.util.Scanner;

public class ProgramaTestaFuncionario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Endereco ruaLegal = new Endereco("88032-564", "rua Almirante Lamego", "789", "Centro", "SC");
        Endereco ruaLegal = new Endereco();
        ruaLegal.setBairro("Limoeiro");
        ruaLegal.setNumero("10");
        ruaLegal.setCep("789456-789");

        Funcionario srCebola = new Funcionario("Cebolao", 5000, ruaLegal);
        srCebola.setEndereco(ruaLegal);

        //System.out.println("Informe o nome do gerente:");
        //String nomeGerente = entrada.nextLine();

//		System.out.println("Informe o salário do gerente:");
//		double salarioGerente = entrada.nextDouble();

        //String cep, String logradouro, String numero, String bairro, String estado
        Endereco endereco1 = new Endereco("789456-789", "rua tal", "245", "Costa", "RS");

        Endereco endereco2 = new Endereco("566666-789", "rua Julho", "12", "Centro", "SC");

//		Gerente gerenteDaFirma = new Gerente(nomeGerente, salarioGerente);
        Gerente gerenteDaFirma = new Gerente("Luciano", 5000, "TI", endereco1);
        Funcionario gerentePedro = new Gerente("Pedro", 1000, "RH", endereco2);
        Funcionario funcionarioMaria = new Funcionario("Maria", 2000, ruaLegal);


        Funcionario[] empregadosDaFirma = new Funcionario[5];
        empregadosDaFirma[0] = gerenteDaFirma;
        empregadosDaFirma[1] = gerentePedro;
        empregadosDaFirma[2] = funcionarioMaria;

        double totalFolha = 0;
        double totalFolhaSomenteGerentes = 0;

        for (int i = 0; i < empregadosDaFirma.length; i++) {
            Funcionario funcionarioAtual = empregadosDaFirma[i];
            if(funcionarioAtual != null) {
                System.out.println("Funcionário atual: " + funcionarioAtual.getNome());
                totalFolha += funcionarioAtual.calcularPagamento();

                if(funcionarioAtual instanceof Gerente) {
                    totalFolhaSomenteGerentes += funcionarioAtual.calcularPagamento();
                }
            }
        }

        System.out.println("Total da folha: " + totalFolha);
        System.out.println("Total da folha dispendida com GERENTES: "
                + totalFolhaSomenteGerentes);




//		System.out.println("O salário do gerente " + gerenteDaFirma.getNome()
//							+ " é: " + gerenteDaFirma.calcularPagamento());
//

    }
}