import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        String answer = "I AM IRONMAN!!";
        int score = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());

        String[][] str = new String[P][2];
        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            str[i][0] = st.nextToken();
            str[i][1] = st.nextToken();
        }

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            boolean isFind = false;
            for(int j = 0; j < P; j++) {
                if(str[j][0].equals(input)) {
                    if (str[j][1].equals("W"))
                        score += W;
                    else
                        score = Math.max(score - L, 0);
                    isFind = true;
                    break;
                }
            }
            if (!isFind)
                score = Math.max(score - L, 0);
            if (score >= G) {
                answer = "I AM NOT IRONMAN!!";
                break;
            }
        }
        System.out.print(answer);
        br.close();
    }
}
