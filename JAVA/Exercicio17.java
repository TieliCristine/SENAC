import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int matricula, anoNasc, anoAdmit, idade, tempoEmp;

        //Entrada de dados:
        System.out.println("Matricula do empregado: ");
        matricula = teclado.nextInt();
        System.out.println("Ano de nascimento: ");
        anoNasc = teclado.nextInt();
        System.out.println("Ano de admissao na empresa: ");
        anoAdmit = teclado.nextInt();

        //Processamento de dados:
        idade = 2022 - anoNasc;
        tempoEmp = 2022 - anoAdmit;

        //Saída:
        if (idade >= 65 || tempoEmp >= 30) {
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Tempo de empresa: " + tempoEmp + " anos");
            System.out.println("Requerer aposentadoria.");
        } else {
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Tempo de empresa: " + tempoEmp + " anos");
            System.out.println("Nao requerer aposentadoria.");
        }
    }
}
