import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_L22_2407 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if(n/2 < m) m = n - m;
        BigInteger A = new BigInteger(String.valueOf(1));
        BigInteger B = new BigInteger(String.valueOf(1));
        BigInteger tmp;
        for(int i = n; i > n - m; i--) {
            tmp = new BigInteger(String.valueOf(i));
            A = A.multiply(tmp);
        }
        for(int i = m; i > 0; i--) {
            tmp = new BigInteger(String.valueOf(i));
            B = B.multiply(tmp);
        }
        System.out.println(A.divide(B));
        br.close();
    }
}
