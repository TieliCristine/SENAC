import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] nome = new String[3];
        float[] salario = new float[3];
        int[] filhos = new int[3];

        for(int c = 0; c<3; c++) {
            System.out.print("Nome: ");
            nome[c] = teclado.next();
            System.out.print("Salario: ");
            salario[c] = teclado.nextFloat();
            System.out.print("Qtd. Filhos: ");
            filhos[c] = teclado.nextInt();
        }


    }

}

