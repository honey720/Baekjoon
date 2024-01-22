import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_C03_L24_6064 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        int M, N, x, y, x_cnt, y_cnt, a, b;
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            x_cnt = 0;
            y_cnt = 0;

            while (true) {
                a = M * x_cnt + x;
                b = N * y_cnt + y;
                if(a > M * N || b > M * N) {
                    sb.append(-1).append("\n");
                    break;
                }
                else if(a == b) {
                    sb.append(a).append("\n");
                    break;
                }
                else {
                    if(a <= b) {
                        ++x_cnt;
                    }
                    else {
                        ++y_cnt;
                    }
                }
            }
        }

        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
