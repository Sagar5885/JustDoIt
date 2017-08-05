package LogicalExampleLeetCode;

/**
 * Created by sdodia on 6/28/17.
 */
public class ReversePairs {
    class Node {
        int value, count;
        Node left, right;
        Node (int v) {
            value = v; count = 1;
        }
    }

    public int reversePairs(int[] nums) {
        int result = 0;
        if (nums == null || nums.length <= 1) return result;

        int len = nums.length;
        Node root = new Node(nums[len - 1]);

        for(int i = len - 2; i >= 0; i--) {
            result += query(root, nums[i] / 2.0);
            insert(root, nums[i]);
        }

        return result;
    }

    private Node insert(Node root, int value) {
        if (root == null) return new Node(value);

        if (root.value == value) {
            root.count++;
        }
        else if (root.value > value) {
            root.count++;
            root.left = insert(root.left, value);
        }
        else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    private int query(Node root, double value) {
        if (root == null) return 0;

        if (value > root.value) {
            return root.count + query(root.right, value);
        }
        else {
            return query(root.left, value);
        }
    }

    public static void main(String args[]){
        ReversePairs rp = new ReversePairs();

        int[] a1 = {1,3,2,3,1};
        System.out.println("No of Reverse Pairs for a1: "+rp.reversePairs(a1));

//        int[] a2 = {2,4,3,5,1};
//        System.out.println("No of Reverse Pairs for a2: "+rp.reversePairs(a2));
    }
}
