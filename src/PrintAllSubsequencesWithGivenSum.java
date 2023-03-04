import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequencesWithGivenSum {
    public static void main(String[] args) {
        int ar[]= {2,8,4,9,7,3};
        int sum= 14;
       List<Integer> ls= new ArrayList<Integer>();

        printAll(ar,ar.length,sum,0,ls,0);

    }

    private static void printAll(int[] ar, int n, int sum, int tempSum, List<Integer> ls, int index) {
        if(index==n) {
            if (sum == tempSum) {
                ls.stream().forEach(System.out::print);
                System.out.println("");
            }
            return;
        }
        ls.add(ar[index]);
        tempSum+=ar[index];
        printAll(ar,n,sum,tempSum,ls,index+1);
        ls.remove(ls.size()-1);
        tempSum-=ar[index];
        printAll(ar,n,sum,tempSum,ls,index+1);
    }

}
