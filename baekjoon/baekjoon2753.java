import java.util.Scanner;

class baekjoon2753 {
    public static void main(String[] args) {
        int input;
        int output;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        if(input % 4 == 0) output = 1;
        else output = 0;
        if(input % 100 == 0) output = 0;
        if(input % 400 == 0) output = 1;
        System.out.println(output);
    }
}