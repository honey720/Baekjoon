import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_L24_1446 {
    static int D;
    static ArrayList<ShortCut> al = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());
        int ans = D;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());
            if(start <= D && end <= D && end - start > length) {
                al.add(new ShortCut(start, end, length));
            }
        }
        Collections.sort(al);

        for(int i = 0; i < al.size(); i++) {
            if(al.get(i).getEnd() <= D) {
                int next = al.get(i).getStart() + al.get(i).getLength();
                ans = Math.min(ans, DFS(al.get(i).getEnd(), i, next));
            }
        }

        System.out.println(ans);
    }

    public static int DFS(int s, int n, int c) {
        int res = c + (D - s);
        for(int i = n + 1; i < al.size(); i++) {
            if(al.get(i).getEnd() <= D && s <= al.get(i).getStart()) {
                int next = c + (al.get(i).getStart() - al.get(n).getEnd()) + al.get(i).getLength();
                res = Math.min(res, DFS(al.get(i).getEnd(), i, next));
            }
        }
        return Math.min(c + (D - s), res);
    }
}

class ShortCut implements Comparable<ShortCut> {
    private final int start;
    private final int end;
    private final int length;

    public ShortCut(int s, int e, int l) {
        this.start = s;
        this.end = e;
        this.length = l;
    }

    public int getStart() {
        return this.start;
    }
    public int getEnd() {
        return this.end;
    }
    public int getLength() {
        return this.length;
    }
    @Override
    public int compareTo(ShortCut sc) {
        if (this.start > sc.start) return 1;
        else if (this.start == sc.start) {
            if(this.end > sc.end) return 1;
            else if (this.end == sc.end) {
                if(this.length > sc.length) return 1;
                else return 0;
            }
        }
        return -1;
    }
}
