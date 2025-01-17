import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashMap<String, String> hm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String input = br.readLine();

            if (input.length() > 2) {
                char first = input.charAt(0);
                char last = input.charAt(input.length() - 1);
                String mid = input.substring(1, input.length() - 1);
                char[] midc = mid.toCharArray();
                Arrays.sort(midc);
                String mids = new String(midc);

                String flm = first + "" + last + mids;

                hm.put(flm, input);
            }
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            String input = st.nextToken();

            if (input.length() <= 2) {
                bw.write(input + " ");
            }
            else {
                char first = input.charAt(0);
                char last = input.charAt(input.length() - 1);
                String mid = input.substring(1, input.length() - 1);
                char[] midc = mid.toCharArray();
                Arrays.sort(midc);
                String mids = new String(midc);

                String flm = first + "" + last + mids;

                bw.write(hm.get(flm) + " ");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
