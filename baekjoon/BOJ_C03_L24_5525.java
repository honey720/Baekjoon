import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_C03_L24_5525 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int answer = 0;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();

        boolean pattern = false;
        boolean flip = false;
        int count = 0;

        for(int i = 0; i < M; i++) {
            if(!pattern) {
                if(S.charAt(i) == 'I') {
                    pattern = true;
                    flip = true;
                }
            }
            else {
                if(S.charAt(i) == 'I') {
                    if(flip) {
                        if(count - (N-1) > 0) {
                            answer += count - (N-1);
                        }
                        count = 0;
                    }
                    else {
                        flip = true;
                        ++count;
                    }
                }
                else {
                    if(flip) {
                        flip = false;
                    }
                    else {
                        pattern = false;
                        if(count - (N-1) > 0) {
                            answer += count - (N-1);
                        }
                        count = 0;
                    }
                }
            }
        }
        if(count - (N-1) > 0) {
            answer += count - (N-1);
        }
        sb.append(answer);
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
