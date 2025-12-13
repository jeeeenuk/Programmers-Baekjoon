import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split("");
        int[] numArr = new int[26];
        Arrays.fill(numArr, -1);

        for (int i = 0; i < str.length; i++) {
            if (numArr[(int) str[i].charAt(0) - 97] == -1){
                numArr[(int) str[i].charAt(0) - 97] = i;
            }
        }
        for (int num : numArr) bw.write(num + " ");
        bw.flush(); bw.close(); br.close();
    }
}