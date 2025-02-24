package graph.dfs;

/**
 * ClassName:Main
 * Package:graph.dfs
 * Description:
 *
 * @date:2025/2/24 17:06
 * @author: Junquan Yi
 */
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;


public class Main{
    static List<List<Integer>> result = new LinkedList<>();
    static List<Integer> path = new LinkedList<>();

    static void dfs(int[][] graph, int source, int n){
        if(source == n){
            result.add(new LinkedList<>(path));
            return;
        }
        for(int i = 1 ; i <= n ; i++){
            if(graph[source][i]==1){
                path.add(i);
                dfs(graph, i, n);
                path.remove(path.size()-1);
            }
        }
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] graph = new int[n + 1][n + 1]; // 邻接矩阵
        for(int i = 0 ; i < m ; i++){
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            graph[v1][v2] = 1;
        }
        path.add(1);
        dfs(graph, 1, n);
        if (result.isEmpty()) System.out.println(-1);
        for(List<Integer> temp : result){
            int k = temp.size();
            for(int i = 0 ; i < k-1 ; i++){
                System.out.print(temp.get(i) + " ");
            }
            System.out.println(temp.get(k-1));
        }


    }

}
