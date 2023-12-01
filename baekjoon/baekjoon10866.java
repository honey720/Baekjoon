import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class baekjoon10866 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Deque<Integer> dq = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = 0;
            String input = br.readLine();
            st = new StringTokenizer(input);
            String command = st.nextToken();
            if(st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            Deque(dq, command, num);
        }
    }

    public static void Deque(Deque<Integer> deque, String command, int num) {
        switch (command) {
            case "push_front" :{
                deque.offerFirst(num);
                break;
            }
            case "push_back" :{
                deque.offerLast(num);
                break;
            }
            case "pop_front" :{
                if(deque.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(deque.pollFirst());
                break;
            }
            case "pop_back" :{
                if(deque.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(deque.pollLast());
                break;
            }
            case "size" :{
                System.out.println(deque.size());
                break;
            }
            case "empty" :{
                if(deque.isEmpty())
                    System.out.println("1");
                else
                    System.out.println("0");
                break;
            }
            case "front" :{
                if(deque.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(deque.getFirst());
                break;
            }
            case "back" :{
                if(deque.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(deque.getLast());
                break;
            }
        }
    }
}
