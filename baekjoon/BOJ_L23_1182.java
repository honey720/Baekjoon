import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L23_1182 {

    static int N, S, ans;
    static int[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        ans = 0;
        find(0, 0);
        if(S == 0) ans--;
        System.out.println(ans);
    }

    public static void find(int idx, int sum) {
        if(idx == N) {
            if(sum == S) ans++;
        }
        else {
            find(idx + 1, sum);
            find(idx + 1, sum + arr[idx]);
        }
    }
}
