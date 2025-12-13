import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] T = st.nextToken().split("");
        int count = 0;

        for (int i = 0; i < T.length; i++) {
            if (T[i].equals("A") || T[i].equals("B") || T[i].equals("C")) {
                count += 2;
            } else if (T[i].equals("D") || T[i].equals("E") || T[i].equals("F")) {
                count += 3;
            } else if (T[i].equals("G") || T[i].equals("H") || T[i].equals("I")) {
                count += 4;
            } else if (T[i].equals("J") || T[i].equals("K") || T[i].equals("L")) {
                count += 5;
            } else if (T[i].equals("M") || T[i].equals("N") || T[i].equals("O")) {
                count += 6;
            } else if (T[i].equals("P") || T[i].equals("Q") || T[i].equals("R") || T[i].equals("S")) {
                count += 7;
            } else if (T[i].equals("T") || T[i].equals("U") || T[i].equals("V")) {
                count += 8;
            } else if (T[i].equals("W") || T[i].equals("X") || T[i].equals("Y") || T[i].equals("Z")) {
                count += 9;
            }
        }
        count += T.length;
        System.out.println(count);

        br.close();
    }
}