import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BOJ_C03_L30_5430 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String command = br.readLine();
            int N = Integer.parseInt(br.readLine());
            String input = br.readLine();
            st = new StringTokenizer(input.substring(1, input.length() - 1), ",");

            ArrayDeque<Integer> deque = new ArrayDeque<>();
            for(int j = 0; j < N; j++) {
                deque.offer(Integer.parseInt(st.nextToken()));
            }

            boolean reverse = false;
            boolean error = false;
            for(int j = 0; j < command.length(); j++) {
                if(command.charAt(j) == 'R') {
                    reverse = !reverse;
                }
                else {
                    if(deque.isEmpty()) {
                        error = true;
                        break;
                    }
                    else {
                        if(reverse) {
                            deque.pollLast();
                        }
                        else {
                            deque.pollFirst();
                        }
                    }
                }
            }

            if(error) {
                sb.append("error").append("\n");
            }
            else {
                sb.append("[");
                if(!deque.isEmpty()) {
                    if(reverse) {
                        sb.append(deque.pollLast());
                        while (!deque.isEmpty()) {
                            sb.append(",").append(deque.pollLast());
                        }
                    }
                    else {
                        sb.append(deque.pollFirst());
                        while (!deque.isEmpty()) {
                            sb.append(",").append(deque.pollFirst());
                        }
                    }
                }
                sb.append("]").append("\n");
            }
        }

        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
