import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_C03_L23_11724 {

    static int vertex;
    static boolean[] visited;
    static boolean[][] link;

    static int answer = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        vertex = Integer.parseInt(st.nextToken());
        visited = new boolean[vertex];
        link = new boolean[vertex][vertex];
        int edge = Integer.parseInt(st.nextToken());

        for(int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            link[a][b] = link[b][a] = true;
        }

        for(int i = 0; i < vertex; i++) {
            find(i);
        }

        System.out.println(answer);
        br.close();
    }

    public static void find(int n) {
        if(!visited[n]) {
            answer++;
            visited[n] = true;
            for(int i = 0; i < vertex; i++) {
                if(link[n][i]) {
                    link(i);
                }
            }
        }
    }

    public static void link(int n) {
        if(!visited[n]) {
            visited[n] = true;
            for(int i = 0; i < vertex; i++) {
                if(link[n][i]) {
                    link(i);
                }
            }
        }
    }
}
