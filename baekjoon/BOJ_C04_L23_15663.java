import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_C04_L23_15663 {

    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] answer, arr;
    static boolean[] visited;
    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        answer = new int[M];
        arr = new int[N];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        find(0);
        bw.write(sb + "");
        br.close();
        bw.flush();
        bw.close();
    }

    public static void find(int count) {
        if(count == M) {
            StringBuilder result = new StringBuilder();
            for(int i = 0; i < M; i++) {
                result.append(answer[i]).append(" ");
            }
            if(!set.contains(result + "")) {
                set.add(result + "");
                sb.append(result).append("\n");
            }
        }
        else {
            for(int i = 0; i < N; i++) {
                if(!visited[i]) {
                    visited[i] = true;
                    answer[count] = arr[i];
                    find(count + 1);
                    visited[i] = false;
                }
            }
        }
    }
}
