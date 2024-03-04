import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L24_1303 {
    static int N, M, N_ans, M_ans;
    static boolean[][] map, visit;
    public static void main(String []args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new boolean[M][N];
        visit = new boolean[M][N];
        for(int i = 0; i < M; i++) {
            String input = br.readLine();
            for(int j = 0; j < N; j++) {
                if(input.charAt(j) == 'W') map[i][j] = true;
            }
        }
        N_ans = 0;
        M_ans = 0;
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                if(map[i][j]) N_ans += (int) Math.pow(find(i, j, map[i][j]), 2);
                else M_ans += (int) Math.pow(find(i, j, map[i][j]), 2);
            }
        }
        System.out.println(N_ans + " " + M_ans);
        br.close();
    }

    public static int find(int i, int j, boolean color) {
        int ans = 0;
        if(!visit[i][j] && color == map[i][j]) {
            ans++;
            visit[i][j] = true;
            int[][] range = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            for(int[] r : range) {
                int x = i + r[0];
                int y = j + r[1];
                if((x >= 0 && x < M) && (y >= 0 && y < N)) {
                    ans += find(x, y, color);
                }
            }
        }
        return ans;
    }
}
