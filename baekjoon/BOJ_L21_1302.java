import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class BOJ_L21_1302 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            if(!hm.containsKey(s)) hm.put(s, 1);
            else hm.put(s, hm.get(s) + 1);
        }
        int max = 0;
        ArrayList<String> al = new ArrayList<>();
        for(String s : hm.keySet()) {
            if(hm.get(s) > max) {
                max = hm.get(s);
                al = new ArrayList<>();
                al.add(s);
            }
            else if(hm.get(s) == max) {
                al.add(s);
            }
        }
        al.sort(Comparator.naturalOrder());
        System.out.println(al.get(0));
    }
}
