import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_C03_L31_14500 {

    static int answer = 0;
    static int N, M;
    static int[][] map;
    static int[][] range = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                DFS(new int[]{i, j}, new int[]{-10, -10}, 1, map[i][j]);
            }
        }

        bw.write(answer + "");
        br.close();
        bw.flush();
        bw.close();
    }

    public static void DFS(int[] now, int[] prev, int count, int sum) {
        if(count == 4) {
            if(answer < sum) {
                answer = sum;
            }
        }
        else {
            for(int[] r : range) {
                int x = now[0] + r[0];
                int y = now[1] + r[1];
                if((x >= 0 && x < N) && (y >= 0 && y < M)) {
                    if(x != prev[0] || y != prev[1]) {
                        DFS(new int[]{x, y}, now, count + 1, (sum + map[x][y]));
                    }
                    else if(count == 2) {
                        int tmp;
                        if(r[0] == 0 && (x + 1 < N && x - 1 >= 0)) {
                            tmp = sum + map[x+1][y] + map[x-1][y];
                            if(answer < tmp) {
                                answer = tmp;
                                return;
                            }
                        }
                        else if(r[1] == 0 && (y + 1 < M && y - 1 >= 0)) {
                            tmp = sum + map[x][y+1] + map[x][y-1];
                            if(answer < tmp) {
                                answer = tmp;
                                return;
                            }
                        }
                    }

                }
            }
        }
    }
}
