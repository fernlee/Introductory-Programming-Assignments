import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int x;
        x = 0;
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(x<n) {
            System.out.print("*");
            x++;
        }
    }
}