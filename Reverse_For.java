import java.util.Scanner;

public class Reverse_For {

    public  static void  main(String[]args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a value :  ");

        int a = sc.nextInt();

        int b =0;

        for (  ;a > 0 ; a = a / 10 )
        {
            int r = a % 10;
            b = b * 10 + r;

        }
        System.out.println(b);
    }
}
