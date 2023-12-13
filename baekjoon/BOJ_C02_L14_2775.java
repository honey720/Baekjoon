import java.util.Scanner;

public class BOJ_C02_L14_2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        for(int i = 0; i < input1; i++) {
            int input2_1 = sc.nextInt();
            int input2_2 = sc.nextInt();
            int[][] output = new int[input2_1 + 1][input2_2 + 1];
            for(int j = 0; j <= input2_1; j++) {
                if(j == 0) {
                    for(int k = 0; k <= input2_2; k++) {
                        output[j][k] = k;
                    }
                }
                else {
                    for(int k = 0; k <= input2_2; k++) {
                        for(int l = 0; l <= k; l++)
                            output[j][k] += output[j-1][l];
                    }
                }
            }
            System.out.println(output[input2_1][input2_2]);
        }
        sc.close();
    }
}