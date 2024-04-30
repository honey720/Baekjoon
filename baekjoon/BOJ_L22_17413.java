import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_L22_17413 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                while (!stack.isEmpty()) sb.append(stack.pop());
                sb.append(' ');
            }
            else if (s.charAt(i) == '<') {
                while (!stack.isEmpty()) sb.append(stack.pop());
                int tmp = i;
                do i++; while (s.charAt(i) != '>');
                sb.append(s, tmp, i + 1);
            }
            else stack.push(s.charAt(i));
        }
        while (!stack.isEmpty()) sb.append(stack.pop());
        System.out.print(sb);
        br.close();
    }
}
