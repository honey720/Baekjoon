import java.util.Scanner;

class BOJ_C01_L13_10809 {
    public static void main(String[] args) {
        String input = null;
        int[] output = new int[26];
        Scanner sc = new Scanner(System.in);

        int count = 0;
        input = sc.next();


        while(count < output.length) {
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == 97 + count) {
                    output[count] = i;
                    break;
                }
                else
                    output[count] = -1;
            }
            System.out.print(output[count] + " ");
            ++count;
        }
    }
}