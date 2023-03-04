import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        //quick sort works on pivot and partition principle
        int []ar= {5,3,2,4,7};
        quickSort(ar,0,ar.length-1);
        Arrays.stream(ar).forEach(System.out::println);
    }

    private static void quickSort(int[] ar, int left,int right) {
        if(left>=right){
            return;
        }
        int pivot = findPivot(ar,left,right);

        quickSort(ar,left,pivot-1);
        quickSort(ar,pivot+1,right);
    }

    private static int findPivot(int[] ar, int left,int right) {
    int pix=right;
    int index=left;
    int smallElementTracker=-1;


    while(index<=right){
        if(ar[index]<ar[pix]){
            smallElementTracker++;
            int temp=ar[smallElementTracker];
            ar[smallElementTracker]=ar[index];
            ar[index]=temp;
        }
        index++;
    }
    int temp=ar[pix];
    ar[pix]=ar[++smallElementTracker];
    ar[smallElementTracker]=temp;
    return smallElementTracker;
    }
}
