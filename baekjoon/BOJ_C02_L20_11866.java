import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_C02_L20_11866 {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int num = sc.nextInt();
        int target = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= index; i++)
            list.add(i);
        System.out.print('<');
        while(!(list.size() == 0)) {
            target = (target + num - 1) % list.size();
            System.out.print(list.get(target));
            list.remove(target);
            if(list.size() == 0)
                System.out.print('>');
            else
                System.out.print(", ");
        }
    }
}
