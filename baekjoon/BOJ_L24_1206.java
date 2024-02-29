import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L24_1206 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] avg = new int[N];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ".");
            avg[i] = Integer.parseInt(st.nextToken() + st.nextToken());
        }
        int p = 1000;
        for(int i = 1; i <= 1000; i++) {
            boolean chk = true;
            for(int j : avg) {
                int s = j * i;
                int e = (j+1) * i;
                if((s % 1000 != 0 && (e / 1000 - s / 1000 == 0)) || e % 1000 == 0) {
                    chk = false;
                    break;
                }
            }
            if(chk) {
                p = i;
                break;
            }
        }
        System.out.println(p);
        br.close();
    }
}
