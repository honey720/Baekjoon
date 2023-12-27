import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_C00_L20_9655 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N % 2 == 0) {
            System.out.print("CY");
        }
        else {
            System.out.print("SK");
        }

        br.close();
    }
}
