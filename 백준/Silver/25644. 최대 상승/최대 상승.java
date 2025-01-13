import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");

        int min = Integer.parseInt(strArr[0]);
        for (int i = 1; i < n; i++) {
            int now = Integer.parseInt(strArr[i]);
            if (now < min)
                min = now;
            else
                answer = Math.max(answer, now - min);
        }
        System.out.print(answer);
        br.close();
    }
}
