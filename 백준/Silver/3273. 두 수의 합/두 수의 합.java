import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int count = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int result = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        int lp = 0;
        int rp = arr.length - 1;
        while (rp > lp) {
            if (arr[lp] + arr[rp] == result) {
                count++;
                lp++;
            }
            if (arr[lp] + arr[rp] <= result) {
                lp++;
            }
            else {
                rp--;
            }
        }
        System.out.println(count);
    }
}
