import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        TreeSet<String> ts = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            ts.add(br.readLine());
        }

        int answer = 0;
        for (int i = 0; i < M; i++) {
            String input = br.readLine();

            String ceiling = ts.ceiling(input);
            if (ceiling != null && ceiling.startsWith(input))
                answer++;
        }

        System.out.println(answer);
        br.close();
    }
}
