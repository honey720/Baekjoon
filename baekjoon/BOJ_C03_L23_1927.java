import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class BOJ_C03_L23_1927 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input == 0) {
                if(pq.isEmpty()) {
                    sb.append("0").append("\n");
                }
                else {
                    sb.append(pq.poll()).append("\n");
                }
            }
            else {
                pq.offer(input);
            }
        }
        bw.write(sb + "");
        bw.flush();
        br.close();
    }
}
