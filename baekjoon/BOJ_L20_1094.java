import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_L20_1094 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        int comp = 64;
        int X = Integer.parseInt(br.readLine());
        while (X != 0) {
            if(X >= comp) {
                X -= comp;
                answer++;
            }
            comp /= 2;
        }
        bw.write(answer + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
