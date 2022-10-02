import java.util.Scanner;

public class PrimeNo {

    public static void main(String[] args) {

        int b,count=0;
        System.out.println("Enter a number ");

        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();

        for(int i = 1 ; i <= b ; i++) {
            if (b % i == 0) {
                count++;
            }
        }
        if(count==2)
            System.out.print("It is a prime number");
        else
            System.out.print("It is not a prime number");

    }
}
