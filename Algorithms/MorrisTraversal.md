# Morris Traversal

- Space : O(1)
- No recursion
- 遍历过程中，改变其形状

```Java
/**
Inorder Traverse

1. 如果`cur`的左孩子为`null`，则输出`cur`，然后将其右孩子作为`cur`。
2. 如果`cur`的左孩子不为`null`，则在`cur`的左子树中，找到中序遍历下的`pre`:
	1). 如果`pre`的右孩子为`null`，则将它的右孩子设置为`cur`。然后`cur = cur.left`。
	2). 如果`pre`的右孩子为`cur`，将它的右孩子设置为`null`（恢复树的形状）。输出`cur`。然后`cur = cur.right`。
3. 重复以上1. 2. 操作直到`cur`为`null`

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

```Java
/**
Preorder Traverse

1. 如果`cur`的左孩子为`null`，则输出`cur`，然后将其右孩子作为`cur`。
2. 如果`cur`的左孩子不为`null`，则在`cur`的左子树中，找到中序遍历下的`pre`:
	1). 如果`pre`的右孩子为`null`，则将它的右孩子设置为`cur`。输出`cur`。然后`cur = cur.left`。
	2). 如果`pre`的右孩子为`cur`，将它的右孩子设置为`null`（恢复树的形状）。然后`cur = cur.right`。
3. 重复以上1. 2. 操作直到`cur`为`null`

*/

public void preorderMorrisTraversal(TreeNode root) {
	if (root == null) {
		return;
	}
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
				System.out.print(cur.val);
				pre.right = cur;
				cur = cur.left;
			} else {
				pre.right = null;
				cur = cur.right;
			}
		}
	}
}
```

```Java
/**
Postorder Traverse


*/
public void postorderMorrisTraversal(TreeNode root) {
	if (root == null) {
		return;
	}
	TreeNode dummy = new TreeNode(0);
	dummy.left = root;
	TreeNode cur = dummy;
	TreeNode pre = null;
	while (cur != null) {
		if (cur.left = null) {
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
				reversePrint(cur.left, pre);
				pre.right = null;
				cur = cur.right;
			}
		}
	} 
}
public void reversePrint(TreeNode from, TreeNode to) {
	reverse(from, to);
	TreeNode p = to;
	while (true) {
		System.out.print(p.val);
		if (p == from) {
			break;
		}
		p = p.right;
	}
	reverse(to, from);
}
public void reverse(TreeNode from, TreeNode to) {
	if (from == to) {
		return;
	}
	TreeNode x = from;
	TreeNode y = to;
	TreeNode z;
	while (true) {
		z = y.right;
		y.right = x;
		x = y;
		y = z;
		if (x == to) {
			break;
		}
	}
}

```