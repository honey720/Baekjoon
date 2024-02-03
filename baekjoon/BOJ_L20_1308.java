import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L20_1308 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] s = new int[3];
        int[] e = new int[3];
        int answer = 0;
        int[] sDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] eDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 3; i++) {
            s[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 3; i++) {
            e[i] = Integer.parseInt(st.nextToken());
        }

        if(s[0] + 1000 < e[0]) {
            System.out.println("gg");
            return;
        }
        else if(s[0] + 1000 == e[0]) {
            if(s[1] < e[1]) {
                System.out.println("gg");
                return;
            }
            else if(s[1] == e[1]) {
                if(s[2] <= e[2]) {
                    System.out.println("gg");
                    return;
                }
            }
        }

        sDays[1] = s[0] % 4 == 0 ? s[0] % 100 == 0 ? s[0] % 400 == 0 ? 29 : 28 : 29 : 28;
        eDays[1] = e[0] % 4 == 0 ? e[0] % 100 == 0 ? e[0] % 400 == 0 ? 29 : 28 : 29 : 28;

        if(s[0] == e[0]) {
            if(s[1] == e[1]) {
                answer += e[2] - s[2];
            }
            else {
                answer += sDays[s[1] - 1] - s[2];

                for(int i = s[1]; i < e[1] - 1; i++) {
                    answer += sDays[i];
                }

                answer += e[2];
            }
        }
        else {
            for(int i = s[1] ; i < 12; i++) {
                answer += sDays[i];
            }
            answer += sDays[s[1] - 1] - s[2];

            for(int i = s[0] + 1; i < e[0]; i++){
                answer += i % 4 == 0 ? i % 100 == 0 ? i % 400 == 0 ? 366 : 365 : 366 : 365;
            }

            for(int i = 0; i < e[1] - 1; i++) {
                answer += eDays[i];
            }
            answer += e[2];
        }

        System.out.println("D-" + answer);
    }
}
