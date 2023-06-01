package Arrays.com.Arrays2D;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[][]={{1,1,1},
                   {2,2,2},
                   {3,3,3}};
        int b[][]={{1,1,1},
                   {2,2,2},
                   {3,3,3}};
        System.out.println("enter no of rows: ");
            int row = sc.nextInt();
        System.out.println("enter no of columns: ");
            int col = sc.nextInt();



            int c[][] = new int[3][3];


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }

}
