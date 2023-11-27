import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class beakjoon2164 {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            q.offer(i);
        }
        while (q.size() != 1) {
            q.poll();
            q.offer(q.poll());
        }
        System.out.print(q.poll());
    }
}
