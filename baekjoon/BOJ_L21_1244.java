import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L21_1244 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[] sw = new boolean[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            if(st.nextToken().equals("1")) sw[i] = true;
        }
        int T = Integer.parseInt(br.readLine());
        for(int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());
            if(st.nextToken().equals("1")) {
                int input = Integer.parseInt(st.nextToken());
                int idx = input;
                while (idx <= N) {
                    sw[idx] = !sw[idx];
                    idx += input;
                }
            }
            else {
                int input = Integer.parseInt(st.nextToken());
                sw[input] = !sw[input];
                int idx = 1;
                while (input - idx > 0 && input + idx <= N && sw[input - idx] == sw[input + idx]) {
                    sw[input - idx] = !sw[input - idx];
                    sw[input + idx] = !sw[input + idx];
                    idx++;
                }
            }
        }
        for(int i = 1; i <= N; i++) {
            if(sw[i]) System.out.print("1");
            else System.out.print("0");
            if(i % 20 == 0) System.out.println();
            else if(i != N) System.out.print(" ");
        }
    }
}
