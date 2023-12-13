import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class BOJ_C02_L22_2108 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> hm = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            }
            else {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
        }
        Arrays.sort(arr);

        int avg = (int) Math.round(Arrays.stream(arr).average().orElse(0));

        int mid = arr[((1 + N) / 2) - 1];

        ArrayList<Integer> maxli = new ArrayList<>();
        int count = 0;
        for(int i : arr) {
            if(hm.get(i) > count) {
                maxli = new ArrayList<>();
                count = hm.get(i);
                maxli.add(i);
            }
            else if(hm.get(i) == count && !maxli.contains(i)) {
                maxli.add(i);
            }
        }
        Collections.sort(maxli);
        int max = maxli.get(0);
        if(maxli.size() > 1) {
            max = maxli.get(1);
        }

        int ran = arr[N-1] - arr[0];

        bw.write(avg + "\n");
        bw.write(mid + "\n");
        bw.write(max + "\n");
        bw.write(ran + "\n");

        br.close();
        bw.close();
    }
}
