import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_C04_L22_15652 {

    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] idx;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        idx = new int[M + 1];

        find(N, M, 1);
        bw.write(sb + "");
        br.close();
        bw.flush();
        bw.close();
    }

    public static void find(int n, int m, int start) {
        if(m == 0) {
            for(int i = M; i > 0; i--) {
                sb.append(idx[i]).append(" ");
            }
            sb.append("\n");
        }
        else {
            for(int i = start; i <= n; i++) {
                idx[m] = i;
                find(n, m - 1, i);
            }
        }
    }
}
