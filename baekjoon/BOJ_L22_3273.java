import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L22_3273 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[x];
        for(int i = 0; i < N; i++) {
            int input = Integer.parseInt(st.nextToken());
            if(input < x) arr[input] = true;
        }
        int ans = 0;
        for(int i = 1; i < (float) x/2; i++) {
            if(arr[i] && arr[x-i]) ans++;
        }
        System.out.println(ans);
    }
}
