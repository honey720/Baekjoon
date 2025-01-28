import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        HashSet<Integer>[] hyper = new HashSet[11];

        for (int i = 0; i < 11; i++) hyper[i] = new HashSet<>();

        for (int i = 0; i < 2047; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j < 11; j++) {
                int input = Integer.parseInt(st.nextToken());
                if (hyper[j].contains(input)) hyper[j].remove(input);
                else hyper[j].add(input);
            }
        }

        for (int i = 0; i < 11; i++) {
            Iterator<Integer> it = hyper[i].iterator();
            bw.append(it.next() + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
