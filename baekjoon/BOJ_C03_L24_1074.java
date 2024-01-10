import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_C03_L24_1074 {

    static int answer;
    static int r;
    static int c;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        int idx = (int)Math.pow(2, N);

        z(0, idx * idx - 1, 0, idx - 1, 0, idx - 1);
        bw.write(answer + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void z(int idx_start, int idx_end, int r_start, int r_end, int c_start, int c_end) {
        if(idx_start == idx_end) {
            answer = idx_start;
        }
        else {
            int idx_quarter = (idx_end - idx_start + 1) / 4;
            int r_mid = (r_start + r_end) / 2;
            int c_mid = (c_start + c_end) / 2;
            if(r <= r_mid && c <= c_mid) {
                z(idx_start, idx_start + idx_quarter - 1, r_start, r_mid, c_start, c_mid);
            }
            else if(r <= r_mid && c > c_mid) {
                z(idx_start + idx_quarter, idx_start + idx_quarter * 2 - 1, r_start, r_mid, c_mid + 1, c_end);
            }
            else if(r > r_mid && c <= c_mid) {
                z(idx_start + idx_quarter * 2, idx_start + idx_quarter * 3 - 1, r_mid + 1, r_end, c_start, c_mid);
            }
            else if(r > r_mid && c > c_mid) {
                z(idx_start + idx_quarter * 3,  idx_start + idx_quarter * 4 - 1, r_mid + 1, r_end, c_mid + 1, c_end);
            }
        }
    }
}
