import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BOJ_C03_L23_11279 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());

            if(input == 0) {
                if(pq.isEmpty()) {
                    sb.append(0).append("\n");
                }
                else {
                    sb.append(pq.poll()).append("\n");
                }
            }
            else {
                pq.offer(input);
            }
        }

        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
