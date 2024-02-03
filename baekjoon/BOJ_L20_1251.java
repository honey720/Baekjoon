import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_L20_1251 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        String s = br.readLine();
        String answer = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        for(int i = 1; i < s.length() - 1; i++) {
            for(int j = i + 1; j < s.length(); j++) {
                String w1, w2, w3, res;
                sb = new StringBuilder(s.substring(0, i));
                w1 = sb.reverse().toString();
                sb = new StringBuilder(s.substring(i, j));
                w2 = sb.reverse().toString();
                sb = new StringBuilder(s.substring(j));
                w3 = sb.reverse().toString();
                res = w1 + w2 + w3;
                answer = answer.compareTo(res) > 0 ? res : answer;
            }
        }
        System.out.println(answer);
    }
}
