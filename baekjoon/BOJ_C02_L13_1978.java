import java.util.Scanner;

public class BOJ_C02_L13_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int output = input1;

        for(int i = 0 ; i < input1; i++) {
            int input2 = sc.nextInt();
            if(input2 == 1)
                --output;
            for(int j = 2; j < input2; j++) {
                if(input2 % j == 0) {
                    --output;
                    break;
                }
            }
        }
        System.out.print(output);
    }
}