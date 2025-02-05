
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        if (!factorizeQuadratic(n)) {
            System.out.println("-1");
        }
        br.close();
    }

    public static boolean factorizeQuadratic(int n) {
        // (a, c) 찾기 -> n의 약수 쌍을 모두 고려
        for (int a = 1; a <= Math.abs(n); a++) {
            if (n % a == 0) {  // a가 n의 약수일 경우
                int c = n / a;

                // (b, d) 찾기 -> -(n+2)의 약수 쌍 고려
                for (int b = -Math.abs(n+2); b <= Math.abs(n+2); b++) {
                    if (b != 0 && (n+2) % b == 0) {  // b가 0이 아닐 때만 검사
                        int d = -(n+2) / b;

                        // 인수분해 조건 검증
                        if (a * d + b * c == n + 1) {
                            System.out.println(a + " " + b + " " + c + " " + d);
                            return true;  // 하나만 출력하고 종료
                        }
                    }
                }
            }
        }
        return false;  // 인수분해 불가능한 경우
    }
}
