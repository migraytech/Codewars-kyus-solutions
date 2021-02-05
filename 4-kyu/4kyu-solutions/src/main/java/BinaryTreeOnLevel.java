import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeOnLevel {

    public static void main(String[] args) {

        Node node = new Node(new Node(null, new Node(null, null, 4), 2), new Node(new Node(null, null, 5), new Node(null, null, 6), 3), 1);

        System.out.print(treeByLevels(node));
    }


    public static class Node {
        public Node left;
        public Node right;
        public int value;


        public Node(Node l, Node r, int v) {
            left = l;
            right = r;
            value = v;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "left=" + left +
                    ", right=" + right +
                    ", value=" + value +
                    '}';
        }
    }


    public static List<Integer> treeByLevels(Node node) {


        List<Integer> solution = new ArrayList<Integer>();
        LinkedList<Node> queue = new LinkedList<Node>();
        // 1 hoofd node
        queue.add(node);

        int position = 0;
        Node currentNode;

        if (node == null)
            return solution;

        while (!queue.isEmpty()) {
            //levels bij houden

                currentNode = queue.pollFirst();
                // create
                solution.add(currentNode.value);
                if(currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null)
                    queue.add(currentNode.right);
        }
        return solution;
    }






}

