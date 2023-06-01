package Arrays.com.Arrays2D;

import java.util.Scanner;

public class SumOfMultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row and Col : ");
            int row =sc.nextInt();
            int col = sc.nextInt();
            int a[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            System.out.print("Enter elemets of "+i+"th row:  ");
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum = sum +a[i][j] ;
            }
        }
        System.out.println(sum);
    }
}
