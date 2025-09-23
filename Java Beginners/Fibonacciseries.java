import java.util.Scanner;
public class Fibonacciseries{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        // Ask the user for how many terms to print

        System.out.println("Enter the no of terms to print:");
        int n = sc.nextInt();
        int first = 0;
        int second = 1; // initialize first two terms

        System.out.println("Fibonacci series up to"+n);

        // print fibonacci series using loop

        for(int i =1; i<-n; i++){
            System.out.println(first+"");
            int next = first+second;
            first = second;
            second = next;
        }
        sc.close();
    }
}