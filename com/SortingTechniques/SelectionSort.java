package Arrays.com.SortingTechniques;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no to be searched : ");
        int search= sc.nextInt();

        int arr[] = {1,2,3,4,5,6,7};

        for(int i =0; i< arr.length;i++){
            for (int j =i+1; j< arr.length-1;i++){

            }
        }
    }

    public static class BubbleSort {
        public static void main(String[] args) {
            int arr[]={3,4,2,5,1};
            int temp=0;
            int flag = 0;
            for(int i=0; i< arr.length;i++){
                for(int j = 1; j<arr.length-i;j++){
                    if (arr[j-1]> arr[i]){
                        temp = arr[j-1];
                        arr[j-1]= arr[i];
                        arr[i] = temp;
                        flag = 1;
                    }

                }
                if(flag == 0){
                    break;
                }
            }
            for (int p =0 ; p< arr.length;p++){
                System.out.print(arr[p]);
            }
            System.out.println();
        }
    }
}
