public class FactorialUsingRecurssion {

    public static void main(String[] args) {
        int num=5;
        int fact=findFact(num);
        System.out.println(fact);
    }

    private static int findFact(int num) {
    if(num<=1){
        return 1;
    }
    return num*findFact(num-1);

    }
}
