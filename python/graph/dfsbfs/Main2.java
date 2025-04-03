package graph.dfsbfs;

/**
 * ClassName:Main2
 * Package:graph.dfs
 * Description:
 *
 * @date:2025/2/24 17:06
 * @author: Junquan Yi
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;


public class Main2{
    static List<List<Integer>> result = new LinkedList<>();
    static List<Integer> path = new LinkedList<>();

    static void dfs( List<LinkedList<Integer>> graph, int source, int n){
        if(source == n){
            result.add(new LinkedList<>(path));
            return;
        }
        for(int i:graph.get(source)){
            path.add(i);
            dfs(graph, i, n);
            path.remove(path.size()-1);

        }
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<LinkedList<Integer>> graph = new ArrayList<>(n+1);
        for (int i = 0; i <= n; i++) {
            graph.add(new LinkedList<>());
        }
        for(int i = 0 ; i < m ; i++){
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            graph.get(v1).add(v2);
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

