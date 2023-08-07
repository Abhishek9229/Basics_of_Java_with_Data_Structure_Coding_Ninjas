package Data_Structure_and_Algorithm.DP2;

import java.util.Scanner;

public class MCPMemoization {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int graph [][]= new int[m][n];
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                graph[i][j]=s.nextInt();
            }
            
        }
        int memo[][]= new int [m+1][n+1];
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                memo[i][j]=-1;
            }
        }

        System.out.println(MinCost(graph,0,0, memo));
        s.close();
    }

    private static int MinCost(int[][] graph, int i, int j, int[][] memo) {
        int m = graph.length;
        int n = graph[0].length;
        if(i==m-1 && j==n-1){
            return graph[i][j];
        }

        if(i>=m || j>=n){
            return Integer.MAX_VALUE;
        }
        if(memo[i][j]!=-1){
            return memo[i][j];
        }

        int down = MinCost(graph, i+1, j, memo);
        int right = MinCost(graph, i, j+1, memo);
        int digo = MinCost(graph, i+1, j+1, memo);

        memo[i][j]= graph[i][j]+Math.min(right, Math.min(down, digo));
        return memo[i][j];
         
        
    }
}
