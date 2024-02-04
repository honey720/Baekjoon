import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_L20_1316 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            boolean[] visited = new boolean[26];
            int prev = -1;
            for(int j = 0; j < input.length(); j++) {
                int idx = input.charAt(j) - 97;
                if(visited[idx] && idx != prev) {
                    break;
                }
                if(j == input.length() - 1) {
                    ++answer;
                }
                visited[idx] = true;
                prev = idx;
            }
        }
        System.out.println(answer);
    }
}
