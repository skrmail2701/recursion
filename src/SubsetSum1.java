import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class SubsetSum1 {
    public static void main(String[] args) {
        int [] ar= {3,1,4};
        ArrayList<Integer> arl= new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> sumSet= new ArrayList<>();

        findAllSubsets(ar, arl,0, ans,0, sumSet );
        sumSet.stream().forEach(System.out::print);
        System.out.println();
        ans.stream().forEach(al-> {
                    al.stream().forEach(System.out::print);
                    System.out.println();
        }
            );
    }

    private static void  findAllSubsets(int[] ar, ArrayList<Integer> arl, int i, ArrayList<ArrayList<Integer>> ans
    ,int sum, ArrayList<Integer> sumSet) {
        // base case
        if(i==ar.length){
            ans.add(new ArrayList<Integer>(arl));
            sumSet.add(sum);
            return ;
        }

        //Picking the current index
        arl.add(ar[i]);
        findAllSubsets(ar,arl,i+1,ans,sum+ ar[i],sumSet);

        //Not picking the current index

        arl.remove(arl.size()-1);
        findAllSubsets(ar,arl,i+1,ans,sum,sumSet);


    }
}
