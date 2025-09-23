import java.util.Arrays;
public class Sum{
    public static void main(String []arga){

        int arr []= new int [] {20, 30, 10, 40, 60, 25, 10, 70};
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for(int i =0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        for(int element:arr){
            sum += element;
            System.out.println("Sum of array element="+sum);
        }
    }
}