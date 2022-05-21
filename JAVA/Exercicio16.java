import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double vlrMorango, vlrMaca, qtdMorango, qtdMaca, resMorango, resMaca, somaKg, somaVlr, descValor, valorFinal;

        vlrMorango = 2.50;
        vlrMaca = 1.80;

        System.out.println("Qtd. morangos: ");
        qtdMorango = teclado.nextDouble();
        System.out.println("Qtd. macas: ");
        qtdMaca = teclado.nextDouble();

        if (qtdMorango > 5) {
            vlrMorango = 2.20;
        } else if (qtdMaca > 5) {
            vlrMaca = 1.50;
        }

        resMorango = vlrMorango * qtdMorango;
        resMaca = vlrMaca * qtdMaca;
        somaKg = qtdMorango + qtdMaca;
        somaVlr = resMorango + resMaca;

        if (somaKg > 8 || somaVlr > 25) {
            descValor = somaVlr * 0.1;
            valorFinal = somaVlr - descValor;
            System.out.printf("Valor total da compra com desconto: R$ %.2f %n", valorFinal);
        }   else {
            System.out.printf("Valor total da compra: R$ %.2f %n" + somaVlr);
        }
    }
}