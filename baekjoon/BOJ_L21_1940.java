import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_L21_1940 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int start = 0;
        int end = N - 1;
        int ans = 0;
        while (start < end) {
            if(arr[start] + arr[end] == M) {
                ans++;
                start++;
                end--;
            }
            else if(arr[start] > M - arr[end]) {
                end--;
            }
            else {
                start++;
            }
        }
        System.out.println(ans);
        br.close();
    }
}
