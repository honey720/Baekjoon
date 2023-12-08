import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class beakjoon1966 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<ArrayList<Integer>> queue;
        StringTokenizer st1, st2;
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            queue = new LinkedList<>();
            String s1 = br.readLine();
            String s2 = br.readLine();
            st1 = new StringTokenizer(s1);
            st2 = new StringTokenizer(s2);

            int size = Integer.parseInt(st1.nextToken());
            int index = Integer.parseInt(st1.nextToken());

            for(int j = 0; j < size; j++) {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(j);
                al.add(Integer.parseInt(st2.nextToken()));
                queue.offer(al);
            }

            System.out.println(queueProcess(queue, index));
        }
    }

    public static int queueProcess(Queue<ArrayList<Integer>> queue, int index){
        int answer = 1;
        while (true) {
            ArrayList<Integer> al = queue.poll();
            int max = 0;
            for(int i = 0; i < queue.size(); i++) {
                ArrayList<Integer> comp = queue.poll();
                if(comp.get(1) > max)
                    max = comp.get(1);
                queue.offer(comp);
            }
            if(al.get(1) >= max) {
                if(al.get(0) == index)
                    return answer;
                answer++;
            }
            else
                queue.offer(al);
        }
    }
}
