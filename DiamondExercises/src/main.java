import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int i = 0;
        int j = 0;
        int k = 0;
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(i<n) {
            i++;
            if (i == n){
                System.out.println("LiYae");
                break;
            }
            for (k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for(j=0;j<i*2-1;j++){
                System.out.print("*");
            }
            for (k=0;k<n-i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
        while(i>0){
            i--;
            for (k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for(j=0;j<i*2-1;j++){
                System.out.print("*");
            }
            for (k=0;k<n-i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}