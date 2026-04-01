/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        dfs(root, new ArrayList<>(), ans);
        return ans;
    }

    private static void dfs(Node root, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans) {
        if(root == null) return;

        arr.add(root.data);

        if(root.left == null && root.right == null){
            ans.add(new ArrayList<>(arr));
        } else {
            dfs(root.left, arr, ans);
            dfs(root.right, arr, ans);
        }

        arr.remove(arr.size() - 1);
    }
}