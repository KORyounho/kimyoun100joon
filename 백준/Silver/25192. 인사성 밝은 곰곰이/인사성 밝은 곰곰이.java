import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        HashSet<Object> store = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i<N; i++){
            String s = br.readLine();
            if(s.equals("ENTER")){
                count = count + store.size();
                store.clear();
            }
            else
                store.add(s);
        }
        System.out.println(count+store.size());
    }
}