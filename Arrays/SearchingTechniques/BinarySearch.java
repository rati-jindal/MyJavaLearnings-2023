package Arrays.com.SearchingTechniques;

import java.util.Scanner;

//applies only on sorted array
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no to be found: ");
        int search = sc.nextInt();
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int start = arr[0];
        int end = arr[arr.length-1];
        int mid = (start+end)/2;

        while(start<=end){

            if (search == arr[mid]){

            }
            if(search<arr[mid]){

            }
            if(search>arr[mid]){

            }


        }
    }
}
