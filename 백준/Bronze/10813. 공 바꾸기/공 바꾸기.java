import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int bucket = Integer.parseInt(st.nextToken());
        int switchNum = Integer.parseInt(st.nextToken());

        int[] bucketArr = new int[bucket];

        for (int i = 0; i < bucket; i++) {
            bucketArr[i] = i+1;
        }
        for (int i = 0; i < switchNum; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int num = bucketArr[a-1];
            bucketArr[a-1] = bucketArr[b-1];
            bucketArr[b-1] = num;
        }
        for (Integer num : bucketArr) System.out.printf("%d ", num);
        
        br.close();
        bw.flush();
        bw.close();
    }
}