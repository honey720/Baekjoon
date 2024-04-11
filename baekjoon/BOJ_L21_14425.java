import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_L21_14425 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> hs = new HashSet<>();
        int ans = 0;
        for(int i = 0; i < N; i++) {
            hs.add(br.readLine());
        }
        for(int i = 0; i < M; i++) {
            if(hs.contains(br.readLine())) ans++;
        }
        System.out.println(ans);
    }
}
