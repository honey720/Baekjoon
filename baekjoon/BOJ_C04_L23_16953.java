import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_C04_L23_16953 {

    static long answer = -1;
    static long A, B;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        find(A, 1);
        System.out.println(answer);
    }

    public static void find(long start, long count) {
        if(start == B) {
            if(answer == -1 || answer > count) {
                answer = count;
            }
        }
        else if(start < B) {
            find(start * 2, count + 1);
            find(start * 10 + 1, count + 1);
        }
    }
}
