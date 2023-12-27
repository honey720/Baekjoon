import java.io.BufferedReader;

import java.io.InputStreamReader;

public class BOJ_C03_L22_11726 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dp = new int[1001];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        int input = Integer.parseInt(br.readLine());

        for(int i = 3; i <= input; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }

        System.out.print(dp[input]);

        br.close();
    }
}
