import java.sql.SQLOutput;

public class Print1toN_Using_BackTracking {
    public static void main(String[] args) {
        int num=10;
        myMethod(num);

    }

    private static void myMethod(int num) {
        if(num<1){
            return;
        }
        myMethod(num-1);
        System.out.println(num+ " ");
    }
}
