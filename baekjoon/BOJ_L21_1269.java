import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_L21_1269 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++) {
            set.add(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < b; i++) {
            String input = st.nextToken();
            if(set.contains(input)) set.remove(input);
            else set.add(input);
        }
        System.out.println(set.size());
    }
}
