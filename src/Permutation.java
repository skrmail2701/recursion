import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {


        int[] ar = {1, 2, 3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arl = new ArrayList<>();
        boolean[] map = new boolean[ar.length];
        generateAllPermutaions(ar, arl, map, ans);
    }

    private static void generateAllPermutaions(int[] ar, ArrayList<Integer> arl, boolean[] map,
                                               ArrayList<ArrayList<Integer>> ans) {

        if(arl.size()==ar.length){
            ans.add(new ArrayList<Integer>(arl));
            return;
        }
        //this for loop is to get first element of the permutation being formed
        //first element of the array is taken as the first element of the permutation and once we get one permutation
        //successfully it moves to the 2nd element of array as the first element of the permutation

        for(int index=0;index<ar.length;index++){
            if(!map[index]){
                arl.add(ar[index]);
                map[index]=true;
                generateAllPermutaions(ar,arl,map,ans);
                arl.remove(arl.size()-1);
                map[index]=false;
            }

        }

    }

}
