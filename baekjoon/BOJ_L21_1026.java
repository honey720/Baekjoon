import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_L21_1026 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[][] arr = new Integer[2][N];
        int ans = 0;
        for(int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) arr[i][j] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr[0], Comparator.naturalOrder());
        Arrays.sort(arr[1], Comparator.reverseOrder());
        for(int i = 0; i < N; i++) ans += arr[0][i] * arr[1][i];
        System.out.println(ans);
    }
}
