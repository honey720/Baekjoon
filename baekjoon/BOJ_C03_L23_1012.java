import java.io.*;
import java.util.StringTokenizer;

public class BOJ_C03_L23_1012 {

    static boolean[][] map;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            map = new boolean[M][N];

            for(int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = true;
            }

            for(int x = 0; x < M; x++) {
                for(int y = 0; y < N; y++) {
                    if(map[x][y]) {
                        count++;
                        dfs(x, y);
                    }
                }
            }
            sb.append(count).append("\n");
        }

        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }

    public static void dfs(int x, int y) {
        if(map[x][y]) {
            map[x][y] = false;
            int[] range = {-1, 1};
            for(int i : range) {
                if((x + i >= 0 && x + i < map.length)) {
                    dfs(x + i, y);
                }
                if((y + i >= 0 && y + i < map[0].length)) {
                    dfs(x, y + i);
                }
            }
        }
    }
}
