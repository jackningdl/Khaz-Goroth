# Tree's Iterative Traversal

- Pre-order Traversal

```Java

public class Solution {
	public List<Integer> preOrder(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		Deque<TreeNode> dq = new LinkedList<>();
		dq.offerFirst(root);
		while (!dq.isEmpty) {
			TreeNode cur = dq.poll();
			res.add(cur.val);
			if (cur.right != null) {
				dq.offerFirst(cur.right);
			}
			if (cur.left != null) {
				dq.offerFirst(cur.left);
			}
		}
		return res;
	}
}

```

- In-order Traversal

```Java

public class Solution {
	public List<Integer> inOrder(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		Deque<TreeNode> dq = new LinkedList<>();
		while (root != null || !dq.isEmpty()) {
			if (root != null) {
				dq.offerFirst(root);
				root = root.left;
			} else {
				root = dq.pollFirst();
				res.add(root.key);
				root = root.right;
			}
		}
		return res;		
	}
}

```
- Post-order Traversal