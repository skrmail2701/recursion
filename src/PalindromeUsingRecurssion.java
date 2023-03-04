public class PalindromeUsingRecurssion {
    public static void main(String[] args) {
        String s="ABAB";
        System.out.println(checkPalindrome(s,0,s.length()-1));

    }

    private static boolean checkPalindrome(String s,int left,int right) {
        if(left>right){
            return true;
        }
        if(s.charAt(left)!= s.charAt(right)){
            return false;
        }
        return checkPalindrome(s,++left,--right);
    }
}
