import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int BucketNum = Integer.parseInt(st.nextToken());
        int TryBall = Integer.parseInt(st.nextToken());
        int[] Bucket = new int[BucketNum];

        for (int i = 0; i < TryBall; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int ballNum = Integer.parseInt(st.nextToken());
            for (int j = start-1; j < end; j++) {
                Bucket[j] = ballNum;
            }
        }

        for (Integer i : Bucket) {
            System.out.printf("%d ",i);
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}