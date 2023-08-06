import java.util.Scanner;

public class LinearSearch {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t!=0){
            int n = s.nextInt();

            int arr[] = new int [n];
            for(int i =0; i<n; i++){
                arr[i]=s.nextInt();
            }
            int k = s.nextInt();
            System.out.println(Search(arr, k));
            t--;
        }
        s.close();
        
    }

    private static int Search(int[] arr, int k) {
        for(int i =0; i<arr.length; i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;

        
    }
}
