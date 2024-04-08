import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_L21_18258 {

    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> queue = new ArrayDeque<>();
    static int last = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            int num = 0;
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(st.hasMoreTokens()) num = Integer.parseInt(st.nextToken());
            queue(cmd, num);
        }
        System.out.println(sb);
    }
    public static void queue(String cmd, int num) {
        switch (cmd) {
            case "push" : {
                last = num;
                queue.offer(num);
            }
            break;
            case "pop" : {
                if(queue.isEmpty()) sb.append("-1").append("\n");
                else sb.append(queue.poll()).append("\n");
            }
            break;
            case "size" : {
                sb.append(queue.size()).append("\n");
            }
            break;
            case "empty" : {
                if(queue.isEmpty()) sb.append("1").append("\n");
                else sb.append("0").append("\n");
            }
            break;
            case "front" : {
                if(queue.isEmpty()) sb.append("-1").append("\n");
                else sb.append(queue.peek()).append("\n");
            }
            break;
            case "back" : {
                if(queue.isEmpty()) sb.append("-1").append("\n");
                else sb.append(last).append("\n");
            }
            break;
        }
    }
}
