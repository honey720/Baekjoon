import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = {"063", "010", "093", "079", "106", "103", "119", "011", "127", "107"};

        while (true) {
            String Input = br.readLine();
            if (Input.equals("BYE")) break;
            String[] input = Input.substring(0, Input.length()-1).split("[+]");
            String A = input[0];
            String B = input[1];
            StringBuilder a = new StringBuilder();
            StringBuilder b = new StringBuilder();
            for (int i = 0; i < A.length(); i+=3) {
                String seven = A.substring(i, i+3);
                for (int j = 0; j < 10; j++) {
                    if (str[j].equals(seven)) a.append(j);
                }
            }
            for (int i = 0; i < B.length(); i+=3) {
                String seven = B.substring(i, i+3);
                for (int j = 0; j < 10; j++) {
                    if (str[j].equals(seven)) b.append(j);
                }
            }
            String c = String.valueOf(Integer.parseInt(String.valueOf(a)) + Integer.parseInt(String.valueOf(b)));
            StringBuilder C = new StringBuilder();
            for (int i = 0; i < c.length(); i++) {
                C.append(str[Integer.parseInt(String.valueOf(c.charAt(i)))]);
            }
            System.out.println(Input + C);
        }

        br.close();
    }
}
