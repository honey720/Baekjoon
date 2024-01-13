import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_C03_L24_14940 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = 0, y = 0;

        int[][] answer = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                int input = Integer.parseInt(st.nextToken());
                if(input == 0) {
                    answer[i][j] = 0;
                    visited[i][j] = true;
                }
                else {
                    if(input == 2) {
                        x = i;
                        y = j;
                    }
                    answer[i][j] = -1;
                }
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y, 0});
        while(!queue.isEmpty()) {
            int[] arr = queue.poll();
            if(!visited[arr[0]][arr[1]]) {
                answer[arr[0]][arr[1]] = arr[2];
                visited[arr[0]][arr[1]] = true;
                int[] move = {-1, 0, 1};
                for(int i : move) {
                    for(int j : move) {
                        int a = arr[0] + i;
                        int b = arr[1] + j;
                        if((a >= 0 && a < n) && (b >= 0 && b < m) && (i == 0 || j == 0) && !visited[a][b]) {
                            queue.offer(new int[]{a, b, arr[2]+1});
                        }
                    }
                }
            }
        }

        for(int [] i: answer) {
            for(int j: i) {
                sb.append(j).append(" ");
            }
            sb.append("\n");
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
