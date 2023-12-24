import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_C03_L22_9375 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        HashMap<String, Integer> hm;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int answer = 1;
            hm = new HashMap<>();
            int input = Integer.parseInt(br.readLine());

            for (int j = 0; j < input; j++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String type = st.nextToken();
                if (!hm.containsKey(type)) {
                    hm.put(type, 1);
                } else {
                    int num = hm.get(type);
                    hm.put(type, num + 1);
                }
            }

            for(int j : hm.values()) {
                answer *= j + 1;
            }
            sb.append(answer - 1).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
