import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_L22_1021 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i <= N; i++) {
            al.add(i);
        }
        int ans = 0;
        st = new StringTokenizer(br.readLine());
        int[] fromTo = new int[2];
        int from, to;
        from = 1;
        for(int i = 0; i < M; i++) {
            fromTo[0] = from;
            to = al.indexOf(Integer.parseInt(st.nextToken()));
            fromTo[1] = to;
            Arrays.sort(fromTo);
            ans += Math.min(fromTo[1] - fromTo[0] , al.size() - 1 - fromTo[1] + fromTo[0]);
            al.remove(to);
            from = (to % al.size() == 0) ? 1 : to % al.size();
        }
        System.out.println(ans);
    }
}
