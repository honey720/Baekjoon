import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_C03_L31_9019 {

    static int from, to;
    static Queue<Integer> queue;
    static HashMap<Integer, String> map;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String command;

        for(int i = 0; i < T; i++) {
            queue = new LinkedList<>();
            map = new HashMap<>();
            st = new StringTokenizer(br.readLine());
            from = Integer.parseInt(st.nextToken());
            to = Integer.parseInt(st.nextToken());
            command = "";
            map.put(from, command);
            queue.offer(from);
            sb.append(BFS()).append("\n");
        }
        bw.write(sb + "");
        br.close();
        bw.flush();
        bw.close();
    }

    public static String BFS() {
        int D, S, L, R, now;
        boolean[] visited = new boolean[10000];
        while (true) {
            now = queue.poll();
            String nowCommand = map.get(now);
            if (now == to) {
                return nowCommand;
            }
            else {
                D = (now * 2) % 10000;
                S = (now + 9999) % 10000;
                L = (now / 1000) + now * 10 % 10000;
                R = (now / 10) + now % 10 * 1000;
                if (!visited[D]) {
                    visited[D] = true;
                    map.put(D, nowCommand + "D");
                    queue.offer(D);
                }
                if (!visited[S]) {
                    visited[S] = true;
                    map.put(S, nowCommand + "S");
                    queue.offer(S);
                }
                if (!visited[L]) {
                    visited[L] = true;
                    map.put(L, nowCommand + "L");
                    queue.offer(L);
                }
                if (!visited[R]) {
                    visited[R] = true;
                    map.put(R, nowCommand + "R");
                    queue.offer(R);
                }
            }
        }
    }
}