import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_C04_L30_13549 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 100000;
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        if(N == K) {
            answer = 0;
        }
        else {
            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[] {N, 0});
            boolean[] visited = new boolean[100001];
            visited[N] = true;
            while (!q.isEmpty()) {
                int[] out = q.poll();
                if(out[0]*2 <= 100000 && !visited[out[0]*2]) {
                    if(out[0]*2 == K) {
                        answer = out[1];
                        break;
                    }
                    q.offer(new int[] {out[0]*2, out[1]});
                    visited[out[0]*2] = true;
                }
                if(out[0]-1 >= 0 && !visited[out[0]-1]){
                    if(out[0]-1 == K) {
                        answer = out[1]+1;
                        break;
                    }
                    q.offer(new int[] {out[0]-1, out[1]+1});
                    visited[out[0]-1] = true;
                }
                if(out[0]+1 <= 100000 && !visited[out[0]+1]) {
                    if(out[0]+1 == K) {
                        answer = out[1]+1;
                        break;
                    }
                    q.offer(new int[] {out[0]+1, out[1]+1});
                    visited[out[0]+1] = true;
                }
            }
        }
        System.out.println(answer);
        br.close();
    }
}
