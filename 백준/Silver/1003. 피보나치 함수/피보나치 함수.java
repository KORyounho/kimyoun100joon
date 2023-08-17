import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static int[] n1 = new int[41];
    static int[] n2 = new int[41];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            fibo(num);
        }
        System.out.println(sb);
    }

    static void fibo(int num) {
        n1[0] = 1;
        n2[0] = 0;
        //배열에 계산값을 더하며 반복 계산을 하지 않기 위한 처리
        if (n1[40] == 0) {
            for (int i = 1; i < 41; i++) {
                n1[i] = n2[i - 1];
                n2[i] = n1[i - 1] + n1[i];
            }
        }
        
        sb.append(n1[num] + " " + n2[num]).append("\n");

    }
}
