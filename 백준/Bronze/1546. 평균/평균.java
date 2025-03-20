import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        br.close();
        int M = 0;
        double score = 0;

        for (int num : nums){
            M = Math.max(num, M);
        }

        for (int i = 0; i < N; i++){
            score += (double) nums[i]/M*100;
        }
        System.out.println(score/N);
    }
}
