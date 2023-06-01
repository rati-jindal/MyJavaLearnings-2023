package Arrays.com.Arrays1D;

public class LeftRotateBy1 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int temp = arr[0];

        for (int i =0; i< arr.length-1;i++){

            arr[i] = arr[i+1];
            System.out.print(arr[i]+" ");
        }
        arr[arr.length-1]= temp;
        System.out.print(arr[arr.length-1]+" ");
    }
}
