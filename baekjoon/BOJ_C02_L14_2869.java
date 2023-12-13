import java.util.Scanner;

public class BOJ_C02_L14_2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long up = sc.nextLong();
        long down = sc.nextLong();
        long goal = sc.nextLong();
        long movePerDay = 0;
        long days = 0;

        movePerDay = up - down;
        days = (goal - up) / movePerDay + 1;
        if ((goal - up) % movePerDay > 0)
            days++;
        System.out.println(days);
        sc.close();
    }
}