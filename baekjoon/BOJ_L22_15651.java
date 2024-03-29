import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L22_15651 {
    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        find(0);
        System.out.println(sb);
    }

    public static void find(int idx) {
        if (idx != M) {
            for (int i = 1; i <= N; i++) {
                arr[idx] = i;
                find(idx + 1);
            }
        }
        else {
            for(int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
        }
    }
}
