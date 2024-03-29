import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [][]arr = new int[N][2];

        StringTokenizer st;
        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (e1, e2)->{
            if(e1[1] == e2[1])
                return e1[0] - e2[0];
            return e1[1] - e2[1];
        });
        int prev_end = 0;
        int count = 0;
        for(int i = 0; i<N; i++){
            if(prev_end <=arr[i][0]){
                count++;
                prev_end = arr[i][1];
            }
        }
        System.out.println(count);

    }
}