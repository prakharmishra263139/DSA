import java.util.*;

public class BFS {
    public static void bfs(int startNode, List<List<Integer>> list) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[list.size()];

        queue.add(startNode);
        visited[startNode] = true;

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            for (int neighbor : list.get(currentNode)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numberOfNodes = 6;

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numberOfNodes; i++) {
            list.add(new ArrayList<>());
        }

        list.get(0).add(1);
        list.get(0).add(2);
        list.get(1).add(3);
        list.get(1).add(4);
        list.get(2).add(4);
        list.get(3).add(5);
        list.get(4).add(5);

        bfs(0, list);
    }
}