import java.util.Scanner;
public class Reverse_Recursion {

    public static void reverse (int num) {

        if (num < 10){
            System.out.println(num);
            return;
        }
        else{
            System.out.println( num % 10);
            reverse(num / 10);
        }
    }

    public static void main(String[] args) {
        int a = 0;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        System.out.println("Number after reversing is: ");
        reverse(a);
    }
}
