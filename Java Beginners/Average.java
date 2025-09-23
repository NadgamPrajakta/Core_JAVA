
import java.util.Arrays;
public class Average{
    public static void main(String []args){
        int sum=0;
        int arr [] = new int [] {20, 30, 10, 40, 60, 25, 15, 70};
        System.out.println(Arrays.toString(arr));
        int avg = sum/arr.length;
        System.out.println("Average of array element="+avg);

        // int sum = 0;
        // for(int i =0; i<arr.length; i++){
        //     sum = sum+arr[i];
        // }

        // double avg = (double) sum/arr.length;

    }
}