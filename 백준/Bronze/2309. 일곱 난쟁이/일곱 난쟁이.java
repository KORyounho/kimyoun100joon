import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) throws IOException {
        int[] fake = new int[9];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            fake[i] = Integer.parseInt(br.readLine());
        }
        int a = 0;
        int b = 0;
        int count = 0;
        
        Arrays.sort(fake);
        int sum = 0;
        for(int i = 0; i<9; i++){
            sum = sum+fake[i];
        }
        for (int i = 0; i < 9; i++) {
            for (int j = i; j < 9; j++) {
                if ((fake[i] + fake[j]) == sum-100) {
                    a = i;
                    b = j;
                    count++;
                    break;
                }
            }
            if (count == 1)
                break;
        }
        int i = 0;
        while (i < 9) {
            if ((i == a) || (i == b)) {
                i++;
                continue;
            }
            System.out.println(fake[i]);
            i++;
        }
    }
}