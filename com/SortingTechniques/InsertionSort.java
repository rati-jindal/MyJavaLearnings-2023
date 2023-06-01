package Arrays.com.SortingTechniques;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,4};
        for (int i =0; i< arr.length-1;){
            int j = i+1;
                while(j!=0){
                    if(arr[j]<arr[j-1]){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1]= temp;
                        j--;
                    }
                    else {
                        break;
                    }

                }
                i++;
        }


        for (int p = 0 ; p< arr.length;p++){
            System.out.print(arr[p]);
        }
    }

}
