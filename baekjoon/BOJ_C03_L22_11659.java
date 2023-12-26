import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_C03_L22_11659 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[100001];
        int[] sum = new int[100001];
        arr[0] = 0;
        sum[0] = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                sum[i] = sum[i - 1] + arr[i];
        }

        for(int j = 1; j <= M; j++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            sb.append(sum[end] - sum[start - 1]).append("\n");
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.close();
    }
}
//누적 합 구하기 (3에서 6번 인덱스의 합 = 0에서 6번 인덱스의 합 - 0에서 2번 인덱스의 합)