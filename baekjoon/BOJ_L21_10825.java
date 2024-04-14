import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_L21_10825 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Score> scores = new ArrayList<>();
        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Score score = new Score();
            score.setName(st.nextToken());
            score.setK_s(Integer.parseInt(st.nextToken()));
            score.setE_s(Integer.parseInt(st.nextToken()));
            score.setM_s(Integer.parseInt(st.nextToken()));
            scores.add(score);
        }
        Comparator<Score> reverseK_s = Comparator.comparing(Score::getK_s).reversed();
        Comparator<Score> reversM_s = Comparator.comparing(Score::getM_s).reversed();
        scores.sort(reverseK_s.thenComparing(Score::getE_s).thenComparing(reversM_s).thenComparing(Score::getName));
        StringBuilder sb = new StringBuilder();
        for(Score s : scores) {
            sb.append(s.getName()).append("\n");
        }
        System.out.println(sb);
    }
}
class Score {
    private String Name;
    private int k_s;
    private int e_s;
    private int m_s;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getK_s() {
        return k_s;
    }

    public void setK_s(int k_s) {
        this.k_s = k_s;
    }

    public int getE_s() {
        return e_s;
    }

    public void setE_s(int e_s) {
        this.e_s = e_s;
    }

    public int getM_s() {
        return m_s;
    }

    public void setM_s(int m_s) {
        this.m_s = m_s;
    }
}
