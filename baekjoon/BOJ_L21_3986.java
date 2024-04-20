import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_L21_3986 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();
            for(int j = 0; j < input.length(); j++) {
                Character c = input.charAt(j);
                if(stack.isEmpty() || stack.peek() != c) stack.push(c);
                else stack.pop();
            }
            if(stack.isEmpty()) ans++;
        }
        System.out.println(ans);
    }
}
