class Solution {
    HashMap<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        if(map.containsKey(node)) {
            return map.get(node);
        }
        map.put(node, new Node(node.val));
        for (Node val : node.neighbors) {
            map.get(node).neighbors.add(cloneGraph(val));
        }
        return map.get(node);
        
    }
}
