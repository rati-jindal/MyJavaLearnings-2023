package Arrays.com.Arrays1D;

public class NextGreater {
    public static void main(String[] args) {
        int [] arr = {3,1,2,5,4};
        for (int i = 0; i<arr.length-1;i++)
        {
            boolean found = false;
            for (int j =i+1; j<arr.length;j++)
            {

                if (arr[i] < arr[j]) {
                    found =true;
                    System.out.println(arr[j]);

                    break;
                }

            }
            if(found == false){
                System.out.println(-1);
            }


        }

    }
}
