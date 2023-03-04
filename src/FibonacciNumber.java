public class FibonacciNumber
{
    public static void main(String[] args) {
        int n=5;
        int num= findNthFiboNum(n);
        System.out.println(num);
    }

    private static int findNthFiboNum(int n) {
        if(n==0||n==1){
            return n;
        }
        return findNthFiboNum(n-1)+findNthFiboNum(n-2);
    }
}
