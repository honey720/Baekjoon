import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> al = new ArrayList<>();
        String[] s = new String[4];
        List<Integer> li;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        s[0] = String.valueOf(i);
                        s[1] = String.valueOf(j);
                        s[2] = String.valueOf(k);
                        s[3] = String.valueOf(l);

                        li = new ArrayList<>();
                        li.add(Integer.parseInt(s[0] + s[1] + s[2] + s[3]));
                        li.add(Integer.parseInt(s[1] + s[2] + s[3] + s[0]));
                        li.add(Integer.parseInt(s[2] + s[3] + s[0] + s[1]));
                        li.add(Integer.parseInt(s[3] + s[0] + s[1] + s[2]));
                        li.sort(Comparator.naturalOrder());
                        int min = li.get(0);
                        if (!al.contains(min)) al.add(min);
                    }
                }
            }
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        s[0] = st.nextToken();
        s[1] = st.nextToken();
        s[2] = st.nextToken();
        s[3] = st.nextToken();

        li = new ArrayList<>();
        li.add(Integer.parseInt(s[0] + s[1] + s[2] + s[3]));
        li.add(Integer.parseInt(s[1] + s[2] + s[3] + s[0]));
        li.add(Integer.parseInt(s[2] + s[3] + s[0] + s[1]));
        li.add(Integer.parseInt(s[3] + s[0] + s[1] + s[2]));
        li.sort(Comparator.naturalOrder());

        System.out.println(al.indexOf(li.get(0)) + 1);
        br.close();
    }
}
