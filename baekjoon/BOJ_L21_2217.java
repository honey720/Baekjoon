import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_L21_2217 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int ans = 0;
        int cnt = 0;
        while (cnt < N) {
            if(arr[cnt] * (N - cnt) > ans) {
                ans = arr[cnt] * (N - cnt);
            }
            cnt++;
        }
        System.out.println(ans);
    }
}
