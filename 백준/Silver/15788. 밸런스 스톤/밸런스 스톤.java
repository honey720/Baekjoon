import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[][] map = new long[N][N];
        int x = 0, y = 0;
        boolean a = false, b = false;
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                long input = Long.parseLong(st.nextToken());
                if (input == 0) {
                    x = i;
                    y = j;
                }
                map[i][j] = input;
            }
        }

        if (x == y) a = true;
        if (x + y == N - 1) b = true;

        long answer = -1;
        while (true) {
            long B_sum;
            long s;

            boolean fail = false;

            B_sum = Arrays.stream(map[x]).sum();

            s = 0;
            for (int i = 0; i < N; i++)
                s += map[i][y];
            if (s != B_sum) break;

            if (a) {
                s = 0;
                for (int i = 0; i < N; i++)
                    s += map[i][i];
                if (s != B_sum) break;
            }

            if (b) {
                s = 0;
                for (int i = 0; i < N; i++)
                    s += map[i][(N-i)-1];
                if (s != B_sum) break;
            }

            long sum = 0;
            boolean save = false;

            for (int i = 0; i < N; i++) {
                if (i == x) continue;
                s = Arrays.stream(map[i]).sum();
                if (save) {
                    if (s != sum) {
                        fail = true;
                        break;
                    }
                }
                else {
                    sum = s;
                    save = true;
                }
            }
            if (fail) break;

            for (int i = 0; i < N; i++) {
                s = 0;
                if (i == y) continue;
                for (int j = 0; j < N; j++) {
                    s += map[j][i];
                }
                if (s != sum) {
                    fail = true;
                    break;
                }
            }
            if (fail) break;

            if (!a) {
                s = 0;
                for (int i = 0; i < N; i++)
                    s += map[i][i];
                if (s != sum) break;
            }

            if (!b) {
                s = 0;
                for (int i = 0; i < N; i++)
                    s += map[i][(N-i)-1];
                if (s != sum) break;
            }


            if (sum - B_sum == 0) break;
            answer = sum - B_sum;
            break;
        }

        System.out.println(answer);
        br.close();
    }
}