import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_C04_L24_1149 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] ans= new int[N][3];
        int[][] RGBCost = new int[N][3];
        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++) {
                RGBCost[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.arraycopy(RGBCost[0], 0, ans[0], 0, 3);
        for(int i = 1; i < N; i++) {
            ans[i][0] = Math.min(ans[i-1][1],ans[i-1][2]) + RGBCost[i][0];
            ans[i][1] = Math.min(ans[i-1][0],ans[i-1][2]) + RGBCost[i][1];
            ans[i][2] = Math.min(ans[i-1][0],ans[i-1][1]) + RGBCost[i][2];
        }
        System.out.println(Math.min(Math.min(ans[N-1][0], ans[N-1][1]), ans[N-1][2]));
    }
}
