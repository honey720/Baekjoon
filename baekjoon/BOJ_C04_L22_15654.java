import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_C04_L22_15654 {

    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[] arr;
    static int[] answer;
    static boolean[] visited;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        answer = new int[M];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        find(N, M, 0);
        bw.write(sb + "");
        br.close();
        bw.flush();
        bw.close();
    }

    public static void find(int n, int m,  int count) {
        if(m == 0) {
            for(int i = 0; i < M; i++) {
                sb.append(answer[i]).append(" ");
            }
            sb.append("\n");
        }
        else {
            for(int i = 0; i < n; i++) {
                if(!visited[i]) {
                    visited[i] = true;
                    answer[count] = arr[i];
                    find(n, m - 1, count + 1);
                    visited[i] = false;
                }
            }
        }
    }
}
