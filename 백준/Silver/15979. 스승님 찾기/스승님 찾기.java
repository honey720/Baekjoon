import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Math.abs(Integer.parseInt(st.nextToken()));
        int N = Math.abs(Integer.parseInt(st.nextToken()));

        int result = 1;

        if(N == 0 && M == 0)
            result = 0;
        else {
            int gcd = getGCD(M, N);
            if(gcd != 1) result = 2;
        }
        System.out.println(result);

        br.close();
    }

    public static int getGCD(int num1, int num2) {
        if(num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
}
