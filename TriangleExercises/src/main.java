import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int i = 0;
        int j = 0;
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(i<n) {
            i++;
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}