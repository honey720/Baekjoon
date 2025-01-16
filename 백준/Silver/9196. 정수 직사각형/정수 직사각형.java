import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();

            if(input.equals("0 0"))
                break;

            String[] hw = input.split(" ");
            int h = Integer.parseInt(hw[0]);
            int w = Integer.parseInt(hw[1]);
            int aa = h*h + w*w;

            int minaa = 150*150 + 150*150;
            int minh = 150;
            int minw = 150;

            boolean isFoundSameArea = false;

            for (int i = 1; i < 150; i++) {
                for (int j = i + 1; j <= 150; j++) {
                    int aaa = i*i + j*j;

                    if (i == h && j == w) continue;

                    if (aaa > aa && aaa < minaa) {
                        minaa = aaa;
                        minh = i;
                        minw = j;
                    }
                    else if (aaa == aa && i > h) {
                        minaa = aaa;
                        minh = i;
                        minw = j;
                        isFoundSameArea = true;
                    }
                    if (isFoundSameArea)
                        break;
                }
                if (isFoundSameArea)
                    break;
            }
            bw.write(minh + " " + minw + '\n');
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
