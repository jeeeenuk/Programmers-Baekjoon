import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int MAX = Integer.MIN_VALUE;

        int[] intArrays = new int[9];
        for (int i = 0; i < 9; i++) {
            intArrays[i] = Integer.parseInt(br.readLine());
        }
        for (int num : intArrays){
            if (num > MAX) {
                MAX = num;
            }
        }
        System.out.println(MAX);
        for (int i = 0; i < 9; i++) {
            if (intArrays[i] == MAX) System.out.println(i+1);
        }

        br.close();
        bw.flush();
        bw.close();
    }
}