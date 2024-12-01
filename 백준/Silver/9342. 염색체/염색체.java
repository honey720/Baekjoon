import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer. parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String input = br.readLine();
            String result = "Good";
            int count = 0;
            int length = input.length();

            if(input.charAt(count) >= 'A' && input.charAt(count) <= 'Z') {
                if(input.charAt(count) >= 'B' && input.charAt(count) <= 'F')
                    count++;
                else if (input.charAt(count) != 'A') {
                    System.out.println(result);
                    continue;
                }
            }

            while (count < length && input.charAt(count) == 'A')
                count++;
            while (count < length && input.charAt(count) == 'F')
                count++;
            while (count < length && input.charAt(count) == 'C')
                count++;

            if(count == length) {
                result = "Infected!";
            }

            System.out.println(result);
        }
        br.close();
    }
}
