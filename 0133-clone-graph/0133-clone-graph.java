/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) { 
        if(node==null){
            return null;
        }
        Map<Node,Node> clones=new HashMap<>();
        
        return dfs(node,clones);
    }
    public Node dfs(Node node,Map<Node,Node>clones){
         if (clones.containsKey(node)) {
            return clones.get(node);
        }
        Node clone=new Node(node.val);
        clones.put(node,clone);
        
         for (Node neighbor : node.neighbors) {
            clone.neighbors.add(dfs(neighbor, clones));
        }
        
        return clone;
    }
}