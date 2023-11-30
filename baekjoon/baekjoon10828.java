import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class baekjoon10828 {

    public static void main(String []args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = 0;
            String input = br.readLine();
            st = new StringTokenizer(input);

            String command = st.nextToken();
            if(st.hasMoreTokens())
                num = Integer.parseInt(st.nextToken());

            Stack(stack, command, num);
        }
    }

    public static void Stack(Stack<Integer> stack, String command, int num) {
        switch (command) {
            case "push": {
                stack.push(num);
                break;
            }
            case "pop": {
                if(stack.isEmpty())
                    System.out.println("-1");
                else {
                    System.out.println(stack.pop());
                }
                break;
            }
            case "size": {
                System.out.println(stack.size());
                break;
            }
            case "empty": {
                if(stack.isEmpty())
                    System.out.println("1");
                else
                    System.out.println("0");
                break;
            }
            case "top": {
                if(stack.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(stack.peek());
                break;
            }
        }
    }
}
