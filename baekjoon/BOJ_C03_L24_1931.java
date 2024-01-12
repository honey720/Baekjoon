import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_C03_L24_1931 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int answer = 0;
        int end = 0;

        int N = Integer.parseInt(br.readLine());
        int[][] time = new int[N][2];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            time[i][0] = s;
            time[i][1] = e;
            if(e > end) {
                end = e;
            }
        }
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]!=o2[1] ? o1[1]-o2[1] : o1[0]-o2[0];
            }
        });


        int idx = 0;
        int prev = 0;
        while(true) {
            boolean last = true;
            for(int i = idx; i < N; i++) {
                if(time[i][0] >= prev) {
                    answer++;
                    idx = i + 1;
                    prev = time[i][1];
                    last = false;
                    break;
                }
            }
            if(last) {
                break;
            }
        }
        sb.append(answer);
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
