import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String[] A = st.nextToken().split("");
        String[] B = st.nextToken().split("");
        String a = "";
        String b = "";

        for (int i = 2; i >= 0; i--) {
            a += Integer.parseInt(A[i]);
            b += Integer.parseInt(B[i]);
        }
        if (Integer.parseInt(a) > Integer.parseInt(b)){
            System.out.print(a);
        } else System.out.print(b);

        br.close();
    }
}