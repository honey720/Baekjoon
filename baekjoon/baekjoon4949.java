import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon4949 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while(!(input = br.readLine()).equals(".")) {
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == '(' || input.charAt(i) == '[') {
                    stack.push(input.charAt(i));
                }
                else if(input.charAt(i) == ')') {
                    if(stack.isEmpty()) {
                        System.out.println("no");
                        break;
                    }
                    else if(stack.pop() != '(') {
                        System.out.println("no");
                        break;
                    }
                }
                else if(input.charAt(i) == ']') {
                    if(stack.isEmpty()) {
                        System.out.println("no");
                        break;
                    }
                    else if(stack.pop() != '[') {
                        System.out.println("no");
                        break;
                    }
                }
                else if(input.charAt(i) == '.') {
                    if(stack.isEmpty()) {
                        System.out.println("yes");
                    }
                    else {
                        System.out.println("no");
                    }
                    break;
                }
            }
        }
    }
}