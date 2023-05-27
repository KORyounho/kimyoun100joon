import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {
        int[] point = new int[2];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        point[0] = Integer.parseInt(br.readLine());
        point[1] = Integer.parseInt(br.readLine());

        if(point[0]>0 && point[1]>0){
            System.out.println("1");
        }
        else if (point[0]>0 && point[1]<0){
            System.out.println(4);
        }
        else if(point[0]<0 && point[1]>0) {
            System.out.println(2);
        }
        else
            System.out.println(3);
    }
}