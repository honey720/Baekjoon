import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L22_13305 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dis = new int[N-1];
        int[] cost = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N-1; i++) {
            dis[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }
        long ans = 0;
        int idx = 0;
        for(int i = 1 ; i < N - 1; i++) {
            if(cost[idx] > cost[i]) {
                long total_dis = 0;
                for(int j = idx; j < i; j++) {
                    total_dis += dis[j];
                }
                ans += total_dis * cost[idx];
                idx = i;
            }
        }
        long total_dis = 0;
        for(int i = idx; i < N-1; i++) {
            total_dis += dis[i];
        }
        ans += total_dis * cost[idx];
        System.out.println(ans);
    }
}
