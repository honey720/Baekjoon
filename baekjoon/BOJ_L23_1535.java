import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L23_1535 {

    static int N;
    static int[] heart;
    static int[] pleasure;
    static int answer = 0;
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());


        heart = new int[N + 1];
        pleasure = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            heart[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            pleasure[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= N; i++) {
            find_max(100, 0, i, 1);
        }
        System.out.println(answer);
    }

    public static void find_max(int current_heart, int current_pleasure, int count, int now) {
        if (count > 0 && now <= N) {
            find_max(current_heart - heart[now], current_pleasure + pleasure[now], count - 1, now + 1);
            find_max(current_heart, current_pleasure, count, now + 1);
        }
        if (current_heart > 0 && current_pleasure > answer) {
            answer = current_pleasure;
        }
    }
}
