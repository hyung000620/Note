import java.util.*;
class Node{ 
    int data; 
    Node lt, rt; // 부모의 왼쪽 자식, 오른쪽 자식
    public Node(int val) { 
        data=val; 
        lt=rt=null; 
    } 
} 
  
public class Main{ 
    Node root; 
    public void DFS(Node root){ 
        if(root==null) 
            return; 
        else{ // 순회 기준은 부모.
          System.out.print(root.data+" "); //전위 순회 : 부모 - 왼쪽 - 오른쪽.
			    DFS(root.lt);
			    System.out.print(root.data+" "); //중위 순회 : 왼쪽 - 부모 - 오른쪽.
			    DFS(root.rt);
          System.out.print(root.data+" "); // 후위 순회 : 왼쪽 - 오른쪽 - 부모.
		}
    } 
  
    public static void main(String args[]) { int a[] int[] a
        Main tree=new Main(); 
        tree.root=new Node(1); 
        tree.root.lt=new Node(2); 
        tree.root.rt=new Node(3); 
        tree.root.lt.lt=new Node(4); 
        tree.root.lt.rt=new Node(5); 
		    tree.root.rt.lt=new Node(6); 
        tree.root.rt.rt=new Node(7);
        tree.DFS(tree.root); 
    } 
} 
