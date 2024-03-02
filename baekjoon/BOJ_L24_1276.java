import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_L24_1276 {
    public static void main(String[] args) throws Exception {
        int ans = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Platforme[] p = new Platforme[N];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            p[i] = new Platforme(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(p, Collections.reverseOrder());

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < 2; j++) {
                int length = p[i].get_Y();
                for(int k = 0; k < N; k++) {
                    if(p[i].get_Y() > p[k].get_Y()) {
                        if(j == 0) {
                            if(p[i].get_X()[j] >= p[k].get_X()[0] && p[i].get_X()[j] < p[k].get_X()[1]) {
                                length = p[i].get_Y() - p[k].get_Y();
                                break;
                            }
                        }
                        else {
                            if(p[i].get_X()[j] > p[k].get_X()[0] && p[i].get_X()[j] <= p[k].get_X()[1]) {
                                length = p[i].get_Y() - p[k].get_Y();
                                break;
                            }

                        }
                    }
                }
                ans += length;
            }
        }
        System.out.println(ans);
        br.close();
    }
}

class Platforme implements Comparable<Platforme>{
    private int Y;
    private int[] X;

    public Platforme(int Y, int X1, int X2) {
        this.Y = Y;
        this.X = new int[] {X1, X2};
    }

    public int get_Y() {
        return this.Y;
    }
    public int[] get_X() {return this.X; }

    @Override
    public int compareTo(Platforme o) {
        // TODO Auto-generated method stub
        return get_Y() - o.get_Y();
    }
}