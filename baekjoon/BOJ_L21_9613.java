import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L21_9613 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            Long ans = 0L;
            for(int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for(int j = 0; j < N; j++) {
                for(int k = j+1; k < N; k++) {
                    ans += (long) GCD(arr[j], arr[k]);
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
    static int GCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        } else {
            return GCD(n2, n1 % n2);
        }
    }
}
