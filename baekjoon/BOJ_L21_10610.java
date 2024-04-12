import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_L21_10610 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        boolean isZero = false;

        int[] arr = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') isZero = true;
            sum += (s.charAt(i) - 48);
            arr[i] = (s.charAt(i) - 48);
        }
        if(isZero && sum % 3 == 0) {
            Arrays.sort(arr);
            for(int i = s.length() - 1; i >= 0; i--) {
                sb.append(arr[i]);
            }
            System.out.println(sb);
        }
        else {
            System.out.println("-1");
        }
    }
}
