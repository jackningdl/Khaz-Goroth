/*
 个人整理 帮助刷题 欢迎复制
 如果喜欢请点星star
*/

class TreeNode {
    public int key;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int key) {
        this.key = key;
    }
}

class ListNode {
    public int value;
    public ListNode next;
    public ListNode(int value) {
        this.value = value;
        next = null;
    }
}

class ExpNode {
    char symbol;
    ExpNode left;
    ExpNode right;
    ExpNode(char symbol) {
        this.symbol = symbol;
    }
}

class Interval {
    int start;
    int end;
    Interval(int s, int e) { 
        start = s; end = e; 
    }
}

class TrieNode {
    TrieNode[] next = new TrieNode[26];
    String word;
}

class Helper {
    public TreeNode buildTree(Integer[] array) {
        int i = 0;
        TreeNode root = new TreeNode(array[i++]);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (i < array.length) {
            TreeNode cur = q.poll();
            if (cur == null) {
                continue;
            }
            if (i < array.length && array[i] != null) {
                cur.left = new TreeNode(array[i++]);
            } else {
                cur.left = null;
                i++;
            }
            if (i < array.length && array[i] != null) {
                cur.right = new TreeNode(array[i++]);
            } else {
                cur.right = null;
                i++;
            }
            q.offer(cur.left);
            q.offer(cur.right);
        }
        return root;
    }

    public TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode p = root;
            for (char c : word.toCharArray()) {
                if (p.next[c - 'a'] == null) {
                    p.next[c - 'a'] = new TrieNode();
                }
                p = p.next[c - 'a']; //一边遍历一个linear序列，一边深度search进去一个node
            }
            p.word = word; // 最后一个node表示一个单词成立，否则null
        }
        return root;
    }

    public ListNode buildListNode(int[] array) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (int i = 0; i < array.length; i++) {
            cur.next = new ListNode(array[i]);
            cur = cur.next;
        }
        return dummy.next;
    }
}