import java.util.Scanner;

class BOJ_C01_L13_8958 {
    public static void main(String[] args) {
        int input1 = 0;
        String input2 = null;
        Scanner sc = new Scanner(System.in);

        int count = 0;
        input1 = sc.nextInt();

        while(count < input1) {
            int output = 0, combo = 1;
            input2 = sc.next();
            for(int i = 0; i < input2.length(); i++) {
                if(input2.charAt(i) == 'O') {
                    output += combo;
                    ++combo;
                }
                else {
                    combo = 1;
                }
            }
            System.out.println(output);
            ++count;
        }
    }
}