import java.util.Scanner;
public class PrimeNo{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        //Ask the user to enter a number
        System.out.println("Enter a number to check if it's prime:");
        int num = sc.nextInt();

        //check for prime
        boolean isPrime=true;

        if(num<=1){
            isPrime= false;
        }
        else{

            //loop from 2 to sqrt(num)
            for(int i = 2; i<=Math.sqrt(num); i++){
                if(num % i ==0){
                    isPrime = false;
                    break;
                }
            }
        }

        //print result
        if(isPrime){
            System.out.println(num +"is a prime number:");
        }
        else{
            System.out.println(num+"is not a prime number:");
        }
        sc.close();
    }
}