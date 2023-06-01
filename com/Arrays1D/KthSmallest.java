package Arrays.com.Arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of k");
        int k = sc.nextInt();
        while(k<=0){
            System.out.println("invalid value enter new value");
            System.out.println("enter value of k");
             k = sc.nextInt();
        }

        int []arr = {5,3,2,6};

        Arrays.sort(arr);
//        {2,3,5,6}{1,2,3,4}{0,1,2,3}
        System.out.println(arr[k-1]);
    }
}
