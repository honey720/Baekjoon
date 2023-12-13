import java.util.Scanner;

public class BOJ_C02_L13_2231 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int output = 0;
        String input2 = String.valueOf(input);

        for(int i = 1; i <= (9 * input2.length()); i++) {

            int result = input - i;
            for(int j = 0; j < input2.length(); j++) {
                result += (input - i) / (int)Math.pow(10, j) % 10;
            }

            if(input - i < 0)
                break;
            else if(input == result) {
                if(output == 0)
                    output = input - i;
                else if(output != 0 && output > input - i)
                    output = input - i;
            }
        }
        System.out.print(output);
    }
}