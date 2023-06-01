package Arrays.com.Arrays1D;

public class RotateBy1 {
    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};
        System.out.print(arr[arr.length-1]+" ");
        for (int i= 0; i< arr.length; i++){

            if (i!= arr.length-1){

                System.out.print(arr[i]+" ");

            }
        }

    }
}
