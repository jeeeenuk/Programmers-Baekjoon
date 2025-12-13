import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < R; k++) {
                    sb.append(s.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}