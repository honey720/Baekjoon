import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_C03_L23_2630 {

    static int[][]map;
    static int white = 0;
    static int blue = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        find(map, 0, N - 1, 0, N - 1);
        bw.write(sb.append(white).append("\n").append(blue).append("\n") + "");
        br.close();
        bw.flush();
        bw.close();
    }

    public static void find(int[][] map, int x_start, int x_end, int y_start, int y_end) {
        int color = map[x_start][y_start];
        for(int i = x_start; i <= x_end; i++) {
            for(int j = y_start; j <= y_end; j++) {
                if(map[i][j] != color) {
                    int x_mid = (x_start + x_end) / 2;
                    int y_mid = (y_start + y_end) / 2;
                    find(map, x_start, x_mid, y_start, y_mid);
                    find(map, x_mid + 1, x_end, y_start, y_mid);
                    find(map, x_start, x_mid, y_mid + 1, y_end);
                    find(map, x_mid + 1, x_end, y_mid + 1, y_end);
                    return;
                }
            }
        }
        if(color == 0) {
            white++;
        }
        else if(color == 1) {
            blue++;
        }

    }
}
