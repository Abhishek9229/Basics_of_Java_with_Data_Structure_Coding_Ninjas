import java.util.Scanner;

public class SwapAlter {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t = s.nextInt();
        for(int i =0; i<t; i++){
            int n = s.nextInt();
            int arr[]= new int[n];
            for(int j =0; j<n; j++){
                arr[j]=s.nextInt();
            }
            System.out.println();
            print(swap(arr));
            s.close();

        }
    }

    private static void print(int[] swap) {
        for(int i =0; i<swap.length; i++){
            System.out.print(swap[i]+" ");
        }
    }

    private static int[] swap(int[] arr) {
        for(int i=1; i<arr.length; i+=2){
            int temp = arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
           

        }
        return arr;
    }
}
