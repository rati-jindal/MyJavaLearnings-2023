package Arrays.com.SearchingTechniques;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be found");
        int num = sc.nextInt();
        int flag=0;
        int[]arr= {1,2,3,4,5,6,7,8};

        for(int i =0; i<arr.length; i++){
            if(num == arr[i]){
                System.out.println(num+" found at index : "+i);
                flag=1;
            }
        }
        if(flag==0)
        System.out.println(num+" not found!");

    }
}
