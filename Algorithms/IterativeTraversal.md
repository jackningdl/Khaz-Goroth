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


```Java 

/**
Method 1: check the relation between current node and previous node
          to determine which direction should go next
*/

public class Solution {
	public List<Integer> postOrder(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		Deque<TreeNode> dq = new LinkedList<>();
		dq.offerFirst(root);
		TreeNode prev = null;
		while (!dq.isEmpty()) {
			TreeNode cur = dq.peekFirst();
			if (prev == null || cur == prev.left || cur == prev.right) {
				if (cur.left != null) {
					dq.offerFirst(cur.left);
				} else if (cur.right != null) {
					dq.offerFirst(cur.right);
				} else {
					dq.pollFirst();
					res.add(cur.key);
				}
			} else if (prev == cur.right || prev == cur.left && cur.right == null) {
				dq.pollFirst();
				res.add(cur.key);
			} else {
				dq.offerFirst(cur.right);
			}
			prev = cur;
		}
		return res;
	}
}

/**
Method 2: PostOrder is the reverse order of pre-order with traversing
		  right subtree before traversing left subtree
*/

public class Solution {
	public List<Integer> postOrder(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		Deque<TreeNode> dq = new LinkedList<>();
		dq.offerFirst(root);
		while (!dq.isEmpty) {
			TreeNode cur = dq.poll();
			res.add(cur.val);
			if (cur.left != null) {
				dq.offerFirst(cur.left);
			}
			if (cur.right != null) {
				dq.offerFirst(cur.right);
			}
		}
		Collections.reverse(res);
		return res;
	}
}

```