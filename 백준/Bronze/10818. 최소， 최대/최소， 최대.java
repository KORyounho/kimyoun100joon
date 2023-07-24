import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for(int i = 0; i<N; i++){
            int a = Integer.parseInt(st.nextToken());
            small = Math.min(small, a);
            large = Math.max(large, a);
        }
        System.out.println(small + " " + large);
    }
}