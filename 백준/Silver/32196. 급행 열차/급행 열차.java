import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long ans = 0;

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());
        long X = Long.parseLong(st.nextToken());
        long Y = Long.parseLong(st.nextToken());

        long[][] AB = new long[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());
            AB[i][0] = A;
            AB[i][1] = B;
        }

        Arrays.sort(AB, (o1, o2) -> {
            long diff1 = X * o1[0] - Y * o1[1];
            long diff2 = X * o2[0] - Y * o2[1];
            if (diff1 == diff2) {
                if (X >= Y) {
                    return Long.compare(o1[0], o2[0]);
                }
                return Long.compare(o2[0], o1[0]);
            } else return Long.compare(diff1, diff2);
        });

        long XK = K;
        long YK = K;

        for (int i  = 0; i < M; i++) {
            XK += AB[i][0];
            YK -= AB[i][1];
        }

        ans = XK * X + YK * Y;
        System.out.println(ans);

        br.close();
    }
}
