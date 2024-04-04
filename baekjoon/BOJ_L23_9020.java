import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BOJ_L23_9020 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        boolean[] p = new boolean[10001];
        p[0] = true;
        p[1] = true;
        for(int i = 2; i <= 10000; i++) if(!p[i]) for(int j = i * 2; j <= 10000; j += i) p[j] = true;
        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int s = N / 2;
            int e = N / 2;
            while (true) {
                if(!p[s] && !p[e]) {
                    sb.append(s).append(" ").append(e).append("\n");
                    break;
                }
                else {
                    s--;
                    e++;
                }
            }
        }
        System.out.println(sb);
    }
}
