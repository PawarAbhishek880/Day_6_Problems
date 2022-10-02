import java.util.Scanner;

public class FiboSeries {

    public static void main(String[] args) {

        int Fibo, x = 0, y = 1, z;

        System.out.println(" Enter the number to print Fibonacci series: ");

        Scanner sc = new Scanner(System.in);
        Fibo = sc.nextInt();

        for (int i = 1; i <= Fibo; i++) {

            System.out.print(x + "  ");

            z = x + y;
            x = y;
            y = z;
        }
    }
}

