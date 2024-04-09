import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_L23_4963 {

    static int w, h;
    static boolean[][] map;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int ans = 0;
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w == 0 && h == 0) break;
            map = new boolean[h][w];
            for(int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < w; j++) {
                    String input = st.nextToken();
                    if(input.equals("1")) map[i][j] = true;
                }
            }
            for(int i = 0; i < h; i++) {
                for(int j = 0; j < w; j++) {
                    if(map[i][j]) {
                        DFS(i, j);
                        ans++;
                    }
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }

    public static void DFS(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x, y});
        map[x][y] = false;
        while (!q.isEmpty()) {
            int[] xy = q.poll();
            for(int i = -1; i <= 1; i++) {
                for(int j = -1; j <= 1; j++) {
                    int a = xy[0] + i;
                    int b = xy[1] + j;
                    if(((a >= 0 && a < h) && (b >= 0 && b < w)) && map[a][b]) {
                        q.offer(new int[] {a, b});
                        map[a][b] = false;
                    }
                }
            }
        }
    }

}
