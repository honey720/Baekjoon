import java.util.Scanner;

class BOJ_C01_L11_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i = 1; i <= input; i++) {
            for(int j = 1; j <= input - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}