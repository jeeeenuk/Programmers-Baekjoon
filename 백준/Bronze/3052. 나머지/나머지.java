import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] remainder = new boolean[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            remainder[num % 42] = true;
        }

        for (boolean num : remainder) {
            if (num) count +=1;
        }
        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();
    }
}