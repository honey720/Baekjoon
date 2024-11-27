import java.io.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int count = (int) Math.pow(2, input) - 1;
        bw.write(count + "\n");
        hanoii(input, 1, 2, 3);
        bw.flush();
        br.close();
        bw.close();
    }

    public static void hanoii(int i, int start, int sub, int goal) throws IOException {
        if (i > 1)
            hanoii(i - 1, start, goal, sub);
        bw.write(start + " " + goal + "\n");
        if (i > 1)
            hanoii(i - 1, sub, start, goal);
    }
}
