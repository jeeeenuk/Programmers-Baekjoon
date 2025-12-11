import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int TotalPrice = Integer.parseInt(br.readLine());
        int Num = Integer.parseInt(br.readLine());
        int Price = 0;

        for (int i = 0; i < Num; i++) {
            st = new StringTokenizer(br.readLine());
            Price += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }
        if (TotalPrice == Price) System.out.println("Yes");
        else System.out.println("No");
        bw.close();
    }
}