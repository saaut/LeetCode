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
        
    Node clone=new Node(node.val);
    Map<Node,Node> clones=new HashMap<>();//node와 clone을 비교하기 위한 clones
    clones.put(node,clone);  
    
    Queue<Node> queue = new ArrayDeque<>();
    queue.offer(node);
     
    while(!queue.isEmpty()){
        Node current = queue.poll();
        //노드 삭제하고
        //노드에 이웃이 있는지 확인
        for(Node n: current.neighbors){
            if(!clones.containsKey(n)){//이웃 중복검사

                queue.offer(n);//이웃들 큐에 추가
                Node neighborClone=new Node(n.val);//이웃을 복제. value
                clones.put(n,neighborClone);//목제한 이웃을 clones에 넣음.
            }
          clones.get(current).neighbors.add(clones.get(n));
        }
    }
        return clone;
    }
}