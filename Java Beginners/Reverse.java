public class Reverse{
    public static void main(String[]args){
        int arr [] = new int []{20, 30, 10, 40, 60, 25, 15, 70};
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reverse of array element:");
        for(int element:arr){
            System.out.println(element+"");
        }
    }
}