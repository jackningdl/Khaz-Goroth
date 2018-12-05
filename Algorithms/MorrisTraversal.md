# Morris Traversal

- Space : O(1)
- No recursion
- 遍历过程中，改变其形状

```Java
/**
Inorder Traverse
*/

public void inorderMorrisTraversal(TreeNode root) {
	TreeNode cur = root;
	TreeNode pre = null;
	while (cur != null) {
		if (cur.left == null) {
			System.out.print(cur.val);
			cur = cur.right;
		} else {
			pre = cur.left;
			while (pre.right != null && pre.right != cur) {
				pre = pre.right;
			}  
			if (pre.right == null) {
				pre.right = cur;
				cur = cur.left;
			} else {
				pre.right = null;
				System.out.print(cur.val);
				cur = cur.right;
			}
		}
	}
}
```
