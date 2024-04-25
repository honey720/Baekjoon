import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class BOJ_L21_11652 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Long, Card> hm = new HashMap<>();
        for(int i = 0; i < N; i++) {
            Long l = Long.parseLong(br.readLine());
            if(!hm.containsKey(l)) hm.put(l, new Card(l, 1));
            else hm.get(l).setCnt(hm.get(l).getCnt() + 1);
        }
        List<Card> values = new ArrayList<>(hm.values());
        values.sort(Comparator.comparing(Card::getCnt).reversed().thenComparing(Card::getNum));
        System.out.println(values.get(0).getNum());
        br.close();
    }
}

class Card {
    private long num;
    private int cnt;
    public Card(long num, int cnt) {
        this.num = num;
        this.cnt = cnt;
    }

    public long getNum() {
        return num;
    }

    public int getCnt() {
        return cnt;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}
