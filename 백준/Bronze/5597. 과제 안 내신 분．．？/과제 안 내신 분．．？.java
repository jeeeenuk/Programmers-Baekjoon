import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] studentArr = new int[30];
        for (int i = 0; i < 28; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            studentArr[i] = num;
        }
        boolean[] isNum = new boolean[30];

        for (int i = 0; i < 30; i++) {
            for (int j = 1; j <= 30; j++) {
                if (studentArr[i] == j){
                    isNum[j-1] = true;
                    break;
                }
            }
        }
        for (int i = 0; i < 30; i++) {
            if (!isNum[i]) bw.write(i+1 + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}