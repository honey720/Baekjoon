import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_C03_L23_21736 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int answer = 0;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] campus = new char[N][M];
        Queue<int[]> queue = new LinkedList<>();

        String input;
        for(int i = 0; i < N; i++) {
            input = br.readLine();
            for(int j = 0; j < M; j++) {
                campus[i][j] = input.charAt(j);
                if(input.charAt(j) == 'I') {
                    queue.offer(new int[]{i, j});
                    campus[i][j] = 'X';
                }
            }
        }

        int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int[] now;
        int next_X;
        int next_Y;
        while (!queue.isEmpty()) {
            now = queue.poll();
            for(int[] dir: direction) {
                next_X = now[0] + dir[0];
                next_Y = now[1] + dir[1];
                if((next_X >= 0 && next_X < N) && (next_Y >= 0 && next_Y < M)) {
                    if(campus[next_X][next_Y] == 'P') {
                        ++answer;
                    }
                    else if(campus[next_X][next_Y] == 'X') {
                        continue;
                    }
                    queue.offer(new int[]{next_X, next_Y});
                    campus[next_X][next_Y] = 'X';
                }
            }
        }

        sb.append((answer == 0 ? "TT": answer));
        bw.write(String.valueOf(sb));

        br.close();
        bw.flush();
        bw.close();
    }
}
