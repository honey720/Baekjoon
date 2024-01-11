import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_C03_L24_1697 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int answer = 100000;
        boolean[] visited = new boolean[100001];

        if(start > end) {
            answer = start - end;
        }
        else {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(start);
            al.add(0);

            Queue<ArrayList<Integer>> q = new LinkedList<>();
            q.offer(al);
            while (!q.isEmpty()) {
                al = q.poll();

                if(answer < al.get(1) || visited[al.get(0)]) {
                    continue;
                }
                else if(al.get(0) == end) {
                    answer = Math.min(answer, al.get(1));
                }
                else {
                    ArrayList<Integer> newAl;
                    visited[al.get(0)] = true;
                    if(al.get(0) * 2 >= 0 && al.get(0) * 2 <= 100000) {
                        newAl = new ArrayList<>();
                        newAl.add(al.get(0) * 2);
                        newAl.add(al.get(1) + 1);
                        q.offer(newAl);
                    }
                    if(al.get(0) + 1 >= 0 && al.get(0) + 1 <= 100000) {
                        newAl = new ArrayList<>();
                        newAl.add(al.get(0) + 1);
                        newAl.add(al.get(1) + 1);
                        q.offer(newAl);
                    }
                    if(al.get(0) - 1 >= 0 && al.get(0) - 1 <= 100000) {
                        newAl = new ArrayList<>();
                        newAl.add(al.get(0) - 1);
                        newAl.add(al.get(1) + 1);
                        q.offer(newAl);
                    }
                }
            }
        }
        System.out.println(answer);
        br.close();
    }
}
