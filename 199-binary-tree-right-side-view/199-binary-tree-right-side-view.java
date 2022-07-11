class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<Integer>();
        
        ArrayDeque<TreeNode> nextLevel = new ArrayDeque() {{ offer(root); }};
        ArrayDeque<TreeNode> currLevel = new ArrayDeque();        
        List<Integer> rightside = new ArrayList();
        
        TreeNode node = null;
        while (!nextLevel.isEmpty()) {
            
            currLevel = nextLevel.clone();
            nextLevel.clear();

            while (! currLevel.isEmpty()) {
                node = currLevel.poll();

                
                if (node.left != null) 
                    nextLevel.offer(node.left);    
                if (node.right != null) 
                    nextLevel.offer(node.right);
            }
            
            
            if (currLevel.isEmpty()) 
                rightside.add(node.val);    
        }
        return rightside;
    }
}