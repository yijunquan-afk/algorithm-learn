package graph.islandRound;

/**
 * ClassName:Main
 * Package:graph.islandRound
 * Description:
 *
 * @date:2025/2/27 16:44
 * @author: Junquan Yi
 */
import java.util.Scanner;
class Main{
    //
    static int[][]direactions = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

    static int getCount(int[][]grid, int x, int y){
        int count = 0;
        for(int i = 0 ; i < 4 ; i++){
            int nextX = x + direactions[i][0];
            int nextY = y + direactions[i][1];
            if(nextX < 0 || nextY < 0 || nextX >= grid.length || nextY >= grid[0].length){
                count++;
                continue;
            }// 遇到边界
            if(grid[nextX][nextY] == 0) count++; // 遇到水
        }
        return count;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] grid = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                grid[i][j] = scanner.nextInt();
            }
        }
        int result = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j]==1){
                    result += getCount(grid, i, j);
                }
            }
        }
        System.out.print(result);
    }


}
