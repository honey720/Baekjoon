import java.util.Scanner;

class BOJ_C01_L01_9498 {
    public static void main(String[] args) {
        int input;
        String output;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        if(input >= 90 && input <= 100) output = "A";
        else if(input >= 80 && input < 90) output = "B";
        else if(input >= 70 && input < 80) output = "C";
        else if(input >= 60 && input < 70) output = "D";
        else output = "F";
        System.out.println(output);
    }
}