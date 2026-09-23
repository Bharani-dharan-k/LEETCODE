class Solution {
    private int time = 0;
    public List<List<Integer>> criticalConnections(
            int n,
            List<List<Integer>> connections) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (List<Integer> connection : connections) {
            int u = connection.get(0);
            int v = connection.get(1);

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int[] discovery = new int[n];
        int[] low = new int[n];
        Arrays.fill(discovery, -1);
        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (discovery[i] == -1) {
                dfs(i, -1, graph, discovery, low, answer);
            }
        }
        return answer;
    }
    private void dfs(
            int node,
            int parent,
            List<List<Integer>> graph,
            int[] discovery,
            int[] low,
            List<List<Integer>> answer) {
        discovery[node] = low[node] = time++;
        for (int neighbor : graph.get(node)) {
            if (neighbor == parent) {
                continue;
            }
            if (discovery[neighbor] == -1) {
                dfs(
                    neighbor,
                    node,
                    graph,
                    discovery,
                    low,
                    answer
                );
                low[node] = Math.min(
                    low[node],
                    low[neighbor]
                );
                if (low[neighbor] > discovery[node]) {

                    answer.add(
                        Arrays.asList(node, neighbor)
                    );
                }
            } else {
                low[node] = Math.min(
                    low[node],
                    discovery[neighbor]
                );
            }
        }
    }
}