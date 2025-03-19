import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int time = Integer.parseInt(st1.nextToken());
        int minute = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br. readLine());
        int cookingMinute = Integer.parseInt(st2.nextToken());

        int plusMinute = minute + cookingMinute;

        if (plusMinute > 59) {
            time += plusMinute / 60 ;
            plusMinute = plusMinute % 60;
            if (time > 23){
                time -= 24;
            }
            bw.write(time + " " + plusMinute);
            bw.flush();
        } else {
            bw.write(time + " " + plusMinute);
            bw.flush();
        }
        br.close();
        bw.close();
    }
}