import java.util.Scanner;
public class ASCIIValue{
    public static void main(String[]args){

        Scanner sc = new Scanner (System.in);

        // Ask the user to enter a character
        System.out.println("enter a character:");
        //1read the 1st character
        char ch = sc.next().charAt(0);

        //Display ASCII value by type casting to int 

        int ascii = (int)ch;

        //print the result

        System.out.println("The ASCII value of"+ch+"is:"+ascii);
        sc.close();

        
    }
      
}