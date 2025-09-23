
// While loop

// public class Program{
//     public static void main(String[]args){
//         int num1 =10;
//         while(num1< 15){

//             System.out.println("num1="+num1);
//             num1 ++;
//         }
//     }
// }

// int num1 = 10;
// while(num<15){
//     num1 ++;
//     System.out.println(num1);
//     num1 ++;
// }

// int num1 = 10;
// while(num1<15){
//     System.out.println("num1="+num1);
//     num1 --;
// }

// Do-While loop

// public class program1{
//     public static void main(String[]args){
//         int num1 = 16;
//         do{
//             System.out.println("num1="+num1);
//             num1 ++;
//         }

//         while(num1 < 15); {
//             System.out.println("Outside the while loop");
//         }
//     }
// }

// for loop

public class program2{
    public static void main(String[]args){
        System.out.println("While loop:");

        int i = 1;
        while(i <= 3){
            System.out.println("i = "+i);
            i ++; 
        }

        System.out.println("do-while loop:");
        int j = 1;
        do{
            System.out.println("j = "+j);
            j ++;
        }
        while(j <= 3);

            System.out.println(" for loop :");
            for(int k=1; k<=3; k++){
                System.out.println("k = "+k);
            }
        
    }
}