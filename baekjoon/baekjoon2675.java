import java.util.Scanner;

class baekjoon2675 {
    public static void main(String[] args) {
        int input1 = 0, input2 = 0;
        String s = null;
        Scanner sc = new Scanner(System.in);
        input1 = sc.nextInt();
        int count = 0;
        while(count < input1) {
            input2 = sc.nextInt();
            s = sc.next();
            for(int i = 0; i < s.length(); i++) {
                for(int j = 0; j < input2; j++)
                    System.out.print(s.charAt(i));
            }
            System.out.println("");
            ++count;
        }
    }
}