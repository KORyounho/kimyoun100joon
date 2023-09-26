import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List list = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String [] strArr = str.split(" ");
        int size = Integer.parseInt(strArr[0]);
        int delete = Integer.parseInt(strArr[1]);

        int [] printArr = new int[size];
        for(int i = 0; i<size; i++){
            list.add(i+1);
        }
        
        int count = 0;
        int i = 0;
        while(!list.isEmpty()){
            count = (count-1 + delete) % size--;
            printArr[i++] = (int) list.remove(count);
        }

        System.out.print("<");
        for(int j = 0; j<printArr.length; j++){
            if(j == printArr.length-1){
                System.out.print(printArr[j]);
            }
            else {
                System.out.print(printArr[j] + ", ");
            }
        }
        System.out.println(">");
    }
}