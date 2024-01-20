import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;

public class BOJ_C03_L24_2667 {

    static int N;
    static boolean[][] map;
    static int houses;
    static ArrayList<Integer> hl = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;
        N = Integer.parseInt(br.readLine());
        map = new boolean[N][N];

        String input;
        for(int i = 0; i < N; i++) {
            input = br.readLine();
            for(int j = 0; j < N; j++) {
                if(input.charAt(j) == '1') {
                    map[i][j] = true;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(map[i][j]) {
                    ++answer;
                    houses = 0;
                    find(i, j);
                    hl.add(houses);
                }
            }
        }

        hl.sort(Comparator.naturalOrder());
        sb.append(answer).append("\n");
        for(int i : hl) {
            sb.append(i).append("\n");
        }

        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }

    public static void find(int x, int y) {
        ++houses;
        map[x][y] = false;
        for(int[] r : new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}) {
            int i = x + r[0];
            int j = y + r[1];
            if((i >= 0 && i < N) && (j >= 0 && j < N) && map[i][j]) {
                find(i, j);
            }
        }
    }
}
