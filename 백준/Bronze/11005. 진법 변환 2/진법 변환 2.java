import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger N = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());

        while (N.compareTo(B) >= 0) {
            int mod = Integer.parseInt(N.mod(B).toString());
            N = N.divide(B);
            if (mod > 9) {
                char c = (char) (65 + (mod - 10));
                sb.append(c);
            }
            else sb.append(String.valueOf(mod));
        }
        if (N.intValue() > 9) {
            char c = (char) (65 + (N.intValue() - 10));
            sb.append(c);
        }
        else sb.append(N.toString());
        String answer = sb.reverse().toString();
        System.out.println(answer);
        br.close();
    }
}
