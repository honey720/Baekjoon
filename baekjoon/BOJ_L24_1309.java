import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_L24_1309 {
    public static void main(String []args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        final int MOD = 9901;
        long[][] dp = new long[N+1][3];
        dp[1][0] = dp[1][1] = dp[1][2] = 1;
        for(int i = 2; i <= N; i++) {//점화식
            dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2]) % MOD;
            //윗 칸에 사자가 어느 칸에도 존재하지 않는 경우. 아래 칸에 어떤 경우가 와도 문제가 없다.
            dp[i][1] = (dp[i-1][0] + dp[i-1][2]) % MOD;
            //윗 칸에 사자가 1번 칸에 존재하는 경우. 아래 칸에 사자가 1번 칸 말고 어떤 경우가 와도 문제가 없다.
            dp[i][2] = (dp[i-1][0] + dp[i-1][1]) % MOD;
            //윗 칸에 사자가 2번 칸에 존재하는 경우. 아래 칸에 사자가 2번 칸 말고 어떤 경우가 와도 문제가 없다.
        }
        System.out.println((dp[N][0] + dp[N][1] + dp[N][2]) % MOD);
    }
}
