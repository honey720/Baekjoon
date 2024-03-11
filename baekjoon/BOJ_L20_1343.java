import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_L20_1343 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'X') cnt++;
            else {
                while (cnt != 0) {
                    if(cnt >= 4) {
                        sb.append("AAAA");
                        cnt -= 4;
                    }
                    else if(cnt >= 2) {
                        sb.append("BB");
                        cnt -= 2;
                    }
                    else {
                        System.out.println("-1");
                        return;
                    }
                }
                sb.append(".");
            }
        }
        while (cnt != 0) {
            if(cnt >= 4) {
                sb.append("AAAA");
                cnt -= 4;
            }
            else if(cnt >= 2) {
                sb.append("BB");
                cnt -= 2;
            }
            else {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(sb);
    }
}
