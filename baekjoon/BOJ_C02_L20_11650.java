import java.util.*;

public class BOJ_C02_L20_11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, List<Integer>> tm = new TreeMap<>();
        int num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(!tm.containsKey(x))
                tm.put(x, new ArrayList<>());
            tm.get(x).add(y);
        }

        for(Integer key: tm.keySet()) {
            Collections.sort(tm.get(key));
            for(int i = 0; i < tm.get(key).size(); i++) {
                System.out.println(key + " " + tm.get(key).get(i));
            }
        }
    }
}