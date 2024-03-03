import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_L24_1283 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] str = new String[N][];
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cnt = st.countTokens();
            str[i] = new String[cnt];
            boolean select = false;
            for(int j = 0; j < cnt; j++) {
                StringBuilder sb = new StringBuilder(st.nextToken());
                char c = Character.toUpperCase(sb.charAt(0));
                if(!select) {
                    if(!hs.contains(c)) {
                        hs.add(c);
                        select = true;
                        sb.insert(0, "[").insert(2, "]");
                    }
                }
                str[i][j] = String.valueOf(sb);
            }
            if(!select) {
                for(int j = 0; j < cnt; j++) {
                    StringBuilder sb = new StringBuilder(str[i][j]);
                    for(int k = 1; k < sb.length(); k++) {
                        char c = Character.toUpperCase(sb.charAt(k));
                        if(!hs.contains(c)) {
                            hs.add(c);
                            select = true;
                            str[i][j] = String.valueOf(sb.insert(k, "[").insert(k+2, "]"));
                            break;
                        }
                    }
                    if(select) break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String[] s1 : str) {
            for(String s2 : s1) {
                sb.append(s2).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
