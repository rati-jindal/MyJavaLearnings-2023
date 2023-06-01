package Arrays.com.Arrays1D;

//Remove the duplicates of the elements from a sorted array
public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 4};
        System.out.print(arr[0] );
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.print(arr[i + 1] );
            }
        }

    }
}
