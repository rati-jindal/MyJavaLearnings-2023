package Arrays.com.SortingTechniques;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        int arr[]= {3,2,11,1,5,4,7,9};
        quicksort(arr,0,arr.length);
        print(arr);

    }

    public static void quicksort(int arr[],int left,int right) {

        int l = left;
        int r = right - 1;
        int size = right - left;
        if (size > 1) {

            Random rn = new Random();
            int pivot = arr[rn.nextInt(size) + 1];

            while (l < r) {

                while (arr[r] > pivot && r > l) {
                    r--;
                }
                while (arr[l] > pivot && l <= r) {
                    l++;
                }
                if (l < r) {
                    int temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                }
            }
            quicksort(arr, left, l);
            quicksort(arr, r, right);
        }
    }




    public static void print(int arr[]){
        int n = arr.length;
        for (int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }




}
