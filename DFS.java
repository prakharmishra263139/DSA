import java.util.*;

public class DFS {
    public static void dfs(int startNode, List<List<Integer>> adjacencyList, boolean[] visited) {
        System.out.print(startNode + " ");
        visited[startNode] = true;

        for (int neighbor : adjacencyList.get(startNode)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adjacencyList, visited);
            }
        }
    }

    public static void main(String[] args) {
        int numberOfNodes = 6;
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < numberOfNodes; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        adjacencyList.get(0).add(1);
        adjacencyList.get(0).add(2);
        adjacencyList.get(1).add(3);
        adjacencyList.get(1).add(4);
        adjacencyList.get(2).add(4);
        adjacencyList.get(3).add(5);
        adjacencyList.get(4).add(5);

        boolean[] visited = new boolean[numberOfNodes];
        System.out.print("DFS Traversal: ");
        dfs(0, adjacencyList, visited);
    }
}