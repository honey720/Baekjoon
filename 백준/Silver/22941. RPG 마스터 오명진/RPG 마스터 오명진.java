import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long YHP = Long.parseLong(st.nextToken());
        long YATK = Long.parseLong(st.nextToken());
        long MHP = Long.parseLong(st.nextToken());
        long MATK = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long P = Long.parseLong(st.nextToken());
        long S = Long.parseLong(st.nextToken());

        long YRHP = YHP % MATK;
        long MRHP = MHP % YATK;

        if (MHP > YATK) {
            if (MRHP == 0) {
                if (P >= YATK) {
                    MHP += S;
                    MRHP = MHP % YATK;
                }
            } else if (MRHP <= P) {
                MHP += S;
                MRHP = MHP% YATK;
            }
        }

        long Ycnt = MHP / YATK;
        if (MRHP > 0) Ycnt++;
        long Mcnt = YHP / MATK;
        if (YRHP > 0) Mcnt++;

        if (Ycnt <= Mcnt) System.out.println("Victory!");
        else System.out.println("gg");

        br.close();
    }
}
