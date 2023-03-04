import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequenceOfArray {
    public static void main(String[] args) {
        int [] ar= {3,1,2};
        List<Integer> ls= new ArrayList<Integer>();
        printAllSubsequence(0,ar,ls,ar.length);
        }

    private static void printAllSubsequence(int index, int[] ar, List<Integer> ls, int n) {

        if(index==n){
        ls.stream().forEach(System.out::print);
            System.out.println(" ");
        return;
        }
        ls.add(ar[index]);
        printAllSubsequence(index+1,ar,ls,n);
        ls.remove(ls.size()-1);
        printAllSubsequence(index+1, ar, ls,n);
    }
}

