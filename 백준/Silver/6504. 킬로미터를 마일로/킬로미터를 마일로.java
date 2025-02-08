import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static int[] fib = {17711, 10946, 6765, 4181, 2584, 1597, 987, 610, 377, 233, 144, 89, 55, 34, 21, 13, 8, 5, 3, 2, 1 }; //index 20
    static int input, output;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            input = Integer.parseInt(br.readLine());
            output = 0;
            fib(0);
            bw.append(output + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void fib(int inp) {
        int tmp = -1;
        for (int i = inp; i <= 20; i++) {
            tmp = -1;
            if (input - fib[i] >= 0) {
                tmp = i;
                input -= fib[i];
                if (i != 20) output += fib[i+1];
            }
            if (input == 0) return;
            else fib(i+1);
        }
        if (input != 0 && tmp != -1) {
            input += fib[tmp];
            if (tmp != 20) output -= fib[tmp+1];
        }
    }
}
