import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int large = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i<9; i++){
            int number = Integer.parseInt(br.readLine());
            if(large < number){
                large = number;
                count = i+1;
            }
        }
        System.out.println(large + "\n" + count);

    }
}