import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_C00_L23_18222 {

    static long k;
    static boolean change = false;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Long.parseLong(br.readLine());
        DnC(1);
        if(change) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }

    public static void DnC(long n) {
        if(k > n) {
            DnC(n * 2);
        }
        if(n == 1) {
            return;
        }
        else if(k - (n/2) > 0) {
            change = !change;
            k -= n/2;
        }
    }
}
