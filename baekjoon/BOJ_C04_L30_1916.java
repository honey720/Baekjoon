import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_C04_L30_1916 {

    static List<ArrayList<Node>> list;
    static int[] answer;
    static int N;
    static class Node implements Comparable<Node> {
        int nodeNum;
        int weight;
        public Node(int nodeNum, int weight) {
            this.nodeNum = nodeNum;
            this.weight = weight;
        }
        @Override
        public int compareTo(Node o) {
            return weight - o.weight;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        list = new ArrayList<>();
        answer = new int[N+1];
        Arrays.fill(answer, 999_999_999);

        for(int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list.get(from).add(new Node(to, cost));
        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        System.out.println(find(start, end));
    }

    public static int find(int start, int end) {
        PriorityQueue<Node> queue = new PriorityQueue<>();
        boolean[] visited = new boolean[N+1];

        answer[start] = 0;
        queue.offer(new Node(start, 0));

        while (!queue.isEmpty()) {
            Node queueNode = queue.poll();
            int start_nodeNum = queueNode.nodeNum;
            if(!visited[start_nodeNum]) {
                visited[start_nodeNum] = true;
                for(Node node : list.get(start_nodeNum)) {
                    if(!visited[node.nodeNum] && answer[node.nodeNum] > (answer[start_nodeNum] + node.weight)) {
                        answer[node.nodeNum] = answer[start_nodeNum] + node.weight;
                        queue.offer(new Node(node.nodeNum, answer[node.nodeNum]));
                    }
                }
            }
        }
        return answer[end];
    }
}
