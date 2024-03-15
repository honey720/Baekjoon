import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L21_1057 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        boolean[] tree = new boolean[N+1];
        int ans = 1;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        tree[a] = tree[b] = true;

        while (N > 1) {
            N = (int) Math.ceil((double) N/2);
            boolean[] tmp = new boolean[N + 1];
            for(int i = 1; i <= N; i++) {
                if(i == N && (tree.length-1) % 2 == 1) {
                    if(tree[2*i-1]) tmp[i] = true;
                }
                else {
                    if(tree[2*i-1] && tree[2*i]) {
                        System.out.println(ans);
                        return;
                    }
                    else if (tree[2*i-1] || tree[2*i]) {
                        tmp[i] = true;
                    }
                }
            }
            ans++;
            tree = tmp;
        }
        System.out.println(ans);
    }
}
