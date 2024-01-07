import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

class BOJ_C01_L01_1000 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        bw.write(result + "");
        br.close();
        bw.close();

        /*int a, b, c;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = a + b;
        System.out.println(c);

        scanner.close();

         */
    }
}