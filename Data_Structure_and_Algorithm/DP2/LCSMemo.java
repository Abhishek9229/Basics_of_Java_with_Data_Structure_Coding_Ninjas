package Data_Structure_and_Algorithm.DP2;

import java.util.Scanner;

public class LCSMemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        int m = s1.length();
        int n = s2.length();
        System.out.println(LeastCommonSeq(s1,s2,m,n));

    }

    private static int LeastCommonSeq(String s1, String s2, int m, int n) {
        if(m==0 || n==0){
            return 0;
        }

        
        
    }
}
