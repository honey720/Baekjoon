import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_C03_L24_20529 {

    public static void main(String []args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int N;
        String[] MBTI;
        int dis;
        int tmp;

        for(int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            MBTI = new String[N];
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                MBTI[j] = st.nextToken();
            }

            dis = 32;
            for(int a = 0; a < N; a++) {
                for(int b = a + 1; b < N; b++) {
                    for(int c = b + 1; c < N; c++) {
                        tmp = 0;
                        for(int d = 0; d < 4; d++) {
                            if((MBTI[a].charAt(d) != MBTI[b].charAt(d)) || (MBTI[a].charAt(d) != MBTI[c].charAt(d)) || (MBTI[b].charAt(d) != MBTI[c].charAt(d))) {
                                tmp += 2;
                            }
                        }
                        dis = Math.min(dis, tmp);
                    }
                    if(dis == 0) {
                        break;
                    }
                }
                if(dis == 0) {
                    break;
                }
            }
            sb.append(dis).append("\n");
        }

        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
