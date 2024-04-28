import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_L22_11478 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        HashSet<String> hs = new HashSet<>();
        for(int i = 1; i <= s.length(); i++) {
            for(int j = 0; j <= s.length() - i; j++) {
                hs.add(s.substring(j, j+i));
            }
        }
        System.out.println(hs.size());
        br.close();
    }
}
