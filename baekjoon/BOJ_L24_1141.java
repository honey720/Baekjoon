import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class BOJ_L24_1141 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        for(int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }
        Arrays.sort(str, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s2.length(), s1.length());
            }
        });
        HashSet<String> hs = new HashSet<>();
        for(String s1 : str) {
            boolean chk = true;
            for(String s2: hs) {
                if(s2.indexOf(s1) == 0) {
                    chk = false;
                    break;
                }
            }
            if(chk) hs.add(s1);
        }
        System.out.println(hs.size());
        br.close();
    }
}
