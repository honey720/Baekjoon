import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_C04_L30_2096 {

    static int N;
    static int[][] arr;
    static int[][] dp_max, dp_min;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1][3];
        dp_max = new int[N + 1][3];
        dp_min = new int[N + 1][3];
        for(int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < 3; i++) {
            dp_max[N][i] = arr[N][i];
            dp_min[N][i] = arr[N][i];
        }
        for(int i = N - 1; i >= 0; i--) {
            dp_max[i][0] = arr[i][0] + Math.max(dp_max[i+1][0], dp_max[i+1][1]);
            dp_min[i][0] = arr[i][0] + Math.min(dp_min[i+1][0], dp_min[i+1][1]);
            dp_max[i][1] = arr[i][1] + Math.max(Math.max(dp_max[i+1][0], dp_max[i+1][1]), dp_max[i+1][2]);
            dp_min[i][1] = arr[i][1] + Math.min(Math.min(dp_min[i+1][0], dp_min[i+1][1]), dp_min[i+1][2]);
            dp_max[i][2] = arr[i][2] + Math.max(dp_max[i+1][1], dp_max[i+1][2]);
            dp_min[i][2] = arr[i][2] + Math.min(dp_min[i+1][1], dp_min[i+1][2]);
        }
        int max = Math.max(Math.max(dp_max[1][0], dp_max[1][1]), dp_max[1][2]);
        int min = Math.min(Math.min(dp_min[1][0], dp_min[1][1]), dp_min[1][2]);
        System.out.println(max + " " + min);
    }

}
