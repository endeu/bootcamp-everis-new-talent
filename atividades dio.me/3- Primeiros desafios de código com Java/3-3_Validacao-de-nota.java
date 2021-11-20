import java.util.Scanner;
import java.io.IOException;

public class Problem {

    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);
        double total = 0;
        int i = 0;

        do {

            double notaEntrada = leitor.nextDouble();

            if (notaEntrada < 0 || notaEntrada > 10) {
                System.out.println("nota invalida");
            } else {
                i++;
                total += notaEntrada;
            }
        } while (i < 2);

        System.out.printf("media = " + String.format("%.2f", total / 2));
    }
}