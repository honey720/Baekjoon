import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.PriorityQueue;

public class BOJ_C03_L24_11286 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> absHeap = new PriorityQueue<>();
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        int input;
        int abs;
        PriorityQueue<Integer> pq;
        for(int i = 0; i < N; i++) {
            input = Integer.parseInt(br.readLine());
            if(input == 0) {
                if(absHeap.isEmpty()) {
                    sb.append(0).append("\n");
                }
                else {
                    abs = Math.abs(absHeap.poll());
                    pq = map.get(abs);
                    sb.append(pq.poll()).append("\n");
                    map.put(abs, pq);
                }
            }
            else {
                abs = Math.abs(input);
                absHeap.offer(abs);
                if(map.containsKey(abs)) {
                    pq = map.get(abs);
                    pq.offer(input);
                    map.put(abs, pq);
                }
                else {
                    pq = new PriorityQueue<>();
                    pq.offer(input);
                    map.put(abs, pq);
                }
            }
        }

        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
