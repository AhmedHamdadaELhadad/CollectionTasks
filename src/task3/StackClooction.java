package task3;

import java.util.Scanner;
import java.util.Stack;

public class StackClooction {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();
        System.out.println(cheak(ss));   
    }

    public static boolean cheak(String S) {

        Stack<Character> st = new Stack<Character>();

        for (char c : st) {
            if (c == ')' && st.size() > 0 && st.peek() == '(') {
                st.pop();
            } else {
                st.push(c);
            }

        }
//        if ((st.size() == 0)) {
//            return true;
//        } else {
//            return false;
//        }
    
    return st.size()==0;
            }

}
