import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_C02_L20_11651 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> li_y = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            st = new StringTokenizer(input);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(!hm.containsKey(y)) {
                hm.put(y, new ArrayList<>());
                hm.get(y).add(x);
                li_y.add(y);
            }
            else {
                hm.get(y).add(x);
            }
        }
        li_y.sort(Comparator.naturalOrder());
        for(int j = 0; j < li_y.size(); j++) {
            ArrayList<Integer> li_x = hm.get(li_y.get(j));
            li_x.sort(Comparator.naturalOrder());
            for(int k = 0; k < li_x.size(); k++) {
                System.out.println(li_x.get(k) + " " + li_y.get(j));
            }
        }
    }
}
