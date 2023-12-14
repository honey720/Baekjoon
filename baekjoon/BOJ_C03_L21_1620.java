import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_C03_L21_1620 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Map<String, Integer> pokedex = new HashMap<>();
        ArrayList<String> index = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        index.add("");
        for(int i = 1; i <= N; i++) {
            String input = br.readLine();
            pokedex.put(input, i);
            index.add(input);
        }
        for(int j = 0; j < M; j++) {
            String input = br.readLine();
            if(pokedex.containsKey(input)) {
                bw.write(pokedex.get(input) + "\n");
            }
            else {
                bw.write(index.get(Integer.parseInt(input)) + "\n");
            }
        }
        br.close();
        bw.close();
    }
}
