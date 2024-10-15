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
 int index1=0;
List<Integer> result=new ArrayList<>();

public List<Integer> getAllElements(TreeNode bst1,TreeNode bst2) {
    List<Integer> list1=new ArrayList<>();
    inOrder(bst1,list1);
    int size1=list1.size();
    mergeLists(bst2,list1,size1);
    while(index1<size1) {
        result.add(list1.get(index1));
        index1++;
    }
    return result;
}

private void inOrder(TreeNode bst1,List<Integer> list1) {
    if(bst1==null)
        return;
    inOrder(bst1.left,list1);
    list1.add(bst1.val);
    inOrder(bst1.right,list1);
}

private void mergeLists(TreeNode bst2,List<Integer> list1,int size1) {
    if(bst2==null)
        return;
    mergeLists(bst2.left,list1,size1);
    while(index1<size1&&list1.get(index1)<bst2.val) {
        result.add(list1.get(index1));
        index1++;
    }
    result.add(bst2.val);
    mergeLists(bst2.right,list1,size1);
}


}