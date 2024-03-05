import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_L24_1325 {
    static class Link {
        int num;
        ArrayList<Link> map;

        public Link(int n) {
            this.num = n;
            this.map = new ArrayList<>();
        }
    }
    static int N, M, max = 0;
    static Link[] link;
    static boolean[] visit;
    static int[] cnt;
    public static void main(String []args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        cnt = new int[N+1];
        visit = new boolean[N+1];
        link = new Link[N+1];
        for(int i = 1; i <= N; i++) link[i] = new Link(i);
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            link[b].map.add(link[a]);
        }
        for(int i = 1; i <= N; i++) {
            visit = new boolean[N+1];
            visit[i] = true;
            DFS(i, i);
        }
        for(int i: cnt) max = Math.max(max, i);
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++) {
            if(cnt[i] == max) sb.append(i).append(" ");
        }
        System.out.println(sb);
    }

    static void DFS(int s, int n) {
        for(Link l : link[n].map) {
            if(!visit[l.num]) {
                visit[l.num] = true;
                DFS(s, l.num);
                cnt[s]++;
            }
        }
    }
}
