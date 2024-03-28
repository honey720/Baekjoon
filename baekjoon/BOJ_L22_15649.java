import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L22_15649 {
    static int N, M;
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        visit = new boolean[N+1];
        find(0, 1);
        System.out.println(sb);
    }
    public static void find(int cnt, int now) {
        if(cnt != M) {
            for(int i = 1; i <= N; i++) {
                if(!visit[i]) {
                    visit[i] = !visit[i];
                    arr[cnt] = i;
                    find(cnt + 1, now + 1);
                    visit[i] = !visit[i];
                }
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
