import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class BOJ_L24_1141 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        for(int i = 0; i < N; i++) { //문자열 저장
            str[i] = br.readLine();
        }
        Arrays.sort(str, (s1, s2) -> Integer.compare(s2.length(), s1.length())); //문자열 길이 순서로 내림차순 정렬
        HashSet<String> hs = new HashSet<>();
        for(String s1 : str) {
            boolean chk = true;
            for(String s2: hs) {
                if(s2.indexOf(s1) == 0) { //s2가 s1의 부분집합인지 확인
                    chk = false; //부분집합인 s2는 hs에 포함되지 않음.
                    break;
                }
            }
            if(chk) hs.add(s1); //부분집합이 아닌 s2는 hs에 포함됨.
        }
        System.out.println(hs.size());
        br.close();
    }
}
