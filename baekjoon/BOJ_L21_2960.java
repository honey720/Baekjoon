import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L21_2960 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        boolean[] arr = new boolean[N + 1];
        arr[0] = true;
        arr[1] = true;
        int cnt = 1;
        for(int i = 2; i <= N; i++) {
            for(int j = i; j <= N; j += i) {
                if (!arr[j]) {
                    if(cnt == K) {
                        System.out.println(j);
                        return;
                    }
                    else {
                        arr[j] = true;
                        cnt++;
                    }
                }
            }
        }
    }
}
