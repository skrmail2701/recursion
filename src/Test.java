import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {
    public static void main(String[] args) {

        boolean findAna = findAnagram("race", "care");;

        System.out.println(findAna);

    }
    static boolean findAnagram(String A, String B){
        if(A.length()!=B.length()){
            return false;
        }

        int index1=0;
        HashMap<Character, Integer> hm = new HashMap<>();


        while(index1<A.length()){
            int count=0;
            if(hm.containsKey(A.charAt(index1))){
                count= hm.get(A.charAt(index1));
            }
            hm.put(A.charAt(index1),++count);
            index1++;
        }

        int index2=0;
        while(index2<B.length()){
            int count=0;
            if(hm.containsKey(A.charAt(index2))){
                count= hm.get(A.charAt(index2));
                hm.put(A.charAt(index2),--count);
            }
            else{
                return false;
            }
            index2++;
        }

        for(Map.Entry<Character,Integer> ent: hm.entrySet()){

            if(ent.getValue()!=0){
                return false;
            }

        }
        return true;

    }

}
