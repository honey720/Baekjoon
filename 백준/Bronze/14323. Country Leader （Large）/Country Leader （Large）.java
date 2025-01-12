import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        boolean[] alphabet;

        for(int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            int max = 0;
            ArrayList<String> leader = new ArrayList<>();
            for(int j = 0; j < N; j++) {
                int cnt = 0;
                alphabet = new boolean[26];
                String input = br.readLine();
                for(int k = 0; k < input.length(); k++) {
                    int in = input.charAt(k);
                    if (in == ' ') {
                        continue;
                    }
                    if (!alphabet[in - 'A']) {
                        alphabet[in - 'A'] = true;
                        cnt++;
                    }
                }
                if (max == cnt) {
                    max = cnt;
                    leader.add(input);
                }
                else if (max < cnt) {
                    max = cnt;
                    leader = new ArrayList<>();
                    leader .add(input);
                }
                leader.sort(Comparator.naturalOrder());
            }
            System.out.println("Case #" + i + ": " + leader.get(0));
        }
        br.close();
    }
}
