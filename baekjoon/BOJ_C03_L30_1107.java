import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_C03_L30_1107 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] ban = new boolean[10];
        int input = Integer.parseInt(br.readLine());
        int answer = Math.abs(input - 100);
        int N = Integer.parseInt(br.readLine());
        if(N == 0) {
            answer = Math.min(answer, String.valueOf(input).length());
        }
        else {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < N; i++) {
                ban[Integer.parseInt(st.nextToken())] = true;
            }
            String near;
            boolean error;
            for(int i = 0; i < 900000; i++) {
                error = false;
                near = String.valueOf(i);
                for(int j = 0; j < near.length(); j++) {
                    if(ban[Integer.parseInt(String.valueOf(near.charAt(j)))]) {
                        error = true;
                        break;
                    }
                }
                if(!error) {
                    int res =  Math.abs(Math.abs(input - Integer.parseInt(near)) + near.length());
                    answer = Math.min(answer, res);
                }
            }
        }

        bw.write(answer+"\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
