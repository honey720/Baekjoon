import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_C04_L31_1753 {
    static ArrayList[] Al;
    static int[] dist;
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(br.readLine()) - 1;

        Al = new ArrayList[v];
        dist = new int[v];

        for (int i = 0; i < v; i++) {
            Al[i] = new ArrayList<Node>();
            dist[i] = Integer.MAX_VALUE;
        }

        for(int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int c = Integer.parseInt(st.nextToken());
            Al[a].add(new Node(b,c));
        }

        dijkstra(start);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < v; i++) {
            if (dist[i] == Integer.MAX_VALUE) sb.append("INF").append("\n");
            else sb.append(dist[i]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }

    public static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[start] = 0;
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            int len = Al[now.v].size();
            for(int i = 0; i < len; i++) {
                Node next = (Node) Al[now.v].get(i);

                if (dist[next.v] > now.w + next.w) {
                    dist[next.v] = now.w + next.w;
                    pq.offer(new Node(next.v, now.w + next.w));
                }
            }
        }
    }
}
class Node implements Comparable<Node> {
    int v, w;
    public Node(int v, int w) {
        this.v = v;
        this.w = w;
    }
    @Override
    public int compareTo(Node n) {
        return this.w - n.w;
    }
}
