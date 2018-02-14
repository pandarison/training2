import java.io.IOException;
import java.util.Scanner;

{USERCODE}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Solution x = new Solution();
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        for(int i=0; i<x; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            solution.setFamily(a,b);
        }
        for(int i=0; i<y; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(solution.isFamily(a,b)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        
    }
}