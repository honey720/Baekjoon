import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1;
        StringTokenizer st2;
        
        int N = Integer.parseInt(br.readLine());
        st1 = new StringTokenizer(br.readLine());
        st2 = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st2.nextToken());
        int P = Integer.parseInt(st2.nextToken());
        br.close();
        
        int A = 0;
        while(st1.hasMoreTokens()) {
            int output = Integer.parseInt(st1.nextToken());
            A += output / T;
            if (output % T != 0) A++;
        }
        int B = N / P;
        int C = N % P;
        
        System.out.println(A);
        System.out.println(B + " " + C);
    }
}