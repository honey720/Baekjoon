import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L24_1206 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] avg = new int[N];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ".");
            avg[i] = Integer.parseInt(st.nextToken() + st.nextToken());
        }
        int p = 1000; //최대를 1000으로 잡고 시작
        for(int i = 1; i <= 1000; i++) {
            boolean chk = true;
            for(int j : avg) {
                int s = j * i;
                int e = (j+1) * i;
                if((s % 1000 != 0 && (e / 1000 - s / 1000 == 0)) || e % 1000 == 0) {
                    //조건에 만족하지 않음 == 사람 수가 맞지 않음 -> 바로 다음 조건문으로
                    chk = false;
                    break;
                }
            }
            if(chk) {
                //모든 평균값들이 조건에 만족한다면 이 값이 정답
                p = i;
                break;
            }
        }
        System.out.println(p);
        br.close();
    }
}
