package DataStructure.BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by sdodia on 6/28/17.
 */
public class BSTImpl {

    public static Node root;

    public BSTImpl(){
        this.root = null;
    }

    //Find Element from BST
    public boolean find(int a){
        Node nd = root;

        while(nd != null){
            if(nd.data == a){
                return true;
            }else if(nd.data>a){
                nd = nd.left;
            }else {
                nd = nd.right;
            }
        }
        return false;
    }

    //Insert Element in BST
    public void insert(int a){
        Node nd = new Node(a);
        if(root == null){
            root = nd;
            return;
        }

        Node current = root;
        Node parent = null;
        while(true){
            parent = current;
            if(current.data>a){
                current = current.left;
                if(current == null){
                    parent.left = nd;
                    return;
                }
            }else {
                current = current.right;
                if(current == null){
                    parent.right = nd;
                    return;
                }
            }
        }
    }

    public boolean delete(int id){
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current.data!=id){
            parent = current;
            if(current.data>id){
                isLeftChild = true;
                current = current.left;
            }else{
                isLeftChild = false;
                current = current.right;
            }
            if(current ==null){
                return false;
            }
        }
        //if i am here that means we have found the node
        //Case 1: if node to be deleted has no children
        if(current.left==null && current.right==null){
            if(current==root){
                root = null;
            }
            if(isLeftChild ==true){
                parent.left = null;
            }else{
                parent.right = null;
            }
        }
        //Case 2 : if node to be deleted has only one child
        else if(current.right==null){
            if(current==root){
                root = current.left;
            }else if(isLeftChild){
                parent.left = current.left;
            }else{
                parent.right = current.left;
            }
        }
        else if(current.left==null){
            if(current==root){
                root = current.right;
            }else if(isLeftChild){
                parent.left = current.right;
            }else{
                parent.right = current.right;
            }
        }else if(current.left!=null && current.right!=null){

            //now we have found the minimum element in the right sub tree
            Node successor	 = getSuccessor(current);
            if(current==root){
                root = successor;
            }else if(isLeftChild){
                parent.left = successor;
            }else{
                parent.right = successor;
            }
            successor.left = current.left;
        }
        return true;
    }

    public Node getSuccessor(Node deleleNode){
        Node successsor =null;
        Node successsorParent =null;
        Node current = deleleNode.right;
        while(current!=null){
            successsorParent = successsor;
            successsor = current;
            current = current.left;
        }
        //check if successor has the right child, it cannot have left child for sure
        // if it does have the right child, add it to the left of successorParent.
//		successsorParent
        if(successsor!=deleleNode.right){
            successsorParent.left = successsor.right;
            successsor.right = deleleNode.right;
        }
        return successsor;
    }

    public void display(Node root){
        if(root!=null){
            display(root.left);
            System.out.print(" " + root.data);
            display(root.right);
        }
    }

    public void Preorder(Node root) {
        Stack<Node> st = new Stack<Node>();
        st.push(root);

        while(!st.isEmpty()){
            Node currentNode = st.pop();
            if(currentNode.right != null){
                st.push(currentNode.right);
            }
            if(currentNode.left != null){
                st.push(currentNode.left);
            }
            System.out.print(currentNode.data+" ");
        }
    }

    public void Postorder(Node root){
        if(root == null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
    }

    public int height(Node root){
        int leftheight = 0;
        int rightheight = 0;

        if(root != null){
            if(root.left != null){
                leftheight = height(root.left);
            }
            if(root.right != null){
                rightheight = height(root.right);
            }
        }
        return leftheight > rightheight ? leftheight+1 : rightheight+1;
    }

    public void top_view(Node root){
        Node cur = root;
        Stack<Node> st = new Stack<Node>();
        while(cur != null){
            st.push(cur);
            cur = cur.left;
        }

        while(!st.isEmpty()){
            Node p = st.pop();
            System.out.print(p.data+" ");
        }

        cur = root.right;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.right;
        }
    }

    public void LevelOrder(Node root){
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while(!q.isEmpty()){
            Node n = q.remove();
            if(n.left != null){
                q.add(n.left);
            }
            if(n.right != null){
                q.add(n.right);
            }
            System.out.print(n.data+" ");
        }
    }


//    boolean checkBST(Node root) {
//        Queue<Node> q = new LinkedList<Node>();
//        q.add(root);
//        while(!q.isEmpty()){
//            Node n = q.remove();
//            if(n.left != null){
//                if(n.left.data>n.data){
//                    return false;
//                }else {
//                    q.add(n.left);
//                }
//            }
//            if(n.right != null){
//                if(n.right.data<n.data){
//                    return false;
//                }else {
//                    q.add(n.right);
//                }
//            }
//        }
//        return true;
//    }

    //Better Solution then above
    boolean checkBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE,
                Integer.MAX_VALUE);
    }

    boolean isBSTUtil(Node node, int min, int max)
    {
        if (node == null)
            return true;

        if (node.data < min || node.data > max)
            return false;

        return (isBSTUtil(node.left, min, node.data-1) &&
                isBSTUtil(node.right, node.data+1, max));
    }

    public void decode(String S, Node root){

	/*A - 1
	B - 00
	C - 01*/
        StringBuilder output = new StringBuilder();
        Node base = root;
        while (!S.isEmpty()){
            if (S.charAt(0) == '1'){
                base = base.right;
                S = S.substring(1);
            }
            else {
                base = base.left;
                S = S.substring(1);
            }
            if (base.left == null && base.right == null){
                output.append(base.data);
                base = root;
            }

        }
        System.out.println(output.toString());
    }


    public static void main(String args[]){
        BSTImpl b = new BSTImpl();
        b.insert(3);b.insert(8);
        b.insert(1);b.insert(4);b.insert(6);b.insert(2);b.insert(10);b.insert(9);
        b.insert(20);b.insert(25);b.insert(15);b.insert(16);
        System.out.println("Original Tree : ");
        b.display(b.root);
        System.out.println("");
        System.out.println("Check whether Node with value 4 exists : " + b.find(4));
        System.out.println("Delete Node with no children (2) : " + b.delete(2));
        b.display(root);
        System.out.println("\n Delete Node with one child (4) : " + b.delete(4));
        b.display(root);
        System.out.println("\n Delete Node with Two children (10) : " + b.delete(10));
        b.display(root);
        System.out.println();
        System.out.println("Preorder:");
        b.Preorder(root);
        System.out.println();
        System.out.println("Postorder:");
        b.Postorder(root);
        System.out.println();
        System.out.println("Height of Root: "+b.height(root));
        System.out.println("Top View: ");
        b.top_view(root);
        System.out.println();
        System.out.println("Level Order: ");
        b.LevelOrder(root);
        System.out.println();
        System.out.println("Check BST: "+b.checkBST(root));
    }
}
