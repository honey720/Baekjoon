import java.util.Scanner;

public class baekjoon1929 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();

        for (int i = min; i <= max; i++) {
            if(isPrime(i)) {
                    System.out.println(i);
            }
        }

    }
    public static boolean isPrime(int N) {
        if(N == 1) {
            return false;
        }
        for(int i = 2; i <= (int)Math.sqrt(N); i++) {
            if(N % i == 0){
                return false;
            }
        }
        return true;
    }
}
