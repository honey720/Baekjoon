import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_L21_1065 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i = 1; i <= N; i++) {
            if(i < 100) ans++;
            else {
                ans++;
                String s = String.valueOf(i);
                int diff = s.charAt(1) - s.charAt(0);
                char prev = s.charAt(0);
                for(int j = 1; j < s.length(); j++) {
                    if(s.charAt(j) - prev != diff) {
                        ans--;
                        break;
                    }
                    prev = s.charAt(j);
                }
            }
        }
        System.out.println(ans);
    }
}
