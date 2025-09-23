import java.util.Arrays;
public class AscSort{
    public static void sortArray(int[]arr){

        Arrays.sort(arr);
    }
    public static void main(String[] args){

        int arr [] =   new int[]{20, 30, 10, 40, 60, 25, 15, 70};
        sortArray(arr);
        System.out.println("Sorted Array:"+Arrays.toString(arr));
    }
}
