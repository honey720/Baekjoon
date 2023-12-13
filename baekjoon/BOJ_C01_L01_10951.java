import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_C01_L01_10951 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = null;
        try {
            while((str = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(str, " ");
                int[] output = new int[st.countTokens()];
                while(st.hasMoreTokens()) {
                    int a = Integer.parseInt(st.nextToken());
                    int b = Integer.parseInt(st.nextToken());
                    System.out.println(a+b);
                }
            }
        } catch (IOException e) {
        }
    }
}