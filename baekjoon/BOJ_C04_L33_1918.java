import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_C04_L33_1918 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] arr = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : arr) {
            if (c >= 'A' && c <= 'Z') sb.append(c); //알파벳일 때 출력
            else {
                if (c == '(') { //여는 괄호일 때 저장
                    stack.push(c);
                } else if (c == ')') { //닫는 괄호일 때
                    while (!stack.isEmpty()) { //스택이 빌 때 까지 반복
                        char pop = stack.pop();
                        if (pop == '(') break; //pop한게 여는괄호일 때 break;
                        else sb.append(pop); //나머지는 출럭
                    }
                } else { //연산기호일 때
                    while (!stack.isEmpty() && rank(stack.peek()) >= rank(c)) sb.append(stack.pop()); //스택이 비거나, 현재 연산기호가 peek된 연산기호보다 우선순위가 같거나 높을 때 까지 반복해서 출력
                    stack.push(c); //스택에 저장
                }
            }
        }
        while (!stack.isEmpty()) sb.append(stack.pop()); //스택이 빌 때 까지 출력
        System.out.println(sb);
    }
    public static int rank(char c) { //연산순위
        if(c == '+' || c == '-') return 1; //+, -일 때는 1
        else if(c == '*' || c == '/') return 2; //*, /일 때는 2
        else return 0; //나머지는 0
    }
}

