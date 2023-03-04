import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CountAllSubsequenceWithGivenSum {
    public static void main(String[] args) {
        int ar[]= {3,4,5,6,7,8,9,1,2};
        int sum=20;
        List<Integer> ls= new ArrayList<Integer>();

       System.out.println("Count with printing: "+ countAll(ar,ar.length,ls,sum,0,0,0));
       System.out.println("Count without printing: "+ countWithoutPrinting(ar,ar.length,sum,0,0));
    }

    private static int countWithoutPrinting(int[] ar, int n, int sum, int tempSum, int index) {
        if(index==n){
            if(tempSum==sum)
                return 1;
            else
                return 0;
        }

        int i=countWithoutPrinting(ar,n,sum,tempSum,index+1);
        tempSum+=ar[index];
        int j=countWithoutPrinting(ar,n,sum,tempSum,index+1);
        return i+j;
    }

    private static int countAll(int[] ar, int n, List<Integer> ls, int sum, int tempSum, int index,int count) {
        if(tempSum>sum){
            return 0;
        }
        if(index==n){
           if(tempSum==sum){
               ls.stream().forEach(System.out::print);
               System.out.println("");
               return 1;
           }
           else{
               return 0;
           }
       }
       ls.add(ar[index]);
       tempSum+=ar[index];

       count+=countAll(ar,n,ls,sum,tempSum,index+1,0);
       ls.remove(ls.size()-1);
       tempSum-=ar[index];
       count+=countAll(ar,n,ls,sum,tempSum,index+1,0);
       return count;
    }

}
