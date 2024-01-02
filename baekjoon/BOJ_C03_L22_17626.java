import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_C03_L22_17626 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1];
            for(int j = 1; j <= (int)Math.sqrt(i); j++) {
                dp[i] = Math.min(dp[i - j * j], dp[i]);
            }
            dp[i]++;
        }

        bw.write(dp[N] + "\n");
        br.close();
        bw.close();
    }
}
//dp를 사용한다. 각 i에 따라서 i보다 작은 제곱수 j 에 대해서 dp[i - j * j]와 dp[i]중 작은 수를 dp[i]에 넣고, 마지막에 1을 더한다.