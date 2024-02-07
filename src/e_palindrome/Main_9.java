package e_palindrome;

public class Main_9 {
    public static void main(String[] args) {

        boolean res = isPalindrome(123);

        System.out.println(res);
    }

    public static boolean isPalindrome(int x){

        int original = x;
        int temp = 0;

        if(x<0){
            return false;
        }else{
            while (x!=0){

                temp = temp * 10 + x%10;

                x = x/10;
            }
        }

        return original==temp;
    }
}
