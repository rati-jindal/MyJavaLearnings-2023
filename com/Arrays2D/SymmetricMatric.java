package Arrays.com.Arrays2D;

public class SymmetricMatric {
    public static void main(String[] args) {
        int arr[][] = {{1,4,1},
                       {1,4,1},
                       {1,1,1}};
        int flag =0;
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (arr [i][j]==arr[j][i]){

                    flag =1;

                }
                else{
                    flag=0;
                }
            }

        }
            if (flag == 1){
                System.out.println("symmetric");
            }
            else{
                System.out.println("not");
            }

    }
}
