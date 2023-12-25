import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_C03_L22_9461 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Long[] arr = new Long[101];

        for(int j = 1; j <= 100; j++) {
            if(j <= 3) {
                arr[j] = 1L;
            }
            else if(j <= 5) {
                arr[j] = 2L;
            }
            else {
                arr[j] = arr[j - 5] + arr[j - 1];
            }
        }

        for(int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            sb.append(arr[input]).append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}
