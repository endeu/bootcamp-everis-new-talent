import java.util.Scanner;

public class Main {
    //complete os espaços em branco com sua solução
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sec;
        sec = input.nextInt();

        int hour = sec/3600;
        int min = (sec%3600)/60;
        sec = (sec%3600)%60;

        System.out.println(hour+ ":" +min+ ":" +sec);
    }
}