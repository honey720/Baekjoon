import java.util.Scanner;

public class BOJ_C02_L13_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int input2 = sc.nextInt();
        int[] input3 = new int[input];
        int diff = input2;
        int output = 0;
        for(int i = 0; i < input; i++) {
            input3[i] = sc.nextInt();
        }
        for(int i = 0; i < input; i++) {
            for(int j = i + 1; j < input; j++) {
                for(int k = j + 1; k < input; k++) {
                    if(i == j || j == k)
                        continue;
                    int tmp = input2 - (input3[i] + input3[j] + input3[k]);
                    if(tmp < 0)
                        continue;
                    else if(diff > tmp) {
                        diff = tmp;
                        output = (input3[i] + input3[j] + input3[k]);
                    }
                }
            }
        }
        System.out.print(output);
    }
}