import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_L21_1049 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] cost = new int[2][M];

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            cost[0][i] = Integer.parseInt(st.nextToken());
            cost[1][i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cost[0]);
        Arrays.sort(cost[1]);

        int ans = cost[0][0] * (int) Math.ceil((double) N / 6);
        for(int i = 0; i <= N / 6; i++) {
            int min = (cost[0][0]*(i)) + (cost[1][0]*(N-(i*6)));
            if(ans >= min) ans = min;
        }
        System.out.println(ans);
    }
}
