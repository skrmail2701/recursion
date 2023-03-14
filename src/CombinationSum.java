import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
    int ar[]={2,3,6,7};
    int sum= 7;
    ArrayList<Integer> al= new ArrayList<Integer>();
    List<ArrayList<Integer>> alList= new ArrayList<>();
// Same element can be considered more than once in the combination
    findAllCombinations(ar,sum,al,alList,0);

    for(ArrayList<Integer> newAl: alList){
        newAl.stream().forEach(System.out::print);
        System.out.println("");
    }
    }

    private static void findAllCombinations(int[] ar, int sum, ArrayList<Integer> al,
                                            List<ArrayList<Integer>> alList, int index) {
        //base case
        //When sum comes down to zero
        if(sum==0){
            alList.add(new ArrayList<>(al));
            return;
        }
        //When end of the array is reached
        if(index==ar.length){
            return;
        }
        boolean dontPick=false;
        if(ar[index]>sum){
            dontPick=true;
        }
            if(!dontPick){
        al.add(ar[index]);

        findAllCombinations(ar,sum- ar[index],al,alList,index);

        al.remove(al.size()-1);
        }
        findAllCombinations(ar,sum,al,alList,index+1);

    }
}
