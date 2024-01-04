import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class BOJ_C03_L23_1260 {

    static ArrayList<Integer> dfs_result = new ArrayList<>();
    static ArrayList<Integer> bfs_result = new ArrayList<>();
    static Queue<Integer> bfs_queue = new LinkedList<>();
    static HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        for(int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            ArrayList<Integer> tmp;

            if(!map.containsKey(a)) {
                tmp = new ArrayList<>();
                tmp.add(b);
                map.put(a, tmp);
            }
            else {
                tmp = map.get(a);
                tmp.add(b);
                tmp.sort(Comparator.naturalOrder());
                map.put(a, tmp);
            }

            if(!map.containsKey(b)) {
                tmp = new ArrayList<>();
                tmp.add(a);
                map.put(b, tmp);
            }
            else {
                tmp = map.get(b);
                tmp.add(a);
                tmp.sort(Comparator.naturalOrder());
                map.put(b, tmp);
            }
        }

        boolean[] visited = new boolean[vertex + 1];
        DFS(map, visited, start);
        visited = new boolean[vertex + 1];
        BFS(map, visited, start);

        for(int i : dfs_result) {
            sb.append(i).append(" ");
        }
        sb.append("\n");
        for(int i : bfs_result) {
            sb.append(i).append(" ");
        }
        sb.append("\n");

        bw.write(sb + " ");
        br.close();
        bw.flush();
        bw.close();

    }

    static void DFS(HashMap<Integer, ArrayList<Integer>> map, boolean[] visited, int now) {
        if(!map.containsKey(now)) {
            dfs_result.add(now);
        }
        else if (!visited[now]) {
            visited[now] = true;
            dfs_result.add(now);
            for(int i : map.get(now)) {
                DFS(map, visited, i);
            }
        }
    }
    static void BFS(HashMap<Integer, ArrayList<Integer>> map, boolean[] visited, int now) {
        if(!map.containsKey(now)) {
            bfs_result.add(now);
        }
        else if(!visited[now]) {
            int count = 0;
            visited[now] = true;
            bfs_result.add(now);
            for(int i : map.get(now)) {
                if(!bfs_queue.contains(i)) {
                    bfs_queue.offer(i);
                    count++;
                }
            }
            for(int j = 0; j < count; j++) {
                if(!bfs_queue.isEmpty())
                    BFS(map, visited, bfs_queue.poll());
            }
        }
    }
}
