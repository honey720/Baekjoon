import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L24_1262 {//알파벳 다이아몬드
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int R1 = Integer.parseInt(st.nextToken());
        int C1 = Integer.parseInt(st.nextToken());
        int R2 = Integer.parseInt(st.nextToken());
        int C2 = Integer.parseInt(st.nextToken());
        int T = 2*N-1;
        StringBuilder sb = new StringBuilder();
        for(int i = R1; i <= R2; i++) {
            int ir = i % T;
            int r = (ir < N) ? N - ir - 1 : ir - N + 1;
            for(int j = C1; j <= C2; j++) {
                int cr = j % T;
                char c;
                if(cr >= r && cr < T - r) {
                    c = (char) (97 + ((cr < N) ? (N - cr + r - 1) % 26 : (cr - N + r + 1) % 26));
                }
                else c = 46;
                sb.append(c);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
