import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon4153 {
    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = null;
        try {
            while((str = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(str, " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());

                if(a == 0 && b == 0 && c == 0) break;

                if(a < b) {
                    if(b < c) {
                        if(c * c == a * a + b * b)
                            System.out.println("right");
                        else
                            System.out.println("wrong");
                    }
                    else {
                        if(b * b == a * a + c * c)
                            System.out.println("right");
                        else
                            System.out.println("wrong");
                    }
                }
                else {
                    if(a < c) {
                        if(c * c == a * a + b * b)
                            System.out.println("right");
                        else
                            System.out.println("wrong");
                    }
                    else {
                        if(a * a == b * b + c * c)
                            System.out.println("right");
                        else
                            System.out.println("wrong");
                    }
                }
            }
        }
        catch (IOException e) {
        }
    }
}