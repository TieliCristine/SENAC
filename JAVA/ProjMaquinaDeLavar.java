import java.util.Scanner;

public class ProjMaquinaDeLavar {
    static Scanner teclado = new Scanner(System.in);

    //variáveis utilizadas:
    static int peso, c, codMenu, estagioInicial, duraEstagio1, tempo1, duraEstagio2, tempo2, duraEstagio3, tempo3, duraEstagio4, tempo4, duraEstagio5, tempo5;
    static String nome, modelo, volts;

    //Funções:
    public static void menuPrincipal() {
        System.out.println("===============================================================");
        System.out.println("=                       MENU DE SIMULACAO                     =");
        System.out.println("===============================================================");
        System.out.println();
        System.out.println("1 - Configurar a maquina de lavar  ");
        System.out.println("2 - Simular a maquina de lavar  ");
        System.out.println("0 - Sair  ");
        System.out.println("Digite o codigo:  ");
        codMenu = teclado.nextInt();

    }
    public static void menuConfiguracao() throws InterruptedException {
        new Thread().sleep(2000);
        System.out.println("===============================================================");
        System.out.println("=                CONFIGURACAO DA MAQUINA DE LAVAR             =");
        System.out.println("===============================================================");
        System.out.println();

        System.out.print("Modelo:  ");
        modelo = teclado.nextLine();
        modelo = teclado.nextLine();

        System.out.print("Nome:  ");
        nome = teclado.nextLine();

        System.out.print("Voltagem (220V ou 110V ou 220/110V):  ");
        volts = teclado.nextLine();

        System.out.print("Quantidade kgs:  ");
        peso = teclado.nextInt();

        //Variável de duração de tempo de processamento dos estágios:

        System.out.print("Duracao do Estagio 1 - Lavacao Pesada:  ");
        duraEstagio1 = teclado.nextInt();
        tempo1 = duraEstagio1 * 1000;

        System.out.print("Duracao do Estagio 2 - Lavacao Normal:  ");
        duraEstagio2 = teclado.nextInt();
        tempo2 = duraEstagio2 * 1000;

        System.out.print("Duracao do Estagio 3 - Lavacao Rapida:  ");
        duraEstagio3 = teclado.nextInt();
        tempo3 = duraEstagio3 * 1000;

        System.out.print("Duracao do Estagio 4 - Enxague:  ");
        duraEstagio4 = teclado.nextInt();
        tempo4 = duraEstagio4 * 1000;

        System.out.print("Duracao do Estagio 5 - Centrifuga:  ");
        duraEstagio5 = teclado.nextInt();
        tempo5 = duraEstagio5 * 1000;
    }
    public static void menuSimulacao() throws InterruptedException {
        new Thread().sleep(2000);
        System.out.println("===============================================================");
        System.out.println("=                 SIMULACAO DA MAQUINA DE LAVAR               =");
        System.out.println("===============================================================");
        System.out.println();
        System.out.println("Simulando o Modelo:  " + modelo + " - " + nome + " - " + peso + " kg - Voltagem: " + volts);
        System.out.println();
    }
    public static void menuEstagio() throws InterruptedException {
        new Thread().sleep(2000);
        System.out.println("===============================================================");
        System.out.println("=                QUAL ESTAGIO VOCE DESEJA COMECAR?            =");
        System.out.println("===============================================================");
        System.out.println("1 - Lavacao Pesada ");
        System.out.println("2 - Lavacao Normal ");
        System.out.println("3 - Lavacao Leve ");
        System.out.println("4 - Enxague ");
        System.out.println("5 - Centrifugar ");
        System.out.println("Selecione o estagio inicial: ");
        estagioInicial = teclado.nextInt();
    }
    public static void estagio1() throws InterruptedException {
            for (c = 20; c <= 100; c += 20) {
                System.out.println("Estagio 1 - Em Lavacao Pesada: " + c + " % ");
                new Thread().sleep(tempo1);
            }
        }
    public static void estagio2() throws InterruptedException {
            for (c = 20; c <= 100; c += 20) {
                System.out.println("Estagio 2 - Em Lavacao Pesada: " + c + " % ");
                new Thread().sleep(tempo2);
            }
        }
    public static void estagio3() throws InterruptedException {
            for (c = 20; c <= 100; c += 20) {
                System.out.println("Estagio 3 - Em Lavacao Pesada: " + c + " % ");
                new Thread().sleep(tempo3);
            }
        }
    public static void estagio4() throws InterruptedException {
            for (c = 20; c <= 100; c += 20) {
                System.out.println("Estagio 4 - Em Lavacao Pesada: " + c + " % ");
                new Thread().sleep(tempo4);
            }
        }
    public static void estagio5() throws InterruptedException {
            for (c = 20; c <= 100; c += 20) {
                System.out.println("Estagio 5 - Em Lavacao Pesada: " + c + " % ");
                new Thread().sleep(tempo5);
            }
        }

    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        //Condicionamento do Menu Principal:
        do {
            menuPrincipal();
            if (codMenu == 1) {
                menuConfiguracao();
                menuSimulacao();
                menuEstagio();
                if (estagioInicial == 1) {
                    estagio1();
                    System.out.println();
                    estagio2();
                    System.out.println();
                    estagio3();
                    System.out.println();
                    estagio4();
                    System.out.println();
                    estagio5();
                    System.out.println();
                } else if (estagioInicial == 2) {
                    estagio2();
                    System.out.println();
                    estagio3();
                    System.out.println();
                    estagio4();
                    System.out.println();
                    estagio5();
                    System.out.println();
                }  else if (estagioInicial == 3) {
                    estagio3();
                    System.out.println();
                    estagio4();
                    System.out.println();
                    estagio5();
                    System.out.println();
                } else if (estagioInicial == 4) {
                    estagio4();
                    System.out.println();
                    estagio5();
                    System.out.println();
                } else if ( estagioInicial == 5) {
                    estagio5();
                    System.out.println();
                }
                codMenu = 0;
            } else if (codMenu == 2) {
                System.out.println("Erro: Primeiro configure a maquina de lavar ");
                new Thread().sleep(2000);
            }
        } while (codMenu != 0);
        System.out.println("Simulacao Finalizada");

    }
}
