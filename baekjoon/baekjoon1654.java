import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon1654 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String input = br.readLine();
        st = new StringTokenizer(input);
        long answer = 0;

        int N = Integer.parseInt(st.nextToken());
        long need = Integer.parseInt(st.nextToken());
        long[] arr = new long[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        long min = 0;
        long max = Arrays.stream(arr).sum() / need;

        while (min <= max) {
            long mid = (min + max) / 2;
            if(min == 0 && max == 1) {
                mid = 1;
            }
            long count = 0;
            for(long i : arr) {
                    count += i / mid;
            }
            if(count >= need) {
                answer = mid;
                min = mid + 1;
            }
            else {
                max = mid - 1;
            }
        }
        System.out.print(answer);
        br.close();
    }
}
