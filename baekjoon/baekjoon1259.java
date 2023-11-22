import java.util.Scanner;

public class baekjoon1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String input = sc.next();
            int leng = input.length() - 1;
            if(Integer.parseInt(input) == 0)
                break;
            else {
                for(int i = 0; i < input.length(); i++) {
                    if(input.charAt(i) != input.charAt(leng)) {
                        System.out.println("no");
                        break;
                    }
                    else if(leng <= i) {
                        System.out.println("yes");
                        break;
                    }
                    --leng;
                }
            }

        }
        sc.close();
    }
}