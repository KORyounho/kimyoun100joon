import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double eval = 0;
        int totalScore = 0;
        for(int i = 0; i<20; i++){
            String subject = br.readLine();
            String [] subjectArr = subject.split(" ");
            if(subjectArr[2].charAt(0) == 'A'){
                eval = eval + 4 * (int) (subjectArr[1].charAt(0) - '0');
            }
            else if(subjectArr[2].charAt(0) == 'B'){
                eval = eval + 3 * (int) (subjectArr[1].charAt(0) - '0');
            }
            else if(subjectArr[2].charAt(0) == 'C'){
                eval = eval + 2 * (int) (subjectArr[1].charAt(0) - '0');
            }
            else if(subjectArr[2].charAt(0) == 'D'){
                eval = eval + 1 * (int) (subjectArr[1].charAt(0) - '0');
            }
            else if(subjectArr[2].charAt(0) == 'P'){
                continue;
            }
            else if(subjectArr[2].charAt(0)== 'F'){
                eval = eval + 0;
                totalScore = totalScore + (int)(subjectArr[1].charAt(0) - '0');
                continue;
            }
            

            if(subjectArr[2].charAt(1) == '+'){
                eval = eval + 0.5 * (int) (subjectArr[1].charAt(0) - '0');
            }

            totalScore = totalScore + (int) (subjectArr[1].charAt(0) - '0');
        }
        eval = eval / totalScore;
        System.out.println(eval);   
    }
}
