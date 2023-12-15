import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_C03_L21_1764 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        HashSet<String> hs = new HashSet<>();
        ArrayList<String> al = new ArrayList<>();
        String input = br.readLine();
        st = new StringTokenizer(input);

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            hs.add(br.readLine());
        }
        for(int j = 0; j < M; j++) {
            String name = br.readLine();
            if(hs.contains(name)) {
                al.add(name);
            }
        }
        al.sort(Comparator.naturalOrder());

        sb.append(al.size()).append("\n");
        for(String output : al) {
            sb.append(output).append("\n");
        }
        System.out.println(sb);
    }
}
