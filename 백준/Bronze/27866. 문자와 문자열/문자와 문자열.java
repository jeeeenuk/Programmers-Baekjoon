import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split("");
        int num = Integer.parseInt(br.readLine());

        bw.write(str[num-1]);
        bw.flush(); bw.close(); br.close();
    }
}