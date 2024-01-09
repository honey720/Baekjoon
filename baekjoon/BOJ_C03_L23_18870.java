import java.io.*;
import java.util.*;

public class BOJ_C03_L23_18870 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] sort = new int[N];
        HashMap<Integer, Integer> hm = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            arr[i] = sort[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sort);

        int rank = 0;
        for(int i : sort) {
            if(!hm.containsKey(i)) {
                hm.put(i, rank);
                rank++;
            }
        }

        for(int i : arr) {
            sb.append(hm.get(i)).append(" ");
        }

        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
