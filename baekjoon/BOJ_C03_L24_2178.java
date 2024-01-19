import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_C03_L24_2178 {

    public static void main(String[] args) throws Exception{
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] map = new char[N+1][M+1];
        boolean[][] visited = new boolean[N+1][M+1];

        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            for(int j = 0; j < M; j++) {
                map[i+1][j+1] = input.charAt(j);
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{1, 1, 1});
        int[][] range = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int x;
        int y;
        boolean found;
        do {
            found = false;
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                int[] o = queue.poll();
                if (o[0] == N && o[1] == M) {
                    answer = o[2];
                    found = true;
                }
                else {
                    for (int[] r : range) {
                        x = o[0] + r[0];
                        y = o[1] + r[1];
                        if ((x > 0 && x <= N) && (y > 0 && y <= M) && !visited[x][y] && map[x][y] != '0') {
                            queue.offer(new int[]{x, y, o[2] + 1});
                            visited[x][y] = true;
                        }
                    }
                }
            }
        } while (!found);
        System.out.println(answer);
    }
}
