package listaExercicios01;

public class exercicio03 {
    public static void main(String[] args) {

        int numero[] = new int[10];
        numero[0] = 5;
        numero[1] = 20;
        numero[2] = 9;
        numero[3] = 12;
        int c;
        int totalImpares = 0;
        int media = 0;
        int soma = 0;

        for (c = 0; c < numero.length; c++) {
            int atual = numero[c];
            int resto = atual % 2;

            if (resto == 1) {
                soma += atual;
                totalImpares++;
                System.out.println("Impar encontrado: " + atual);
            }
        }
        media = soma / totalImpares;
        System.out.println("Media: " + media);
        System.out.println("Total Impares: " + totalImpares);
    }
}
