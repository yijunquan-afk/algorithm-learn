package graph.dfsbfs.islandnum;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * ClassName:bfs
 * Package:graph.dfsbfs.islandnum
 * Description:
 *
 * @date:2025/2/24 19:54
 * @author: Junquan Yi
 */
public class bfs {
    static int[][] direactions = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}}; // 左、上、右、下
    static boolean[][] bfs(int[][]grid, boolean[][]visited, int i, int j){
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.add(new int[]{i,j});
        visited[i][j] = true;
        while(!queue.isEmpty()){
            int curX = queue.peek()[0];
            int curY = queue.poll()[1];//当前横纵坐标
            for(int k = 0 ; k < 4 ; k++){
                int nextX = curX + direactions[k][0];
                int nextY = curY + direactions[k][1];
                if(nextX >= grid.length || nextX < 0 || nextY >= grid[0].length || nextY < 0) continue; // 越界了
                if(!visited[nextX][nextY] && grid[nextX][nextY]==1){ // 未被访问过且可达的陆地，构成一个岛屿
                    visited[nextX][nextY] = true;
                    queue.add(new int[]{nextX, nextY});
                }

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
                    visited = bfs(grid, visited, i, j);
                }
            }
        }
        System.out.print(result);
    }
}
