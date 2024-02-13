import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_C04_L24_1932 {

    static int N;
    static int[][] arr, dp;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        dp = new int[N][N];
        StringTokenizer st;
        for(int i = 0 ; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int idx = 0;
            while (st.hasMoreTokens()) {
                arr[i][idx] = Integer.parseInt(st.nextToken());
                ++idx;
            }
        }
        for(int i = N - 1; i >= 0; i--) {
            for(int j = 0; j <= i; j++) {
                find(i, j);
            }
        }
        System.out.println(dp[0][0]);
    }

    public static void find(int line, int idx) {
        if(line == N - 1)
            dp[line][idx] = arr[line][idx];
        else
            dp[line][idx] = arr[line][idx] + Math.max(dp[line + 1][idx], dp[line + 1][idx + 1]);
    }
}
