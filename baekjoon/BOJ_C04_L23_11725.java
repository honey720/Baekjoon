import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_C04_L23_11725 {

    static int N;
    static HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
    static int [] arr;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        StringTokenizer st;
        for(int i = 1; i < N; i++) {
            ArrayList<Integer> a_list = new ArrayList<>();
            ArrayList<Integer> b_list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(hm.containsKey(a)) {
                a_list = hm.get(a);
            }
            if(hm.containsKey(b)) {
                b_list = hm.get(b);
            }
            a_list.add(b);
            b_list.add(a);
            hm.put(a, a_list);
            hm.put(b, b_list);
        }
        find(1);
        for(int i = 2; i <= N; i++) {
            sb.append(arr[i]).append("\n");
        }
        bw.write(sb + "");
        br.close();
        bw.flush();
        bw.close();
    }

    public static void find(int start) {
        ArrayList<Integer> list = hm.get(start);
        for(int i : list) {
            if(i == 1) {
                continue;
            }
            if(arr[i] == 0) {
                arr[i] = start;
                find(i);
            }
        }
    }
}
