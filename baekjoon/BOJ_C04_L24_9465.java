import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_C04_L24_9465 {

    static int N;
    static int[][] arr, dp;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N][2];
            dp = new int[N][2];
            StringTokenizer st;
            for(int j = 0; j < 2; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < N; k++) {
                    arr[k][j] = Integer.parseInt(st.nextToken());
                }
            }
            for(int j = N - 1; j >= 0; j--) {
                find(j, 0);
                find(j, 1);
            }
            sb.append(Math.max(dp[0][0], dp[0][1])).append("\n");
        }
        System.out.println(sb + "");
        br.close();
    }

    public static void find(int lnk, int idx) {
        if (lnk == N - 1)
            dp[lnk][idx] = arr[lnk][idx];
        else if (lnk == N - 2) {
            if (idx == 0)
                dp[lnk][idx] = arr[lnk][idx] + dp[lnk + 1][1];
            else
                dp[lnk][idx] = arr[lnk][idx] + dp[lnk + 1][0];
        } else {
            if (idx == 0)
                dp[lnk][idx] = arr[lnk][idx] + Math.max(dp[lnk + 1][1], dp[lnk + 2][1]);
            else
                dp[lnk][idx] = arr[lnk][idx] + Math.max(dp[lnk + 1][0], dp[lnk + 2][0]);
        }
    }
}
