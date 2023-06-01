package Arrays.com.Arrays1D;

public class Leaders {
    public static void main(String[] args) {

//
        int [] arr = {3,2,5,4,1};

        for (int i=0; i< arr.length;i++){
            boolean flag = false;
            for (int j = i+1; j<arr.length;j++){
                if(arr[j]>arr[i]){
                    flag =true;
                    break;
                }
            }
            if(flag == false){
                System.out.println(arr[i]);
            }
        }
    }
}
