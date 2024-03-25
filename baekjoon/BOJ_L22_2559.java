import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L22_2559 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        int ans = Integer.MIN_VALUE;
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }
        for(int i = K; i < N+1; i++) {
            ans = Math.max(arr[i] - arr[i-K] , ans);
        }
        System.out.println(ans);
    }
}
