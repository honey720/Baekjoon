import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_L22_15656 {
    static int N, M;
    static int[] arr;
    static int[] ans;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        ans = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        find(0);
        System.out.println(sb);
        br.close();
    }

    public static void find(int idx) {
        if(idx == M) {
            for(int i : ans) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
        }
        else {
            for(int i = 0; i < N; i++) {
                ans[idx] = arr[i];
                find(idx + 1);
            }
        }
    }
}
