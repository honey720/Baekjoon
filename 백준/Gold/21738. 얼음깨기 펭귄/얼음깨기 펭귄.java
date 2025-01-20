import com.sun.source.tree.Tree;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 얼음 블록의 개수
        int S = Integer.parseInt(st.nextToken()); // 지지대 얼음 블록의 개수
        int P = Integer.parseInt(st.nextToken()); // 펭귄이 위치한 얼음 블록의 번호

        TreeMap<Integer, TreeSet<Integer>> tm = new TreeMap<>();
        TreeSet<Integer> visit = new TreeSet<>();
        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            TreeSet<Integer> as;
            TreeSet<Integer> bs;
            if (tm.containsKey(a)) as = tm.get(a);
            else as = new TreeSet<>();
            as.add(b);
            tm.put(a, as);

            if (tm.containsKey(b)) bs = tm.get(b);
            else bs = new TreeSet<>();
            bs.add(a);
            tm.put(b, bs);
        }

        int ans = 0;
        int goal = 0;
        int cnt;
        int d = 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer(P);
        visit.add(P);
        do {
            d++;
            cnt = q.size();
            for (int i = 0; i < cnt; i++) {
                int now = q.poll();
                TreeSet<Integer> ns = tm.get(now);
                for (int j: ns) {
                    if (ns.contains(j) && !visit.contains(j)) {
                        if (j <= S && goal < 2) {
                            goal++;
                            ans += d;
                        }
                        q.offer(j);
                        visit.add(j);
                    }
                }
            }
        } while (goal < 2);
        System.out.println(N - (ans + 1));
        br.close();
    }
}
