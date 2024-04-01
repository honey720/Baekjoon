import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L22_1004 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int i = 0; i < T; i++) {
            int ans = 0;
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(br.readLine());
            for(int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());
                boolean b1 = Math.sqrt(Math.pow(Math.abs(x-x1), 2) + Math.pow(Math.abs(y-y1), 2)) < d;
                boolean b2 = Math.sqrt(Math.pow(Math.abs(x-x2), 2) + Math.pow(Math.abs(y-y2), 2)) < d;
                if((b1 && !b2) || (!b1 && b2)) ans++;
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}
