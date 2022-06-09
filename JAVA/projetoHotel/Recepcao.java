package projetoHotel;
import jdk.swing.interop.SwingInterOpUtils;
import java.util.Scanner;

public class Recepcao {
    static Scanner teclado = new Scanner(System.in);

    //Variaveis menu principal

    static int acao, acaoCliente, acaoQuarto;

    //Variaveis cliente

    static String[][] cliente = new String[20][9];
    static String[] nome = new String[20];
    static String[] dataNasc = new String[20];
    static String[] cpf = new String[20];
    static String[] email = new String[20];
    static String[] telefone = new String[20];
    static String[] fumante = new String[20];
    static String[] cidade = new String[20];
    static String[] uf = new String[20];
    static int conjuntoLinha;
    static int cLinha = 0;
    static int cColuna = 0;
    static int cc = 1;

    //Variaveis quarto

    static String[][] quarto = new String[20][6];
    static String[] numero = new String[20];
    static String[] posicao = new String[20];
    static String[] qtdPessoas = new String[20];
    static String[] vlrDiaria = new String[20];
    static String[] qrtoFumante = new String[20];

    public static void main(String[] args) {

        do {
            System.out.println("=================================================");
            System.out.println("          SISTEMA DE GERENCIAMENTO DE HOTEL      ");
            System.out.println("                HOTEL  TRANSILVANIA              ");
            System.out.println("                   MEU PRINCIPAL                 ");
            System.out.println("=================================================");
            System.out.println("");
            System.out.println("Escolha uma acao: ");
            System.out.println("");
            System.out.println("1 - Cadastrar, editar ou excluir clientes");
            System.out.println("2 - Cadastrar, editar ou excluir quartos");
            System.out.println("3 - Verificar quartos disponiveis");
            System.out.println("4 - Realizar check-in");
            System.out.println("5 - Realizar check-out");
            System.out.println("0 - Sair do sistema");
            acao = teclado.nextInt();
            switch (acao) {
                case 1: // Menu cliente
                    System.out.println("=================================================");
                    System.out.println("                HOTEL  TRANSILVANIA              ");
                    System.out.println("                CADASTRO DO CLIENTE              ");
                    System.out.println("=================================================");
                    System.out.println("");
                    System.out.println("Escolha uma acao: ");
                    System.out.println("");
                    System.out.println("1 - Cadastrar cliente");
                    System.out.println("2 - Editar cliente");
                    System.out.println("3 - Listar clientes");
                    System.out.println("4 - Excluir cliente");
                    acaoCliente = teclado.nextInt();
                    switch (acaoCliente) {
                        case 1:  // Cadastrar cliente
                            System.out.println("Nome do Cliente: ");
                            nome[cLinha] = "Nome: " + teclado.nextLine();
                            nome[cLinha] = "Nome: " + teclado.nextLine();
                            cliente[cLinha][cColuna] = nome[cLinha];
                            cColuna++;

                            System.out.println("CPF: ");
                            cpf[cLinha] = "CPF: " + teclado.nextLine();
                            cliente[cLinha][cColuna] = cpf[cLinha];
                            cColuna++;

                            System.out.println("Data de Nasc.:");
                            dataNasc[cLinha] = "Data de Nasc.: " + teclado.nextLine();
                            cliente[cLinha][cColuna] = dataNasc[cLinha];
                            cColuna++;

                            System.out.println("Telefone: ");
                            telefone[cLinha] = "Telefone: " + teclado.nextLine();
                            cliente[cLinha][cColuna] = telefone[cLinha];
                            cColuna++;

                            System.out.println("E-mail: ");
                            email[cLinha] = "E-mail: " + teclado.nextLine();
                            cliente[cLinha][cColuna] = email[cLinha];
                            cColuna++;

                            System.out.println("Cidade: ");
                            cidade[cLinha] = "Cidade: " + teclado.nextLine();
                            cliente[cLinha][cColuna] = cidade[cLinha];
                            cColuna++;

                            System.out.println("UF: ");
                            uf[cLinha] = "UF: " + teclado.nextLine();
                            cliente[cLinha][cColuna] = uf[cLinha];
                            cColuna++;

                            System.out.println("Fumante? ");
                            fumante[cLinha] = "Fumante? " + teclado.nextLine();
                            cliente[cLinha][cColuna] = fumante[cLinha];
                            cLinha++;
                            cColuna = 0;
                            conjuntoLinha = cLinha;
                            break;
                        case 2: // Editar cliente
                            System.out.println("Lista de Clientes:");
                            System.out.println();
                            for (cLinha = 0; cLinha < conjuntoLinha; cLinha++) {
                                System.out.println();
                                System.out.println("Cliente " + cc + ": ");
                                cc++;
                                for (cColuna = 0; cColuna < 1; cColuna++) {
                                    System.out.println(cliente[cLinha][cColuna]);
                                }
                            }
                            break;
                        case 3: // Listar cliente
                            System.out.println("Lista de Clientes:");
                            System.out.println();
                            for (cLinha = 0; cLinha < conjuntoLinha; cLinha++) {
                                System.out.println();
                                System.out.println("Cliente " + cc + ": ");
                                System.out.println(); cc++;
                                for (cColuna = 0; cColuna < 8; cColuna++) {
                                    System.out.println(cliente[cLinha][cColuna]);
                                }
                            }
                            break;
                        case 4: // Excluir cliente
                            break;
                    }
                    break;
                case 2: // Menu quarto
                    break;
                case 3: // Verificação quartos
                    break;
                case 4: // check-in
                    break;
                case 5: // check-out
                    break;
            }
        } while (acao != 0);
    }
}








         /*

        } else if (acao == 2) {
            System.out.println("=================================================");
            System.out.println("                HOTEL  TRANSILVANIA              ");
            System.out.println("               CADASTRO  DO  QUARTO              ");
            System.out.println("=================================================");
            System.out.println("");
            System.out.println("Escolha uma acao: ");
            System.out.println("");
            System.out.println("1 - Cadastrar quarto");
            System.out.println("2 - Editar quarto");
            System.out.println("3 - Listar quartos");
            System.out.println("4 - Excluir quarto");
            acaoQuarto = teclado.nextInt();
            switch (acaoQuarto) {
                case 1:
                    System.out.println("Numero do quarto: ");
                    numero[0] = teclado.nextLine();
                    quarto[0][0] = numero[0];

                    System.out.println("Posicao do quarto: ");
                    posicao[0] = teclado.nextLine();
                    quarto[0][1] = posicao[0];

                    System.out.println("Quantidade de pessoas: ");
                    qtdPessoas[0] = teclado.nextLine();
                    quarto[0][2] = qtdPessoas[0];

                    System.out.println("Valor da diaria: ");
                    vlrDiaria[0] = teclado.nextLine();
                    quarto[0][3] = vlrDiaria[0];

                    System.out.println("Comporta fumantes? (1 - sim / 2 - nao) ");

                    break;
                case 2:
                    System.out.println("Numero do quarto: ");
                    break;
                case 3:
                    System.out.println("Listar quartos: ");
                    break;
                case 4:
                    System.out.println("Numero do quarto: ");
                    break;
            }
        } else if (acao == 3) {
            System.out.println("Quartos disponiveis: ");
        } else if (acao == 4) {
            System.out.println("Digite o CPF: ");
        } else if (acao == 5) {
            System.out.println("Digite o CPF: ");
        } else if (acao == 0) {
            System.out.println("Aplicacao finalizada. ");
        }







        /*
        } else if (acao == 2) {
            System.out.println("=================================================");
            System.out.println("                HOTEL TRANSILVANIA               ");
            System.out.println("                CADASTRO DO QUARTO               ");
            System.out.println("=================================================");
            System.out.println("");
            System.out.println("Escolha uma acao: ");
            System.out.println("");
            System.out.println("1 - Cadastrar quarto");
            System.out.println("2 - Editar quarto");
            System.out.println("3 - Listar quartos");
            System.out.println("4 - Excluir quarto");
        } else if (acao == 3) {
            System.out.println("=================================================");
            System.out.println("                HOTEL TRANSILVANIA               ");
            System.out.println("               CONSULTA DE QUARTOS               ");
            System.out.println("=================================================");
            System.out.println("");
            System.out.println("Escolha uma acao: ");
            System.out.println("");
            System.out.println("1 - Listar todos os clientes ");
            System.out.println("2 - Consultar cliente por CPF ");
            System.out.println("3 - Editar cliente ");
            System.out.println("4 - Excluir cliente ");
        } else if (acao == 4) {
            System.out.println("=================================================");
            System.out.println("                HOTEL TRANSILVANIA               ");
            System.out.println("               CONSULTA DE QUARTOS              ");
            System.out.println("=================================================");
            System.out.println("");
            System.out.println("");
            System.out.println("Preencha os dados: ");
            System.out.println("");
            System.out.println("1 - Listar quartos"); */