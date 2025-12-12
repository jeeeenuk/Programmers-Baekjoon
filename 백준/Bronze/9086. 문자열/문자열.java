import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        String[] result = new String[T];
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            result[i] = str.charAt(0) + "" + str.charAt(str.length() - 1);
        }
        for (String temp : result) bw.write(temp + "\n");
        bw.flush(); bw.close(); br.close();
    }
}