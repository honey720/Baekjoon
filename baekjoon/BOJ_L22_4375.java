import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_L22_4375 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            int n = Integer.parseInt(input);
            int num = 1;
            for(int i = 1; i <= n; i++){
                if(num%n==0){
                    System.out.println(i);
                    break;
                }
                else{
                    num=(num*10)+1;
                    num%=n; //모듈러 연산 적용
                }
            }
        }
    }
}
