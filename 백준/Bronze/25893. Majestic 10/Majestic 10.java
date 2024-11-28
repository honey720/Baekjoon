import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String input = br.readLine();
            st = new StringTokenizer(input);
            int count = 0;
            while (st.hasMoreTokens()) {
                if (Integer.parseInt(st.nextToken()) >= 10) count++;
            }
            bw.write(input + "\n");
            if (count == 1) bw.write("double\n\n");
            else if (count == 2) bw.write("double-double\n\n");
            else if (count == 3) bw.write("triple-double\n\n");
            else bw.write("zilch\n\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
