import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void solution(Queue<Integer> queue){
        sb.append(queue.remove()).append(" ");
        queue.add(queue.remove());
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i<size; i++){
            queue.offer(i+1);
        }

        while(queue.size() > 1){
            solution(queue);
        }

        sb.append(queue.remove());

        System.out.println(sb);
    }

}
