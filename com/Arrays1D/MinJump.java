package Arrays.com.Arrays1D;

public class MinJump {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,0,4,3,2};
        int sum=0;
        boolean flag = false;
        for (int i =0; i<arr.length;i++){
            sum=sum+arr[i];
            i= arr[i]-1;
            flag = true;
        }

        if(flag == true)
        System.out.print(sum);
        else
            System.out.println(-1);
    }
}
