import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Permutation2 {
    public static void main(String[] args) {
        int ar[]={2,1,3};
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> arl= new ArrayList<>();
        int pointer=0;
      //  findAllPermutationSs(ar,pointer,ans);
        //ans.stream().forEach(ls->{ls.stream().forEach(System.out::print);
            System.out.println();
       // });
            findAllPerms(ar,pointer,ans);
        System.out.println(ans);

    }

    private static void findAllPermutationSs(int[] ar, int pointer,
                                             ArrayList<ArrayList<Integer>> ans) {

        if(pointer==ar.length){
            ArrayList<Integer> arl= new ArrayList<>();
            for(int i: ar){
                arl.add(i);
            }
            ans.add(arl);
            return;
        }
        for(int i=pointer;i<ar.length;i++){
            swap(pointer,i,ar);
            findAllPermutationSs(ar,pointer+1,ans);
            swap(pointer,i,ar);

        }


    }

    private static void swap(int pointer, int i, int[] ar) {
    int temp=ar[i];
    ar[i]= ar[pointer];
    ar[pointer]=temp;
    }

    //Practice print all permutations
    public static void findAllPerms(int ar[],int pointer, ArrayList<ArrayList<Integer>> ans){
        if(pointer==ar.length){
            ArrayList<Integer> arl= new ArrayList<>();
            for(int i: ar){
                arl.add(i);
            }
            ans.add(arl);
            return;
        }
        for(int i=pointer;i<ar.length;i++){
            swap(pointer,i,ar);
            findAllPerms(ar,pointer+1,ans);
            swap(pointer,i,ar);
        }

    }
}
