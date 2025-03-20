import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine().trim();
        br.close();

        String one = "AabDdegOopPQqR@";
        String two = "B";
        int answer = 0;

        for (int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            if (one.indexOf(ch) != -1){
                answer++;
            } else if (two.indexOf(ch) != -1) {
                answer+=2;
            }
        }
        System.out.println(answer);
    }
}
