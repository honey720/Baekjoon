import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_C02_L21_10845 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        LinkedList<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = 0;
            String input = br.readLine();
            st = new StringTokenizer(input);

            String command = st.nextToken();
            if(st.hasMoreTokens())
                num = Integer.parseInt(st.nextToken());
            Queue(queue, command, num);
        }
    }

    public static void Queue(LinkedList<Integer> queue, String command, int num) {
        switch (command) {
            case "push": {
                queue.offer(num);
                break;
            }
            case "pop": {
                if(queue.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(queue.poll());
                break;
            }
            case "size": {
                System.out.println(queue.size());
                break;
            }
            case "empty": {
                if(queue.isEmpty())
                    System.out.println("1");
                else
                    System.out.println("0");
                break;
            }
            case "front": {
                if(queue.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(queue.getFirst());
                break;
            }
            case "back": {
                if(queue.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(queue.getLast());
                break;
            }
        }
    }
}
