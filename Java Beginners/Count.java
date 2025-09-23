public class Count{
    public static void main(String[]args){
        int arr[] = new int[] {20, 30, 10, 40, 60, 25, 15, 70};
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] ==25)
            count++;
            System.out.println("25 Occurs in array ="+count);
        }
    }
}