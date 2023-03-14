import java.util.ArrayList;

public class CombinationSumII {

    public static void main(String[] args) {
        int [] ar= {1,1,1,2,2};
        int target=4;
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();


        //Finding all the combination with given sum where the same element cannot be considered more
        // than once and duplication of combination is not allowed and the combination must be present in ascending
        // order

        findAllUniqueCombinations(0, ar, target, ans, new ArrayList<Integer>());
        ans.stream().forEach(arList-> {
            arList.stream().forEach(System.out::print);
            System.out.println("");
        });

    }

    // This method should contain a sorted array itself in the input
    public static void findAllUniqueCombinations(int index, int [] ar, int target, ArrayList<ArrayList<Integer>> ans,
                                                 ArrayList<Integer> al){

        // Base Condition
        if(target==0){
            ans.add(new ArrayList<Integer>(al));
            return;
        }

        //For inserting at each index position in our combination we will iterate the array from that index position
        // to last element in the array to check at which array element another recursion call can be made

        for(int i= index; i< ar.length;i++){
            // from second element onwards (second element in the loop)we need to check if this element has
            // already been considered for the given index position in our combination
            if(i> index && ar[i]==ar[i-1]) continue;
            // if current element is greater than the target that combiantion is not possible hence no further
            // recursion calls required
            if(ar[i]>target) break;

            al.add(ar[i]);

            //Reason to include i+1 and not index+1 because in 39 we are considering only specific indexes
            findAllUniqueCombinations(i+1,ar,target-ar[i],ans, al);
            al.remove(al.size()-1);
        }


    }
}
