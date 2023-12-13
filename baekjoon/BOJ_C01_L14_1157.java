import java.util.Scanner;

public class BOJ_C01_L14_1157 {
    public static void main(String args[]) {
        char[] a = new char[1000000];
        int[] b = new int[26];
        int max = 0;
        int index = -1;
        char output = 0;
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        a = input.toCharArray();

        for(char i:a) {
            if(i > 64 && i < 91)
                ++b[i - 65];
            else if(i > 96 && i < 123)
                ++b[i - 97];
            else
                break;
        }

        for(int j = 0; j < b.length; j++) {
            if(b[j] > max) {
                max = b[j];
                index = j;
                output = (char)(j + 65);
            }
        }
        for(int k = 0; k < b.length; k++) {
            if(k == index)
                continue;
            if(max == b[k])
                output = 63;
        }
        System.out.print(output);
    }
}