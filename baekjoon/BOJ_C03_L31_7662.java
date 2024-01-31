import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class BOJ_C03_L31_7662 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        TreeMap<Integer, Integer> tm;

        for(int i = 0; i < T; i++) {
            tm = new TreeMap<>();
            int k = Integer.parseInt(br.readLine());
            for(int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                String c = st.nextToken();
                int n = Integer.parseInt(st.nextToken());
                if(c.equals("I")) {
                    tm.put(n, tm.getOrDefault(n, 0) + 1);
                }
                else if(!tm.isEmpty()) {
                    int num = n == 1 ? tm.lastKey() : tm.firstKey();
                    if(tm.put(num, tm.get(num) - 1) == 1) {
                        tm.remove(num);
                    }
                }
            }
            sb.append(tm.isEmpty() ? "EMPTY" : tm.lastKey() + " " + tm.firstKey()).append("\n");
        }
        bw.write(sb + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
