package Data_Structure_and_Algorithm.DP2;

import java.util.Scanner;

public class MCP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int graph[][]= new int[m][n];
        for(int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                graph[i][j]=s.nextInt();
            }
        }
        System.out.println(MinPath(graph, 0, 0));
    }

    private static int MinPath(int[][] graph, int i, int j) {
        int m = graph.length;
        int n = graph[0].length;
        if(i==m-1 && j==n-1){
            return graph[i][j];
        }

        if(i>=m || j>=n){
            return Integer.MAX_VALUE;
        }

        int down = MinPath(graph, i+1, j);
        int right = MinPath(graph, i, j+1);
        int digo = MinPath(graph, i+1, j+1);

        return graph[i][j]+Math.min(right, Math.min(down, digo));
         
        
    }
    
}
