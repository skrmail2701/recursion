import java.util.ArrayList;
import java.util.List;

public class PrintOneSubsequenceWIthGivenSum {
    public static void main(String[] args) {

        int ar[]= {4,6,1,3,7,9};
        int sum=15;
        List<Integer> ls= new ArrayList<Integer>();
        System.out.println( printOne(ar,ar.length,ls,sum,0,0));

    }

    public static boolean printOne(int[] ar,int n,List<Integer> ls,int sum, int tempSum, int index){
        if(index==n){
            if(tempSum==sum){
                ls.stream().forEach(System.out::print);
                System.out.println("");
                return true;
            }
            return false;
        }
        ls.add(ar[index]);
        tempSum+=ar[index];
       if( printOne(ar,n,ls,sum,tempSum,index+1)){
           return true;
       }
        ls.remove(ls.size()-1);
        tempSum-=ar[index];
        if(printOne(ar,n,ls,sum,tempSum,index+1))
            return true;

        return false;
    }


}
