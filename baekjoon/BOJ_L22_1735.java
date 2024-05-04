import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L22_1735 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A1 = Integer.parseInt(st.nextToken());
        int A2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int B1 = Integer.parseInt(st.nextToken());
        int B2 = Integer.parseInt(st.nextToken());
        int sum1 = (A1 * B2) + (B1 * A2);
        int sum2 = A2 * B2;
        int gcd = gcd(sum1, sum2);
        sum1 /= gcd;
        sum2 /= gcd;
        System.out.println(sum1 + " " + sum2);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
