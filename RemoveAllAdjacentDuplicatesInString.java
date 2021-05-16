import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String res = removeDuplicates("abbaca");
        System.out.println(res);
    }
    /*
     "abbaca"
     a
      aaca
      ca

     */
    private static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<Character>();
        stack.push('*');
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (stack.peek() != s.charAt(i)) {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
            }
        }
        s = "";
        while (!stack.empty()) {
            s = stack.pop() + s;
        }
        return s.substring(1, s.length());
    }
}

