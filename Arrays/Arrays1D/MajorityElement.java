package Arrays.com.Arrays1D;

public class MajorityElement {
    public static void main(String[] args) {
//  Majority elements are those elements whose frequency is n/2 , where n is length of array

         int []arr = {1,3,1,1,1,4,1,5};
        int count = 0;
        int me = 0;
         for (int i =0; i< arr.length;i++){

             for (int j =i+1; j<arr.length; j++){

                 if (arr[i] == arr[j]){
                     me = arr[i];
                     count++;

                 }

             }

         }
        if (count >= arr.length/2){
            System.out.println(me);
        }
        else
            System.out.println("not found");

    }
}

//or by Sorting
// by array by Arrays.sort()
//now apply i loop and increase count simultaneously
// check count > n/2
//do the same