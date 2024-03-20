import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_L21_1748 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        int cnt = 0;
        long ans = 0;

        while (N > 9L * Math.pow(10, cnt)) {
            ans += (long) ((cnt + 1) * (9L * Math.pow(10, cnt)));
            N -= (long) (9L * Math.pow(10, cnt));
            cnt++;
        }
        ans += (cnt + 1) * N;

        System.out.println(ans);
    }
}
