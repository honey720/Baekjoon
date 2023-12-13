import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_C02_L21_10773 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input == 0) {
                stack.pop();
            }
            else {
                stack.add(input);
            }
        }

        int size = stack.size();
        for(int j = 0; j < size; j++) {
            answer += stack.pop();
        }
        System.out.print(answer);
    }
}
