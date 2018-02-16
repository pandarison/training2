import java.io.IOException;
import java.util.Scanner;

{USERCODE}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        int L = sc.nextInt();
        solution.setRoad(L);
        int m = sc.nextInt();
        for (int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            solution.removeTrees(a,b);
        }
        System.out.println(solution.getTrees());
        
    }
}