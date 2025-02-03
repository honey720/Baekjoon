
import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int B = Integer.parseInt(st.nextToken());
            String D = st.nextToken();

            long sum = 0;
            for (char c: D.toCharArray()) {
                sum += c - '0';
            }
            sb.append(sum % (B - 1)).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
