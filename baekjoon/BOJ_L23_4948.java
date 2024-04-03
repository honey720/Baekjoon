import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_L23_4948 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if(N == 0) break;
            int ans = 0;
            boolean[] p = new boolean[N*2+1];
            p[0] = true;
            if(N >= 1) p[1] = true;
            for(int i = 2; i <= N*2; i++) if(!p[i]) for(int j = i * 2; j <= N * 2; j += i) p[j] = true;
            for(int i = N + 1; i <= N * 2; i++) if(!p[i]) ans++;
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}
