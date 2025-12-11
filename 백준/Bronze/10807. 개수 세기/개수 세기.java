import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] intArray = new int[N];
        int count = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            intArray[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            if (intArray[i] == M){
                count += 1;
            }
        }
        System.out.println(count);
        br.close();
        bw.flush();
        bw.close();
    }
}