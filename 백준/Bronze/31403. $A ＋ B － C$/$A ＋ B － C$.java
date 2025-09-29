import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        br.close();
        
        int output1 = A + B - C;
        int output2 = A * (int) Math.pow(10, String.valueOf(B).length()) + B - C;
        System.out.print(output1 + "\n" + output2);
    }
}