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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public Node cloneGraph(Node node) {
    if(node==null)
        return null;
    Map<Node,Node> clones=new HashMap<>();
    return dfs(node,clones);
    }
    
    
    public Node dfs(Node node,Map<Node,Node>clones){
    if(clones.containsKey(node)){
        return clones.get(node);
    }
    Node clone=new Node(node.val,new ArrayList<Node>());
    clones.put(node,clone);
        
     for(Node n:node.neighbors){
         clone.neighbors.add(dfs(n,clones));
     }   
        
        return clone;
        
    }
}