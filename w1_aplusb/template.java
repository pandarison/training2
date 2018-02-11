import java.io.IOException;
import java.util.Scanner;

{USERCODE}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Solution x = new Solution();
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(x.run(a, b));
        }
        
    }
}