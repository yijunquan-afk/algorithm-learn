package graph.dfsbfs.islandTotalArea;

/**
 * ClassName:Main
 * Package:graph.dfsbfs.islandTotalArea
 * Description:
 *
 * @date:2025/2/25 12:48
 * @author: Junquan Yi
 */
import java.util.Scanner;

class Main{

    static int count = 0;
    static int[][] direactions = new int[][]{{1, 0}, {-1, 0}, {0,1}, {0,-1}};
    static void dfs(int[][]grid, int x, int y){
        count++;
        grid[x][y] = 0; // 陆地变成海洋
        for(int i = 0 ; i < 4 ; i++){
            int nextX = x + direactions[i][0];
            int nextY = y + direactions[i][1];
            if(nextX < 0 || nextY < 0 || nextX >= grid.length || nextY >= grid[0].length) continue;
            if(grid[nextX][nextY] == 1){
                dfs(grid, nextX, nextY);
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][]grid = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                grid[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0 ; i < n ; i++){
            if(grid[i][0]==1) dfs(grid, i , 0);
            if(grid[i][m-1]==1)dfs(grid, i, m-1);
        }
        for(int j = 0 ; j < m ; j++){
            if(grid[0][j]==1) dfs(grid, 0, j);
            if(grid[n-1][j]==1) dfs(grid, n-1, j);
        }// 从边边转化为海洋
        count = 0;
        for(int i = 1 ; i < n-1 ; i++){
            for(int j = 1 ; j < m - 1; j++){
                if(grid[i][j]==1){
                    dfs(grid, i, j);
                }
            }
        }
        System.out.print(count);
    }

}
