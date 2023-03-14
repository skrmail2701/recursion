import java.util.ArrayList;

public class SubSetSum2
{
    public static void main(String[] args) {
        int ar[]= {1,2,2,2,3,3};

        ArrayList<Integer> subSetSum= new ArrayList<>();
        int sum=0;
        ArrayList<ArrayList<Integer> > ans = new ArrayList<>();
        ArrayList<Integer> arl= new ArrayList<>();
        findUniqueSubsets(ar, subSetSum, sum, 0, arl, ans);
        //subSetSum.stream().forEach(System.out::println);
        ans.stream().forEach(al->{al.stream().forEach(System.out::print);
            System.out.println();
    });

    }

    private static void findUniqueSubsets(int[] ar, ArrayList<Integer> subSetSum, int sum, int index,
                                          ArrayList<Integer> arl, ArrayList<ArrayList<Integer>> ans) {
        ans.add(new ArrayList<>(arl));
        subSetSum.add(sum);
        // base case
        if(index==ar.length){
            return;
        }

        for(int i=index;i< ar.length;i++){

            if(i!=index && ar[i]==ar[i-1]) continue;
            arl.add(ar[i]);
            findUniqueSubsets(ar,subSetSum,sum+ar[i],i+1,arl,ans);
            //if 1 was picked for 1st index then after i++ we want some other element on the same index so we
            // need to remove the current element from list
            arl.remove(arl.size()-1);
        }

    }
}
