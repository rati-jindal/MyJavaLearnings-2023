package Arrays.com.SortingTechniques;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {3,2,5,1,4};
        Mergesort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

    }
    public static void sort(int arr[],int lb, int mid, int ub){
//        int nlb = mid-lb+1;
//        int nub = ub- mid;
//
//        int left[] =new int[nlb];
//        int right[] = new int[nub];
//
//        for (int i = 0; i < nlb; i++) {
//            left[i]= arr[lb+i];
//        }
//        for (int j = 0; j < nub; j++) {
//            right[j] =arr[mid+1+j];
//        }
//        int i =0;
//        int j =0;
//        int k =1;
//        while(i< nlb && j< nub){
//            if(left[i]<=right[j]){
//                arr[k]=left[i];
//                i++;
//            }
//            else{
//                arr[k]= right[j];
//                j++;
//            }
//            k++;
//     }
        int b[] = new int[ub+1];
        int i =lb;
        int j =mid+1;
        int k = lb;
        while(i<=mid && j<=ub) {
            if (arr[i] < arr[j]) {
                b[k] = arr[i];
                i++;
                k++;
            } else {
                b[k] = arr[j];
                j++;
                k++;
            }
        }
            if(i<=mid){
                while(i<=mid){
                    b[k]=arr[i];
                    i++;
                    k++;
                }
            }
            else{
                while(j<=ub){
                    b[k] = arr[j];
                    j++;
                    k++;
                }
            }
        for (int p = lb; p < ub+1; p++) {
            arr[p] = b[p];
        }
    }

    static void Mergesort(int arr[],int lb ,int ub){
        if(lb<ub) {
            int mid=(lb+ub)/2;
            Mergesort(arr, lb, mid);
            Mergesort(arr, mid+1, ub);
            sort(arr, lb, mid, ub);
        }
    }

}
