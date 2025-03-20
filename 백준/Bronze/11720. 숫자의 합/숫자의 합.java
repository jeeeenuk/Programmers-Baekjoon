import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] N = br.readLine().split("");
        int answer = 0;

        for (int i = 0; i < T; i++){
            answer += Integer.parseInt(N[i]);
        }
        System.out.println(answer);
    }
}
