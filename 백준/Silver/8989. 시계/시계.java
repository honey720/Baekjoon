import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                String temp = input[j];
                String original = temp;
                int hour = Integer.parseInt(temp.substring(0, 2));
                hour = hour >= 12 ? hour - 12: hour;
                int minute = Integer.parseInt(temp.substring(3));

                double d = Math.abs((hour * 30 + minute * 0.5) - (minute * 6));
                d = d >= 180 ? 360 - d: d;
                temp = String.format("%05.1f", d) + original;
                input[j] = temp;
            }

            Arrays.sort(input);
            bw.write(input[2].substring(5) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
