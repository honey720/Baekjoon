import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_C03_L23_1541 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> num = new ArrayList<>();

        boolean minus = false;
        int answer = 0;
        int check = 0;

        String input = br.readLine();
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '+') {
                if(minus) {
                    num.add(Integer.parseInt((input.substring(check, i))));
                }
                else {
                    answer += Integer.parseInt(input.substring(check, i));
                }
                check = i + 1;
            }
            else if(input.charAt(i) == '-') {
                if(minus) {
                    num.add(Integer.parseInt((input.substring(check, i))));
                    answer -= sum(num);
                    num = new ArrayList<>();
                }
                else {
                    answer += Integer.parseInt(input.substring(check, i));
                }
                minus = true;
                check = i + 1;
            }
        }
        num.add(Integer.parseInt(input.substring(check)));
        if(minus) {
            answer -= sum(num);
        }
        else {
            answer += sum(num);
        }

        System.out.println(answer);
    }

    public static int sum(ArrayList<Integer> num) {
        int result = 0;
        for(int i : num) {
            result += i;
        }
        return result;
    }
}
