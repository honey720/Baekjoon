import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_C03_L22_1463 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];
        dp[0] = 0;
        for(int i = 1; i <= N; i++) {
            int count = 0;
            int temp1 = 1000000;
            int temp2 = 1000000;
            int temp3 = 1000000;
            if(i == 1) {
                dp[i] = count;
            }
            else {
                if(i % 3 == 0) {
                    temp1 = dp[i / 3] + 1;
                }
                if(i % 2 == 0) {
                    temp2 = dp[i / 2] + 1;
                }
                if(i - 1 > 0) {
                    temp3 = dp[i - 1] + 1;
                }
                dp[i] = Math.min(Math.min(temp1, temp2), temp3);
            }
        }
        System.out.print(dp[N]);
    }
}
