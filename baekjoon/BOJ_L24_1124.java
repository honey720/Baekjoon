import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L24_1124 {
    static boolean[] prime;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int ans = 0;
        prime = Prime(B);
        for(int i = A; i <= B; i++) {
            if(prime[i]) {
                if(!prime[underPrime(i)]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
    public static int underPrime(int n) {
        int cnt = 1;
        if(prime[n]) {
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    return underPrime(n / i) + cnt;
                }
            }
        }
        return cnt;
    }
    public static boolean[] Prime(int n) {
        boolean[] prime = new boolean[n+1];
        prime[0] = false;
        prime[1] = false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(prime[i] == true) {
                continue;
            }
            for(int j = i * i; j < prime.length; j = j+i) {
                prime[j] = true;
            }
        }
        return prime;
    }
}
