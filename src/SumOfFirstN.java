public class SumOfFirstN {
    public static void main(String[] args) {
        int num=5;
        int sum = findSum(num);
        System.out.println(sum);
    }

    private static int findSum(int num) {
        if(num<1){
            return 0;
        }
        return num + findSum(num-1);
    }


}
