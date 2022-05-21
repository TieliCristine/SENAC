import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media, provaFinal;

        System.out.println("Nota primeiro bimestre: ");
        nota1 = teclado.nextFloat();
        System.out.println("Nota segundo bimestre: ");
        nota2 = teclado.nextFloat();
        System.out.println("Nota terceiro bimestre: ");
        nota3 = teclado.nextFloat();
        System.out.println("Nota quarto bimestre: ");
        nota4 = teclado.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4)/4;

        if (media < 6) {
            System.out.printf("Média do aluno: %.1f", media);
            System.out.println(" O aluno está reprovado.");
        } else if (media >= 6 && media < 7) {
            System.out.printf("Média do aluno: %.1f", media);
            System.out.println(" O aluno precisará realizar exame final.");
        } else {
            System.out.printf("Média do aluno: %.1f", media);
            System.out.println(" O aluno está aprovado.");
        }
        System.out.println("Digite a nota do exame: ");
        provaFinal = teclado.nextFloat();

        if (provaFinal >= 7) {
            System.out.println(" O aluno está aprovado.");
        } else {
            System.out.println(" O aluno está reprovado.");
        }
    }
}
