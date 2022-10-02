import java.util.Scanner;

public class PrefectNo {

    public static void main(String[] args) {

        int a ,b=0;
        System.out.println("Enter a number ");

        Scanner sc= new Scanner(System.in);
        a = sc.nextInt();

        for(int i = 1 ; i < a ; i++) {
            if (a % i == 0) {
               b = b + i;
            }
        }
        if(a == b)


            System.out.print(" Entered number is a Perfect number.");
        else
            System.out.print("Entered number is not a Prefect number.");

    }
}
