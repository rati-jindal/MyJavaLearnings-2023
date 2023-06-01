package Arrays.com.Arrays2D;

import java.util.Scanner;

public class InsertionDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int i = sc.nextInt();

        int arr[][] = new int[i][];

        for (int a = 1; a<=i; a++ )
        {
            int elements =i;
            arr[a-1] =new int [elements];

        }

    }
}
