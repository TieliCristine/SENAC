package listaExercicios01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[][] notaAluno = new String[5][4];
        String[] aluno = new String[5];
        int[] nota1 = new int[5];
        int[] nota2 = new int[5];
        int linha = 0;
        int coluna = 0;
        int c = 0;

        System.out.println("Nome do aluno: ");
        aluno[linha] = entrada.next();
        aluno[linha] = entrada.next();
        notaAluno[linha][coluna] = String.valueOf(Integer.parseInt(aluno[linha]));
        coluna++;

        System.out.println("Nota 1: ");
        nota1[linha] = entrada.nextInt();
        notaAluno[linha][coluna] = String.valueOf(nota1[linha]);
        coluna++;

        System.out.println("Nota 2: ");
        nota2[linha] = entrada.nextInt();
        notaAluno[linha][coluna] = String.valueOf(nota2[linha]);
        coluna++;

        System.out.println("Nome " + aluno);
        System.out.println("Nota 1 " + nota1);
        System.out.println("Nota 2 " + nota2);
    }
}
