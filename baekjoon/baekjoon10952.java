import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class baekjoon10952 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = null;
        try {
            while((str = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(str, " ");
                int[] output = new int[st.countTokens()];
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                if(a == 0 && b == 0) break;
                System.out.println(a+b);
            }
        } catch (IOException e) {
        }
    }
}