import java.util.Scanner;

public class Sort01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=s.nextInt();
        }
        
        print(sort(arr));

        s.close();
    }

    private static void print(int[] sort) {
        for(int i=0; i<sort.length; i++){
            System.out.print(sort[i]+" ");
        }
    }

    private static int[] sort(int[] arr) {
        int cnt0 =0;
        int cnt1 =0;
        int n = arr.length;
        for(int i =0; i<n; i++){
            if(arr[i]==0){
                cnt0++;

            }else{
                cnt1++;
            }
        }
        for(int i=0; i<cnt0; i++){
            arr[i]=0;
        }
        for(int i=0; i<cnt1; i++){
            arr[i]=1;
        }
        return arr;
    }
    
}
