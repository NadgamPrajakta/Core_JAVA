import java.util.Scanner;
public class EvenOdd{
    public static void main(String[]args){

        Scanner sc = new Scanner (System.in);

        // Ask for user to input
        System.out.println("Enter an integer number:");
        int number = sc.nextInt();

        // check if no is even or odd using modulus operator

        if(number % 2 == 0){
            System.out.println(number+"is an even number:");
        }
        else{
            System.out.println(number+"is an odd number:");
        }
        sc.close();

    }
}