/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   public List<Integer> getAllElements(TreeNode root1,TreeNode root2) {
    return merge(root1,root2);
}

public List<Integer> merge(TreeNode root1,TreeNode root2) {
    ArrayList<Integer> list1=new ArrayList<>();
    ArrayList<Integer> list2=new ArrayList<>();
    inOrderTraversal(root1,list1);
    inOrderTraversal(root2,list2);
    return mergeTwoList(list1,list2);
}

private List<Integer> mergeTwoList(List<Integer> list1,List<Integer> list2) {
    ArrayList<Integer> res=new ArrayList<>();
    int i=0,j=0;
    int n1=list1.size();
    int n2=list2.size();
    while(i<n1&&j<n2) {
        if(list1.get(i)<list2.get(j)) {
            res.add(list1.get(i++));
        } else if(list1.get(i)>list2.get(j)) {
            res.add(list2.get(j++));
        } else {
            res.add(list1.get(i++));
            res.add(list2.get(j++));
        }
    }
    while(i<n1)
        res.add(list1.get(i++));
    while(j<n2)
        res.add(list2.get(j++));
    return res;
}

private void inOrderTraversal(TreeNode root,ArrayList<Integer> list) {
    if(root==null)
        return;
    inOrderTraversal(root.left,list);
    list.add(root.val);
    inOrderTraversal(root.right,list);
}


}