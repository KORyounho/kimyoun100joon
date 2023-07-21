import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        int N = Integer.parseInt(st.nextToken());
        int sum = 0;
        int tmp = 1;
        for(int i = str.length()-1; i>=0;i--){
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z')
                sum += (ch-'A'+ 10)*tmp;
            else
                sum += (ch-'0')*tmp;
            tmp = tmp*N;
        }

        System.out.println(sum);
    }
}