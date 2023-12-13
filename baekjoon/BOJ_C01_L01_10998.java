import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_C01_L01_10998 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = null;
        try {
            while((str = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(str, " ");
                int[] output = new int[st.countTokens()];

                int index = 0;
                while(st.hasMoreTokens()) {
                    output[index] = Integer.parseInt(st.nextToken());
                    ++index;
                }
                int result = 1;
                for(int i: output)
                    result *= i;

                System.out.println(result);
            }
        } catch (IOException e) {
        }
    }
}