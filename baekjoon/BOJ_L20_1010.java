import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_L20_1010 {

    public static int [][] dp = new int[30][30];
    public static int answer;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++) {
            answer = 0;
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            sb.append(combi(n,r)).append("\n");
        }

        bw.write(String.valueOf(sb));

        br.close();
        bw.close();
    }
    //조합
    public static int combi(int n,int r) {

        if (dp[n][r] > 0) {
            return dp[n][r];
        }

        if (n == r || r == 0) {
            return dp[n][r] = 1;
        }
        return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }
}
