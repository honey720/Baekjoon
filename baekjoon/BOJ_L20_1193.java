import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_L20_1193 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        boolean flip = false;
        int i = 1;
        while (X > i) {
            X -= i;
            ++i;
            flip = !flip;
        }
        if(!flip) {
            System.out.println((i - X + 1) + "/" + (X));
        }
        else {
            System.out.println((X) + "/" + (i - X + 1));
        }
    }
}
