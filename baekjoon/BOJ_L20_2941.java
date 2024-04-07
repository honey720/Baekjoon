import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_L20_2941 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int ans = 0;
        int cnt = 0;
        while (cnt < input.length()) {
            switch (input.charAt(cnt)) {
                case 'c' : {
                    //c=, c-
                    if(input.startsWith("=",cnt + 1) || input.startsWith("-",cnt + 1)) cnt++;
                }
                break;
                case 'd' : {
                    //dz=, d-
                    if(input.startsWith("z=", cnt + 1)) cnt += 2;
                    else if(input.startsWith("-",cnt + 1)) cnt++;
                }
                break;
                case 'n' :
                case 'l' : {
                    //lj, mj
                    if(input.startsWith("j", cnt + 1)) cnt++;
                }
                break;
                case 's' :
                case 'z' : {
                    //s=, z=
                    if(input.startsWith("=", cnt + 1)) cnt++;
                }
                break;
            }
            ans++;
            cnt++;
        }
        System.out.println(ans);
    }
}
