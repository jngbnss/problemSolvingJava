
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = n/4;
        String s="";
        for(int i=0;i<ret;i++){
            s+="long ";
        }
        System.out.println(s+"int");

    }
}
