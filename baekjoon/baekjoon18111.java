import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon18111 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;
        int answerTime = 999999;
        int max = 0;
        int min = 256;
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int blocks = Integer.parseInt(st.nextToken());
        int[][] field = new int[x][y];

        for(int i = 0; i < x; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < y; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());
                if(field[i][j] > max) {
                    max = field[i][j];
                }
                if(field[i][j] < min) {
                    min = field[i][j];
                }
            }
        }
        for(int target = max; target >= min; target--) {
            int targetTime = 0;
            int need = blocks;
            for(int i = 0; i < x; i++) {
                for(int j = 0; j < y; j++) {
                    if(field[i][j] > target) {
                        need += field[i][j] - target;
                        targetTime += 2 * (field[i][j] - target);
                    }
                    if(field[i][j] < target) {
                        need -= target - field[i][j];
                        targetTime += (target - field[i][j]);
                    }
                }
            }

            if(need >= 0){
                if(answerTime > targetTime) {
                    answer = target;
                    answerTime = targetTime;
                }
            }
        }
        System.out.println(answer + " " + answerTime);

    }
}
