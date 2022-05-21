import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double conta, saldo, debito, credito, saldoAtual;

        System.out.println("Numero da conta: ");
        conta = teclado.nextDouble();
        System.out.println("Saldo: ");
        saldo = teclado.nextDouble();
        System.out.println("Debito: ");
        debito = teclado.nextDouble();
        System.out.println("Credito: ");
        credito = teclado.nextDouble();

        saldoAtual = (saldo - debito) + credito;

        if (saldoAtual >= 0) {
            System.out.println("Conta: " + conta);
            System.out.println("Saldo do dia: " + saldoAtual);
            System.out.println("Saldo positivo.");
        } else {
            System.out.println("Conta: " + conta);
            System.out.println("Saldo do dia: " + saldoAtual);
            System.out.println("Saldo negativo.");
        }
    }
}
