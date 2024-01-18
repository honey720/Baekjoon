import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_C03_L24_1389 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;

        int a, b;
        boolean[][] graph = new boolean[N + 1][N + 1];
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = true;
        }

        int[][] floyd = new int[N + 1][N + 1];
        for(int i = 1; i < floyd.length; i++) {
            for(int j = 1; j < floyd.length; j++) {
                if(i == j) {
                    floyd[i][j] = 0;
                }
                else if(graph[i][j]) {
                    floyd[i][j] = 1;
                }
                else {
                    floyd[i][j] = 999_999_999;
                }
            }
        }

        for(int i = 1; i < floyd.length; i++) {
            for(int j = 1; j < floyd.length; j++) {
                for(int k = 1; k < floyd.length; k++) {
                    floyd[j][k] = Math.min(floyd[j][k], floyd[j][i] + floyd[i][k]);
                }
            }
        }

        for(int i = 1; i < floyd.length; i++) {
            if(i == 1) {
                answer = 1;
            }
            else if(Arrays.stream(floyd[i]).sum() < Arrays.stream(floyd[answer]).sum()) {
                answer = i;
            }
        }
        sb.append(answer);
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
