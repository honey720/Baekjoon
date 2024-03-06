import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_L24_1342 {
    static int ans = 0;
    static char[] input, alpha = new char[26];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine().toCharArray();
        for (char c : input) {
            alpha[c-97]++;
        }
        DFS(' ', 0);
        System.out.println(ans);
    }
    public static void DFS(char prev, int idx) {
        if(idx == input.length) {
            ans++;
            return;
        }
        for(char c = 'a'; c <= 'z'; c++) {
            if(c != prev && alpha[c-97] > 0) {
                alpha[c-97]--;
                DFS(c, idx + 1);
                alpha[c-97]++;
            }
        }
    }
}
