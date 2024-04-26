import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L21_1120 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        int ans = B.length();
        for(int i = 0; i <= B.length() - A.length(); i++) {
            int tmp = 0;
            for(int j = 0; j < A.length(); j++) {
                if(A.charAt(j) != B.charAt(j+i)) tmp++;
            }
            if(ans > tmp) ans = tmp;
        }
        System.out.println(ans);
    }
}
