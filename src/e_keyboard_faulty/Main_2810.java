package e_keyboard_faulty;

import java.util.Arrays;

public class Main_2810 {
    public static void main(String[] args) {
        String res = reverseOnI("string");
        System.out.println(res);
    }

    private static String reverseOnI(String string){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == 'i'){
                sb.reverse();
            } else {
                sb.append(string.charAt(i));
            }
        }
        return sb.toString();
    }
}
