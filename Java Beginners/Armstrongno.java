import java.util.Scanner;
public class Armstrongno{
    public static void main(String[]args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int OriginalNumber = num;
        int result = 0;
        int n = 0;

        //count the no of digits
        int temp= num;
        while(temp!=0){
            temp /= 10;
            n ++;
        }

        // calculate the sum of digits raised to the power of n 
        temp = num;
        while(temp!=0){
            int digit = temp % 10;
            result += Math.pow(digit, n); // add each powered digit to result
            temp /= 10;
        }

        // check & print result
        if(result == OriginalNumber){
            System.out.println(OriginalNumber+"ia an Armstrong number:");
        }
        else{
            System.out.println(OriginalNumber+"is not an Armstrong number");
        }
        sc.close();
    }
}