package LogicalExampleHackerrank;

import DataStructure.BST.Node;

/**
 * Created by sdodia on 6/29/17.
 */
public class KittyCalculationsOnTree {
    //Binary Tree Node
    public class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static Node root;

    public KittyCalculationsOnTree(){
        this.root = null;
    }

    //Insert Element in BST
    public void insert(int a){
        Node nd = new Node(a);
        if(root == null){
            root = nd;
            return;
        }

        while(true){
            if(root.left == null){
                root.left = nd;
                break;
            }else if(root.right == null){
                root.right = nd;
                break;
            }else if(root.left != null){
                nd = nd.left;
            }else if(root.right != null){
                nd = nd.right;
            }
        }
    }


    public boolean checkPairAdj(int a, int b){
        Node rt = root;
        if(rt == null){
            return false;
        }

        Node nda = new Node(a);
        Node ndb = new Node(b);

        while(true){
            if(rt.left != null){
                if((rt.left == nda && rt == ndb) || (rt.left == ndb && rt == nda)){
                    return true;
                }else {
                    rt = rt.left;
                }
            }
            if(rt.right != null){
                if((rt.right == nda && rt == ndb) || (rt.right == ndb && rt == nda)){
                    return true;
                }else {
                    rt = rt.right;
                }
            }
            if(rt.left == null && rt.right == null){
                return false;
            }
        }
    }

    public int dist(int a, int b){
        Node rt = root;
        if(rt == null){
            return 0;
        }
        //find distance

        return 0;
    }

    public int Calc(int a, int b){
        int dist = dist(a,b);
        int res = a*b*dist;

        return res;
    }
}
