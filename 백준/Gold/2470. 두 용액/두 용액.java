import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.Key;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int pl = 0;
        int pr = arr.length-1;

        int min = arr[pl];
        int max = arr[pr];
        int gap = arr[pl] + arr[pr];
        int abs = Math.abs(arr[pl] + arr[pr]);
        int i = 1;
        while(pr-1>pl){
            

            if(arr[pl]+arr[pr] < 0){
                pl++;
                
            }
            else {
                pr--;
                
            }
            if(abs > Math.abs(arr[pl]+arr[pr])){
                min = arr[pl];
                max = arr[pr];
                gap = arr[pl]+arr[pr];
                abs = Math.abs(arr[pl]+arr[pr]);
                
            }
            
        }
        System.out.println(min + " " + max);
    }
}