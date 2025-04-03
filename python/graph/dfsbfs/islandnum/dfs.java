package graph.dfsbfs.islandnum;

import java.util.Scanner;

/**
 * ClassName:dfs
 * Package:graph.dfsbfs.islandnum
 * Description:
 *
 * @date:2025/2/24 19:54
 * @author: Junquan Yi
 */
public class dfs {
    static int[][] direactions = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}}; // 左、上、右、下
    static boolean[][] dfs(int[][]grid, boolean[][]visited, int i, int j){
        for(int k = 0 ; k < 4 ; k++){
            int x = i + direactions[k][0];
            int y = j + direactions[k][1];
            if(x >= grid.length || x < 0 || y >= grid[0].length || y < 0) continue; // 越界了
            if(!visited[x][y] && grid[x][y]==1){ // 未被访问过且可达的陆地，构成一个岛屿
                visited[x][y] = true;
                visited = dfs(grid, visited, x, y);
            }
        }
        return visited;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] grid = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < m ; j++){
                grid[i][j] = scanner.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        int result = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < m ; j++){
                if(!visited[i][j] && grid[i][j]==1){
                    result++;
                    visited[i][j] = true;
                    visited = dfs(grid, visited, i, j);
                }
            }
        }
        System.out.print(result);
    }
}
