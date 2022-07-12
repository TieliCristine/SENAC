package listaExercicios01;

public class exercicio02 {
    public static void main(String[] args) {

        int numero[] = new int[10];
        numero[0] = 5;
        numero[1] = 20;
        numero[2] = 9;
        numero[3] = 12;
        int c;
        int atual = 0;

        for (c = 0; c < numero.length; c++) {
            atual += numero[c];
        }
        System.out.println("Soma dos elementos: " + atual);
    }
}
