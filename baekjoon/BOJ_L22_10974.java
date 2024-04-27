import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_L22_10974 {

    static int N;
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        visit = new boolean[N];
        soon(0);
        System.out.println(sb);
    }

    public static void soon(int idx) {
        if(idx == N) {
            for(int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
        }
        else {
            for(int i = 0; i < N; i++) {
                if(!visit[i]) {
                    visit[i] = true;
                    arr[idx] = i + 1;
                    soon(idx + 1);
                    visit[i] = false;
                }
            }
        }
    }
}
