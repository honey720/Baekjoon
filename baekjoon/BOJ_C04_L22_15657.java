import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_C04_L22_15657 {

    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] arr;
    static int[] answer;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        answer = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        answer[0] = arr[0];
        find(0,  0, 0);
        bw.write(sb + "");
        br.close();
        bw.flush();
        bw.close();
    }
    public static void find(int m, int start, int count) {
        if(m == M) {
            for(int i = 0; i < M; i++) {
                sb.append(answer[i]).append(" ");
            }
            sb.append("\n");
        }
        else {
            for(int i = start; i < N; i++) {
                answer[count] = arr[i];
                find(m + 1, i, count + 1);
            }
        }
    }
}
