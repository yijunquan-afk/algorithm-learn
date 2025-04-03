package graph.dfsbfs.flow;

/**
 * ClassName:Main
 * Package:graph.dfsbfs.flow
 * Description:
 *
 * @date:2025/2/25 20:23
 * @author: Junquan Yi
 */
import java.util.HashMap;
import java.util.Scanner;

class Main{
    static int[][] direactions = new int[][]{{1,0}, {-1,0}, {0, 1}, {0,-1}};
    static void dfs(int[][] grid, boolean[][]visited, int x, int y){
        if(visited[x][y]) return;
        visited[x][y] = true;
        for(int i = 0 ; i < 4 ; i++){
            int nextX = x + direactions[i][0];
            int nextY = y + direactions[i][1];
            if(nextX < 0 || nextY < 0 || nextX >= grid.length || nextY >= grid[0].length) continue;
            if(grid[x][y] > grid[nextX][nextY]) continue; //需要逆流
            dfs(grid, visited, nextX, nextY);
        }
        return;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] grid = new int[n][m];
        boolean[][] visited1 = new boolean[n][m];
        boolean[][] visited2 = new boolean[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                grid[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0 ; i < n ; i++){
            dfs(grid, visited1, i, 0); // 第一边界
            dfs(grid, visited2, i, m-1); // 第二边界
        }

        for(int j = 0 ; j < m; j++){
            dfs(grid, visited1, 0, j);
            dfs(grid, visited2, n-1, j);
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(visited1[i][j] && visited2[i][j]){
                    System.out.println(i + " " + j);
                }
            }
        }


    }
}
