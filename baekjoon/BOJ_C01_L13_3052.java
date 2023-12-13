import java.util.Scanner;

class BOJ_C01_L13_3052 {
    public static void main(String[] args) {
        int[] input = new int[10];
        int output = 0;
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while(count < input.length) {
            int result = 0;
            input[count] = sc.nextInt();

            for(int i = 0; i < count; i++) {
                if(input[i] % 42 == input[count] % 42) {
                    result = 1;
                    break;
                }
            }
            if(result == 0)
                ++output;
            ++count;
        }
        System.out.print(output);
    }
}