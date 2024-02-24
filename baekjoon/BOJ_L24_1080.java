import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L24_1080 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ans = 0;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[][] A = new boolean[N][M], B = new boolean[N][M];
        for(int i = 0; i < N; i++) {
            char[] input = br.readLine().toCharArray();
            for(int j = 0; j < M; j++) {
                A[i][j] = input[j] == '1';
            }
        }for(int i = 0; i < N; i++) {
            char[] input = br.readLine().toCharArray();
            for(int j = 0; j < M; j++) {
                B[i][j] = input[j] == '1';
            }
        }for(int i = 0; i < N-2; i++) {
            for(int j = 0; j < M-2; j++) {
                if(A[i][j] != B[i][j]) {
                    ans++;
                    for(int a = i; a <= i+2; a++) {
                        for(int b = j; b <= j+2; b++) {
                            A[a][b] = !A[a][b];
                        }
                    }
                }
            }
        }for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if (A[i][j] != B[i][j]) {
                    ans = -1;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
