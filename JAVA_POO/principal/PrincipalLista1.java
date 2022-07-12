package principal;

import entidade.Conta;

public class PrincipalLista1 {
    public static void main(String[] args) {
        Conta conta1 = new Conta("123-7", "123654-9", 300);
        System.out.println("Saldo: R$ " + conta1.getSaldo());

        double valorParaSacar = 0;
        double valorSacado = conta1.sacar(valorParaSacar);

        System.out.println("Solicitado o saque de R$ " + valorParaSacar);
        System.out.println("Sacado R$ " + valorSacado);
        System.out.println("Saldo da conta: R$ " + conta1.getSaldo());

    }

}
