import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int sum = 0;
        int cnt = 0;
        while (input.length() != 1) {
            sum = 0;
            cnt++;
            for (int i = 0; i < input.length(); i++)
                sum += Integer.parseInt(String.valueOf(input.charAt(i)));
            input = String.valueOf(sum);
        }
        sum = Integer.parseInt(input);
        String answer = sum % 3 == 0 ? "YES" : "NO";
        System.out.println(cnt);
        System.out.println(answer);
        br.close();
    }
}
