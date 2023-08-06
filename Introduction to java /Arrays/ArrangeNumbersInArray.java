import java.util.Scanner;

public class ArrangeNumbersInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i =0; i<t; i++){
            int n = s.nextInt();
            int arr[]= new int[n];
            print(Arrange(arr, n));
        }
    }

    private static void print(int[] arr) {
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int[] Arrange(int[] arr, int n) {
        int cnt =0;
        for(int i =1; i<=n; i++){
            if(i%2==1){
                arr[cnt]=i;
                cnt++;
            }
            
        }
        for(int i =1; i<=n; i++){
            if(i%2==0){
                arr[cnt]=i;
                cnt++;
            }
        }
        return arr;
    }
}
