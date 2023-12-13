import java.util.Scanner;

public class BOJ_C02_L20_1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int i = 0;
        int goal = sc.nextInt();
        while(i < goal) {
            if(goal % 5 == 0) {
                count++;
                if(goal % 25 == 0) {
                    count++;
                    if(goal % 125 == 0) {
                        count++;
                    }
                }
            }
            goal--;
        }
        System.out.print(count);
    }
}