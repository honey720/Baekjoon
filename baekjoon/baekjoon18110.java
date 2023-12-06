import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon18110 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float answer = 0;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int cut = (int) Math.round(N * 0.15);

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i = 0; i < cut; i++) {
            arr[i] = 0;
            arr[N-i-1] = 0;
        }

        for(int i = 0; i < N; i++) {
            answer += arr[i];
        }

        System.out.print(Math.round(answer / (N - (2 * cut))));
    }
}
