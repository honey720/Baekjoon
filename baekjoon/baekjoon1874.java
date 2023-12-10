import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class baekjoon1874 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int standard = 0;
        Stack<Integer> stack = new Stack<>();
        ArrayList<String> print = new ArrayList<>();
        String answer = "";

        for(int i = 1; i <= N; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input > standard) {
                for(int j = standard + 1; j <= input; j++) {
                    stack.push(j);
                    print.add("+");
                }
                stack.pop();
                print.add("-");
                standard = input;
            }
            else {
                if(stack.pop() == input) {
                    print.add("-");
                }
                else {
                    answer = "NO";
                    break;
                }
            }
        }
        if(answer.equals("NO")) {
            System.out.print("NO");
        }
        else {
            for(String res : print) {
                System.out.println(res);
            }
        }
    }
}
