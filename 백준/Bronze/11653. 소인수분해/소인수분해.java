import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static StringBuilder factorization(int number) {
        StringBuilder sb = new StringBuilder();
        
        int i = 2;
        while(number > 1){
            if(number % i  == 0){
                sb.append(i).append('\n');
                number = number/i;
            }
            else
                i = i+1;
        }
        return sb;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(factorization(n));
    }
}