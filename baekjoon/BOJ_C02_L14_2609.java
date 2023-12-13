import java.util.Scanner;

public class BOJ_C02_L14_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int max = 1;
        int min = input1 * input2;
        for(int i = 2; i <= Math.min(input1, input2); i++) {
            if(input1 % i == 0 && input2 % i == 0)
                max = i;
        }
        for(int i = input1 * input2; i >= Math.max(input1, input2); i--) {
            if(i % input1 == 0 && i % input2 == 0)
                min = i;
        }
        System.out.println(max);
        System.out.println(min);

        sc.close();
    }
}