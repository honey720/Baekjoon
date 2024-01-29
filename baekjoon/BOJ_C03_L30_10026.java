import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_C03_L30_10026 {

    static int N;
    static char[][] paint;
    static boolean[][] blind;
    static boolean[][] visited;
    static int[][] range = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;
        N = Integer.parseInt(br.readLine());

        paint = new char[N][N];
        blind = new boolean[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            for(int j = 0; j < input.length(); j++) {
                paint[i][j] = input.charAt(j);
                if(paint[i][j] != 'B') {
                    blind[i][j] = true;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!visited[i][j]) {
                    ++answer;
                    find(i, j, paint[i][j]);
                }
            }
        }
        sb.append(answer).append(" ");
        answer = 0;
        visited = new boolean[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!visited[i][j]) {
                    ++answer;
                    findBlind(i, j, paint[i][j]);
                }
            }
        }
        sb.append(answer);
        bw.write(sb + "");
        br.close();
        bw.flush();
        bw.close();

    }

    public static void find(int x, int y, char color) {
        visited[x][y] = true;
        for(int[] r : range) {
            int i = x + r[0];
            int j = y + r[1];
            if((i >= 0 && i < N) && (j >= 0 && j < N) && !visited[i][j] ) {
                if(color == paint[i][j]){
                    find(i, j, color);
                }
            }
        }
    }

    public static void findBlind(int x, int y, char color) {
        visited[x][y] = true;
        for(int[] r : range) {
            int i = x + r[0];
            int j = y + r[1];
            if((i >= 0 && i < N) && (j >= 0 && j < N) && !visited[i][j] ) {
                if(color == 'B' && !blind[i][j]) {
                    findBlind(i, j, color);
                }
                else if(color != 'B' && blind[i][j]){
                    findBlind(i, j, color);
                }
            }
        }
    }
}
