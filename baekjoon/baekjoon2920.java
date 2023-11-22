import java.util.Scanner;

class baekjoon2920 {
    public static void main(String[] args) {
        int[] input = new int[8];
        Scanner sc = new Scanner(System.in);

        input[0] = sc.nextInt();
        if(input[0] == 1) {
            for(int i = 1; i < input.length; i++) {
                input[i] = sc.nextInt();
                if(input[i] != i + 1) {
                    System.out.print("mixed");
                    break;
                }
                else if(input[7] == 8)
                    System.out.print("ascending");
            }
        }
        else if(input[0] == 8) {
            for(int i = 1; i < input.length; i++) {
                input[i] = sc.nextInt();
                if(input[i] != 8 - i) {
                    System.out.print("mixed");
                    break;
                }
                else if(input[7] == 1)
                    System.out.print("descending");
            }
        }
        else
            System.out.print("mixed");
    }
}