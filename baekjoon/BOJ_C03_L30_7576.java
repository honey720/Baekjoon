import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_C03_L30_7576 {

    public static void main(String[] args) throws Exception{
        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                int input = Integer.parseInt(st.nextToken());
                if(input == 1) {
                    queue.offer(new int[]{i, j});
                }
                map[i][j] = input;
            }
        }

        int[][] range = {{0,-1}, {0,1}, {-1,0}, {1,0}};
        while (true) {
            int count = queue.size();
            boolean changed = false;
            for(int i = 0; i < count; i++) {
                int[] coor = queue.poll();
                for(int[] r: range) {
                    int x = coor[0] + r[0];
                    int y = coor[1] + r[1];
                    if(((x >= 0 && x < N) && (y >= 0 && y < M)) && map[x][y] == 0) {
                        map[x][y] = 1;
                        queue.offer(new int[]{x, y});
                        changed = true;
                    }
                }
            }

            if (changed) {
                answer++;
            }
            else {
                break;
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    answer = -1;
                    break;
                }
            }
        }

        bw.write(String.valueOf(answer));
        br.close();
        bw.flush();
        bw.close();
    }
}
