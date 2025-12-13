import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            if (arr[idx] == -1) arr[idx] = i;
        }

        for (int num : arr) sb.append(num).append(" ");
        System.out.println(sb);
        br.close();
    }
}