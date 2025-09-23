import java.util.Scanner;
public class Factorial{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        //Ask the user to enter a number
        System.out.println("enter a non-negative integer:");
        int num = sc.nextInt();

        //check for negative
        if(num<=0){
            System.out.println("Factorial is not defined for negative numbers:");
        }
        else{
            long factorial = 1;

            //calculate factorial using a for loop
            for(int i=1; i<=num; i++){
                factorial *=i;
            }

            //display the result

            System.out.println("Factorial of"+num+"is:"+factorial);
        }
        sc.close();
    }
}