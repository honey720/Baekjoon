import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_C03_L21_11047 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> al = new ArrayList<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;

        for(int i = 0; i < N; i++) {
            al.add(Integer.parseInt(br.readLine()));
        }
        al.sort(Comparator.reverseOrder());

        int count = 0;
        while(true) {
            if(M - al.get(count) > 0) {
                M -= al.get(count);
                answer++;
            }
            else if (M - al.get(count) == 0) {
                answer++;
                break;
            }
            else {
                count++;
            }
        }
        System.out.print(answer);
    }
}
