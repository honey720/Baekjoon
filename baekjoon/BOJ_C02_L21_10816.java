import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_C02_L21_10816 {
    public static void main(String []args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> hm = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] cards = new int[N];
        for(int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
            if(hm.containsKey(cards[i]))
                hm.put(cards[i], hm.get(cards[i]) + 1);
            else
                hm.put(cards[i], 1);
        }

        Arrays.sort(cards);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
        for(int j = 0; j < M; j++) {
            int num = Integer.parseInt(st.nextToken());
            int result = getBinarySearch(num, cards);
            if(result == -1)
                sb.append("0 ");
            else
                sb.append(hm.get(cards[result])).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static int getBinarySearch (int target, int[] cards) {
        int ans = -1;
        int left = 0;
        int right = cards.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(target == cards[mid]) {
                ans = mid;
                break;
            }
            else if (target < cards[mid])
                right = mid - 1;
            else if (target > cards[mid])
                left = mid + 1;
        }
        return ans;
    }
}