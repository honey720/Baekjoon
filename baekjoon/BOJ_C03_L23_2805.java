import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_C03_L23_2805 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        long[] trees = new long[N];
        long min = 0;
        long max = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            if(trees[i] > max) {
                max = trees[i];
            }
        }

        while (min < max) {
            long get = 0;
            long mid = (min + max) / 2;

            for(long i : trees) {
                long cut = i - mid;
                if(cut > 0) {
                    get += cut;
                }
            }
            if(max - min == 1) {
                long get2 = 0;
                for(long i : trees) {
                    long cut2 = i - (mid + 1);
                    if(cut2 > 0) {
                        get2 += cut2;
                    }
                }
                if(get2 < M) {
                    max = mid;
                }
                break;
            }

            if(get == M) {
                max = mid;
                break;
            }
            else if(get > M) {
                min = mid;
            }
            else {
                max = mid - 1;
            }
        }

        System.out.println(max);
        br.close();
    }
}
