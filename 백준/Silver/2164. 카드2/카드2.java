import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> que = new ArrayDeque<>();
        int count = 0;
        int num = Integer.parseInt(br.readLine());

        for(int i = 1; i<=num; i++) {
            que.addLast(i);
        }

        for(int i = 0; que.size()!=1; i++){
            if(i%2 == 0){
                que.removeFirst();

            }
            else{
                int a = que.getFirst();
                que.removeFirst();
                que.addLast(a);
            }
            count = i;
        }

        System.out.println(que.peekFirst());
    }

}