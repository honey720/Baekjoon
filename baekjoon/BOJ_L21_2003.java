import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L21_2003 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int ans = 0;
        for(int i = 0; i < N; i++) {
            int tmp = 0;
            for(int j = i; j < N; j++) {
                if(tmp + arr[j] == M) {
                    ans++;
                    break;
                }
                else if(tmp + arr[j] > M) break;
                tmp += arr[j];
            }
        }
        System.out.println(ans);
    }
}
