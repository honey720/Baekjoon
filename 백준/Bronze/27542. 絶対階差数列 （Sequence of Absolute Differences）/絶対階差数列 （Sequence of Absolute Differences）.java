import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Long> al = new ArrayList<>();
        while (st.hasMoreTokens())
            al.add(Long.parseLong(st.nextToken()));

        for(int i = 1; i < N; i++) {
            for(int j = 0; j < al.size() - 1; j++) {
                al.set(j, Math.abs(al.get(j) - al.get(j + 1)));
            }
            al.remove(al.size() - 1);
        }
        System.out.println(al.get(0));
        br.close();
    }
}
