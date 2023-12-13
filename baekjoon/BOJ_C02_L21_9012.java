import java.util.Scanner;
import java.util.Stack;

public class BOJ_C02_L21_9012 {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            String S = sc.next();
            Stack<Character> st = new Stack<>();
            boolean incorrect = false;
            for(int j = 0; j < S.length(); j++) {
                if(S.charAt(j) == ')') {
                    if(st.size() == 0) {
                        incorrect = true;
                        break;
                    }
                    else
                        st.pop();
                }
                else
                    st.push('(');
            }
            if(st.size() != 0)
                incorrect = true;
            if(incorrect)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
