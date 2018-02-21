import java.io.IOException;
import java.util.Scanner;

{USERCODE}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        int n = sc.nextInt();
        System.out.println(solution.run(n));
        
    }
}