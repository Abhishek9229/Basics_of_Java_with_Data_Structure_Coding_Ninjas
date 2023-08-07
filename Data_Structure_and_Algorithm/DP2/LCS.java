package Data_Structure_and_Algorithm.DP2;

import java.util.Scanner;

public class LCS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        int m = s1.length();
        int n = s2.length();
        System.out.println(leastCountSub(s1,s2,m,n));
        s.close();
    }

    private static int leastCountSub(String s1, String s2, int m, int n) {
        if(m==0 || n==0){
            return 0;
        }
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return 1+leastCountSub(s1, s2, m-1, n-1);
        }else{
            return Math.max(leastCountSub(s1, s2, m-1, n), leastCountSub(s1, s2, m, n-1));
            
        }
        
    }
    
}
