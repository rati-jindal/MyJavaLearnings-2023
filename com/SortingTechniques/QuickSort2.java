package Arrays.com.SortingTechniques;

public class QuickSort2 {
    public static void main(String[] args) {
        int a[] = {3, 2, 1, 5, 4};
        int lb = 0;
        int ub = a.length - 1;
        sort(a,lb, ub);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static void sort(int a[], int lb, int ub) {
        if (lb < ub) {
            int index = quicksort(a, lb, ub);
            sort(a, lb, index - 1);
            sort(a, index + 1, ub);
        }

    }

    private static int quicksort(int[] a, int lb, int ub) {
        int pivot = lb;
        int start = lb;
        int end = ub;
        while (start < end) {
            while (a[start] <= a[pivot] && start < ub ) {
                start++;

            }
            while (a[end] > a[pivot] && end>lb) {
                end--;
            }
            if (start < end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;

            }
        }

        int temp = a[pivot];
        a[end] = a[pivot];
        a[pivot] = temp;

        return end;

    }
}


