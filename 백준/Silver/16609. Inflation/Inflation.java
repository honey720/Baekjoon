import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double result = 1;

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> al = new ArrayList<>();
        while (st.hasMoreTokens())
            al.add(Integer.parseInt(st.nextToken()));
        al.sort(Comparator.naturalOrder());

        for(int i = n; i >= 1; i--) {
            if(al.get(i - 1) > i) {
                System.out.println("impossible");
                return;
            }
            result = Math.min(result, (double) al.get(i-1)/i);
            al.remove(i - 1);
        }
        if(result == 0) {
            System.out.println("0");
        }
        System.out.println(result);
        br.close();
    }
}
