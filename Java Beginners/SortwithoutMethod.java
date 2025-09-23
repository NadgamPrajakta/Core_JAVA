import java.util.Arrays;
public class SortwithoutMethod{
    public static void main(String[]args){
        int [] numbers = {20, 30, 10, 40, 60, 25, 15, 70};
        int n = numbers.length;

        //bubble sort logic directly in main()
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(numbers[i]>numbers[j+1]){
                    
                    // swap numbers [j] & [i] numbers [j+1]
                    int temp = numbers[i];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        System.out.println("sorted Array:"+Arrays.toString(numbers));
    }
}