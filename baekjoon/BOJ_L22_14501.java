import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L22_14501 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        int[] time = new int[N + 1];
        int[] pay = new int[N + 1];
        int[] dp = new int[N + 1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            pay[i] = Integer.parseInt(st.nextToken());
        }
        dp[N] = 0;

        for(int i = N - 1; i >= 0; i--) {
            if(time[i] + i <= N) {
                dp[i] = Math.max(dp[i + 1], dp[time[i] + i] + pay[i]);
            }
            else {
                dp[i] = dp[i + 1];
            }
        }
        System.out.println(dp[0]);
    }
}
