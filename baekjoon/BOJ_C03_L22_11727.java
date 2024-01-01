import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_C03_L22_11727 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dp = new int [1001];
        dp[1] = 1;
        dp[2] = 3;
        int input = Integer.parseInt(br.readLine());

        for(int i = 3; i <= input; i++) {
            dp[i] = (dp[i - 2] * 2 + dp[i - 1]) % 10007;
        }
        System.out.println(dp[input]);
        br.close();
    }
}
