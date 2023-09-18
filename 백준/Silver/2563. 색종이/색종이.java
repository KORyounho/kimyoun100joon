import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    boolean [][]square = new boolean[100][100];
        
    for(int i = 0; i<count; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j = x; j< x + 10; j++){
                for(int k = y; k < y+10; k++){
                    square[j][k] = true;
                }
            }
        }
        
        int countTrue = 0;
        for(int i = 0; i<100; i++){
            for(int j = 0; j<100; j++){
                if(square[i][j] == true){
                    countTrue++;
                }
            }
        }

        System.out.println(countTrue);
    }
    
}