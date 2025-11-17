import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        char[] arr = input.toCharArray();
        boolean isWeight = false;
        boolean isEven = false;
        int sum = 0;

        for (char c : arr) {
            if (c == '*')
                isWeight = isEven;
            else {
                int digit = c - '0';
                sum += isEven ? digit * 3 : digit;
            }
            isEven = !isEven;
        }

        for (int i = 0; i < 10; i++) {
            int missing = i;
            if (isWeight) {
                missing *= 3;
            }
            int output = (sum + missing) % 10;
            if (output == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}