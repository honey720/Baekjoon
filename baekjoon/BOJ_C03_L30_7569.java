import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_C03_L30_7569 {

    static int answer = 0;
    static int M, N, H;
    static int[][][] box;
    static boolean[][][] visited;
    static Queue<int[]> queue;
    static int[][] range = {{0, 0, 1}, {0, 0, -1}, {0, 1, 0}, {0, -1, 0}, {1, 0, 0}, {-1, 0, 0}};

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        box = new int[M][N][H];
        visited = new boolean[M][N][H];
        queue = new LinkedList<>();

        for(int i = 0; i < H; i++) {
            for(int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < M; k++) {
                    box[k][j][i] = Integer.parseInt(st.nextToken());
                    if(box[k][j][i] == 1) {
                        visited[k][j][i] = true;
                        queue.add(new int[]{k, j, i});
                    }
                    else if(box[k][j][i] == -1) {
                        visited[k][j][i] = true;
                    }
                }
            }
        }

        while (!queue.isEmpty()) {
            BFS();
        }

        find();

        bw.write(answer + "");
        br.close();
        bw.flush();
        bw.close();
    }

    public static void BFS() {
        boolean searched = false;
        int count = queue.size();
        for(int i = 0; i < count; i++) {
            int[] idx = queue.poll();
            for(int[] r: range) {
                int x = idx[0] + r[0];
                int y = idx[1] + r[1];
                int z = idx[2] + r[2];
                if((x >= 0 && x < M) && (y >= 0 && y < N) && (z >= 0 && z < H) && !visited[x][y][z]) {
                    searched = true;
                    box[x][y][z] = 1;
                    visited[x][y][z] = true;
                    queue.add(new int[]{x, y, z});
                }
            }
        }
        if(searched) {
            ++answer;
        }
    }

    public static void find() {
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < N; j++) {
                for(int k = 0; k < M; k++) {
                    if(box[k][j][i] == 0) {
                        answer = -1;
                        return;
                    }
                }
            }
        }
    }
}
