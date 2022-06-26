package listaExercicios01;

public class exercicio02 {
    public static void main(String[] args) {

        int numero[] = new int[10];
        numero[0] = 5;
        numero[1] = 20;
        numero[2] = 9;
        numero[3] = 12;
        int c;
        int totalPares = 0;

        for (c = 0; c < numero.length; c++) {
            int atual = numero[c];
            int resto = atual % 2;

            if (resto == 0 && atual > 0) {
                totalPares++;
                System.out.println("Pares: " + atual);
            }
        }
        System.out.println("Total pares: " + totalPares);
    }
}
