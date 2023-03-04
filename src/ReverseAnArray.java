import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int [] ar={3,5,2,6,8,2,0};
        reverseArray(ar,0,ar.length-1);
        Arrays.stream(ar).forEach(System.out::println);
    }

    private static void reverseArray(int[] ar, int left, int right) {
            if(left>right)
                return;

            swap(ar,left,right);
            reverseArray(ar,++left,--right);
    }

    private static void swap(int[] ar, int left, int right) {
        int temp=ar[left];
        ar[left]=ar[right];
        ar[right]=temp;
    }

}
