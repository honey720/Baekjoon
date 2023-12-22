import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_C03_L22_2606 {
    static int answer = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int links = Integer.parseInt(br.readLine());
        boolean[] visit = new boolean[N + 1];

        for (int i = 1; i <= links; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            link(hm, a, b);
            link(hm, b, a);
        }

        visit[1] = true;

        if(hm.containsKey(1)) {
            for (int i : hm.get(1)) {
                list(hm, visit, i);
            }
        }
        System.out.print(answer);
    }

    public static void link(HashMap<Integer, ArrayList<Integer>> hm, int a, int b) {
        ArrayList<Integer> link = new ArrayList<>();
        if (!hm.containsKey(a)) {
            link.add(b);
            hm.put(a, link);
        } else if (!hm.get(a).contains(b)) {
            link = hm.get(a);
            link.add(b);
            hm.put(a, link);
        }
    }

    public static void list(HashMap<Integer, ArrayList<Integer>> hm, boolean[] visit, int target) {
        if (!visit[target]) {
            visit[target] = true;
            answer++;
            for (int i : hm.get(target)) {
                list(hm, visit, i);
            }
        }
    }
}
