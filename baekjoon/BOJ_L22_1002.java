import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_L22_1002 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < T; i++) {
            int ans = -1;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            double dis = Math.sqrt(Math.pow(Math.abs(x1-x2), 2) + Math.pow(Math.abs(y1-y2), 2));
            double[] data = {dis, r1, r2};
            Arrays.sort(data);
            if(x1 != x2 || y1 != y2 || r1 != r2) {
                if(data[0] + data[1] < data[2]) ans = 0;
                else if(data[0] + data[1] == data[2]) ans = 1;
                else if(data[0] + data[1] > data[2]) ans = 2;
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}
