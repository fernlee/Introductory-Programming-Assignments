import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        ArrayList<Integer> fl = generate(100);
        System.out.print(fl);
    }
    public static ArrayList<Integer> generate(int n){
        ArrayList<Integer> factorList = new ArrayList<Integer>();
        for(int i=2;i<=n;i++){
            if (n%i==0){
                factorList.add(i);
                n = n/i;
                i = 1;
            }
        }
        return factorList;
    }
}
