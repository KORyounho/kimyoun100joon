import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.Key;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N+1];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int p1 = 0;
        int p2 = 0;
        int length = Integer.MAX_VALUE;
        int result = arr[p1];
        while (p2 < N && p1 <N) {

            if (result >= target &&length > (p2 - p1) + 1) {
                    length = (p2 - p1) + 1;
            }
            if(result <= target){
                result = result + arr[++p2];
            }
            else {
                result = result - arr[p1++];
            }
        }
        System.out.println(length == Integer.MAX_VALUE ? 0 : length);
    }
}
