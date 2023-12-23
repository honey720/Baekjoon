import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_C03_L22_9095 {
    static int answer;
    static int input;
    static int[] numbers = {1, 2, 3};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            answer = 0;
            input = Integer.parseInt(br.readLine());
            for(int number : numbers) {
                dfs(number);
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
    public static void dfs(int number) {
        if (number == input) {
            answer++;
        }
        else if (number < input) {
            for(int num: numbers) {
                dfs(number + num);
            }
        }
    }
}
