import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L21_3036 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            int gcd = GCD(arr[0], arr[i]);
            sb.append(arr[0]/gcd).append("/").append(arr[i]/gcd).append("\n");
        }
        System.out.println(sb);
    }

    static int GCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        } else {
            return GCD(n2, n1 % n2);
        }
    }
}
