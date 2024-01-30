import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_C03_L30_16928 {

    static int answer = 999_999_999;
    static Queue<int[]> queue = new LinkedList<>();

    static HashMap<Integer, Integer> event = new HashMap<>();
    static boolean[] visited = new boolean[101];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N + M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            event.put(from, to);
        }

        queue.offer(new int[] {1, 0});

        BFS();
        bw.write(answer + "");
        br.close();
        bw.flush();
        bw.close();
    }

    public static void BFS() {
        while(!queue.isEmpty()) {
            int[] input = queue.poll();
            for(int i = 1; i <= 6; i++) {
                int next = input[0] + i;
                int cnt = input[1] + 1;
                if(next == 100) {
                    if(answer > cnt) {
                        answer = cnt;
                    }
                    break;
                }
                else if(!visited[next]) {
                    if(event.containsKey(next)) {
                        queue.offer(new int[] {event.get(next), cnt});
                    }
                    else {
                        queue.offer(new int[] {next, cnt});
                    }
                    visited[next] = true;
                }
            }
        }
    }
}
