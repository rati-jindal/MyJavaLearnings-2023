package Arrays.com.Arrays2D;

public class SkewSymmertic {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                       {-2,3,4},
                       {-3,-4,6}};
        int flag=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if(i!=j||arr[i][j]!=-(arr[j][i])){

                }
                else{
                    flag =1;
                }

            }

        }
        if(flag == 1){
            System.out.println("skew");
        }
        else{
            System.out.println("not skew");
        }

    }
}
