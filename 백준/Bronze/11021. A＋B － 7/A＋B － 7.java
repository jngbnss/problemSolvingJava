

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int idx = 1;
        while(t-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Case #"+idx+": "+(a+b));
            idx++;
        }
    }
}
