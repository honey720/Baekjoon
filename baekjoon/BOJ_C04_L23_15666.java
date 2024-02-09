import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_C04_L23_15666 {

    static int N, M;
    static int[] arr, answer;
    static HashSet<String> hs = new HashSet<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        answer = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        find(0, 0);
        bw.write(sb + "");
        br.close();
        bw.flush();
        bw.close();
    }

    public static void find(int count, int start) {
        if(count == M) {
            StringBuilder res = new StringBuilder();
            for(int i = 0; i < M; i++) {
                res.append(answer[i]).append(" ");
            }
            if(!hs.contains(String.valueOf(res))) {
                hs.add(String.valueOf(res));
                sb.append(res).append("\n");
            }
        }
        else {
            for(int i = start; i < N; i++) {
                answer[count] = arr[i];
                find(count + 1, i);
            }
        }
    }
}
