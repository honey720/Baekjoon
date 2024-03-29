import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_C04_L31_14502 {
    static int N, M, ans;
    static int[][] map;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        find(0, 0, 0);
        System.out.println(ans);
    }
    public static void find(int idx, int x, int y) {
        for(int i = x; i < N; i++) {
            for(int j = y; j < M; j++) {
                if(map[i][j] == 0) {
                    if(idx == 3) {
                        int[][] tmp_map = new int[N][M];
                        for(int a = 0; a < N; a++) {
                            tmp_map[a] = Arrays.copyOf(map[a], M);
                        }
                        BFS(tmp_map);
                        return;
                    }
                    else {
                        map[i][j] = 1;
                        find(idx + 1, x, y);
                        map[i][j] = 0;
                    }
                }
            }
        }
    }

    static int[][] range = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
    public static void BFS(int[][] map) {
        int cnt = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(map[i][j] == 2) {
                    queue.offer(new int[] {i, j});
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] xy = queue.poll();
            for(int[] r : range) {
                int x = xy[0] + r[0];
                int y = xy[1] + r[1];
                if((x >= 0 && x < N) && (y >= 0 && y < M) && map[x][y] == 0) {
                    map[x][y] = 2;
                    queue.offer(new int[] {x, y});
                }
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(map[i][j] == 0) {
                    cnt++;
                }
            }
        }
        if(cnt > ans) {
            ans = cnt;
        }
    }
}
