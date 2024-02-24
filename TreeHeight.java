class TreeNode {
    int data;
    TreeNode leftNode, rightNode;

    TreeNode(int val) {
        this.data = val;
        leftNode = rightNode = null;
    }
}

public class TreeHeight {
    public static int getTreeHeight(TreeNode root) {
        if (root == null)
            return 0;

        int leftNodeHeight = getTreeHeight(root.leftNode);
        int rightNodeHeight = getTreeHeight(root.rightNode);

        return Math.max(leftNodeHeight, rightNodeHeight) + 1;
    }

    public static void printTreeNode(TreeNode root) {
        int h = getTreeHeight(root);
        for(int i=1; i<=h; i++)
            printTreeLevelNode(root, i);
    }

    public static void printTreeLevelNode(TreeNode rooNode, int level) {
        if(rooNode == null) 
            return;
        
        if(level == 1)
            System.out.print(rooNode.data + " ");
        
        else {
            printTreeLevelNode(rooNode.leftNode, level - 1);
            printTreeLevelNode(rooNode.rightNode, level - 1);
        }

    }
    
    public static void main(String[] args) {
        TreeNode tNode = new TreeNode(1);

        tNode.leftNode = new TreeNode(2);
        tNode.rightNode = new TreeNode(3);
        tNode.leftNode.leftNode = new TreeNode(4);
        tNode.leftNode.rightNode = new TreeNode(5);
        tNode.rightNode.leftNode = new TreeNode(6);
        tNode.rightNode.leftNode.leftNode = new TreeNode(7);

        System.out.println(getTreeHeight(tNode) - 1);

        System.out.println();

        printTreeNode(tNode);
    }
}
