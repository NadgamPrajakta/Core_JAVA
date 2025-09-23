public class MinMax{
    public static void main(String[]args){
        int arr[] = new int [] {20, 30, 10, 40, 60, 25, 15, 70};
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            System.out.println("Min="+min);
            System.out.println("Max="+max);

        }
    }
}