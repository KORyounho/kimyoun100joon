import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        char[] charArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < str.length(); i++) {
            charArr[str.charAt(i) - 'A']++;
        }

        int count = 0;
        int most = charArr[0];
        char c = 'A';
        for (int i = 1; i < charArr.length; i++) {
            if (charArr[i] > most) {
                most = charArr[i];
                c = (char) (i + 'A');
            } else if (charArr[i] == most) {
                c = '?';
            }
        }
        System.out.println(c);
    }
}