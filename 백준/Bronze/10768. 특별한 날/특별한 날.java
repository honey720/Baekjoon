import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        if (M < 2) {
            System.out.print("Before");
        }
        else if (M > 2) {
            System.out.print("After");
        }
        else {
            if (D < 18) {
                System.out.print("Before");
            }
            else if (D > 18) {
                System.out.print("After");
            }
            else System.out.print("Special");
        }
    }
}