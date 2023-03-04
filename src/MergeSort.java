import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int ar[]={4,5,6,1,2};
        //merge sort uses divide and conquer

        divide(ar,0,ar.length-1);
        Arrays.stream(ar).forEach(System.out::println);
    }

    private static void divide(int[] ar, int left, int right) {
        if(left>=right){
            return;
        }
        int mid=(left+right)/2;
        divide(ar,left,mid);
        divide(ar,mid+1,right);
        conquer(ar,left,right,mid);

    }

    private static void conquer(int[] ar, int left, int right, int mid) {
     int []tempAr= new int[right-left+1];
     int index1=left;
     int index2=mid+1;
     int tempIndex=0;
     while(index1<=mid && index2<=right){
         if(ar[index2]<ar[index1]){
            tempAr[tempIndex++]=ar[index2++];
         }
         else{
             tempAr[tempIndex++]=ar[index1++];
         }

     }
        while(index1<=mid){
            tempAr[tempIndex++]=ar[index1++];
        }

        while(index2<=right){
            tempAr[tempIndex++]=ar[index2++];
        }
        int newTempIndex=0;
        for(int i=left;i<=right;i++){
            ar[i]=tempAr[newTempIndex++];
        }

    }

}
