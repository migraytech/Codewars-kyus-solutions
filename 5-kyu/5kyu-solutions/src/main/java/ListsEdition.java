import java.util.*;

public class ListsEdition {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(17, new ListNode(1));
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(16);
        ListNode l6 = new ListNode(7, new ListNode(3));
        TreeNode root = new TreeNode(l1, new TreeNode(l2, new TreeNode(l4), null), new TreeNode(l3, new TreeNode(l5), new TreeNode(l6)));

        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(7, new ListNode(16, new ListNode(17))))));


        System.out.print(expected.toString());
        System.out.print("\n");
        System.out.print(flatten(root).toString());


    }
    public static ListNode flatten(TreeNode root) {

        if(root == null) return  null;


        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        LinkedList<Integer> list = new LinkedList<>();


        TreeNode node = null;
        ListNode listNode = null;

        // array
        while(!queue.isEmpty())
        {
            node =  queue.pollFirst();
            listNode = node.value;

            if(node.value != null)
            {
                if(!list.contains(listNode.data))
                      list.add(listNode.data);
            }

            if(node.left != null)
            {
                if(node.value != null)
                    queue.add(node.left);

                if(!list.contains(listNode.data))
                    {
                        list.add(listNode.data);

                    }

            }

            if(node.right != null) {
                if(node.value != null)
                    queue.add(node.right);
                if(!list.contains(listNode.data))
                    {
                        list.add(listNode.data);
                    }
            }




        }
        Collections.sort(list);
        LinkedList<ListNode> listNodes = new LinkedList<>();
        for (Integer integer : list) {

            ListNode test = new ListNode(integer);
            listNodes.add(test);
        }

        return addValue(listNodes);

    }

    public static ListNode addValue( LinkedList<ListNode> node){

        if(node.size() == 0 ) return null;
        ListNode l =  node.pollFirst();
        l.next = addValue(node);
        return l;
    }
    public static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public ListNode value;

        TreeNode(ListNode value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        TreeNode(ListNode value) {
            this(value, null, null);
        }
    }

    public static class ListNode {
        public int data;
        public ListNode next;

        ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }

        ListNode(int data) {
            this(data, null);
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
}
