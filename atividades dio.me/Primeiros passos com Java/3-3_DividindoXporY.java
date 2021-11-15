import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            double X = input.nextDouble();
            double Y = input.nextDouble();

            if (Y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.printf("%.1f\n", (double)(X/Y));
            }
        }
    }
}