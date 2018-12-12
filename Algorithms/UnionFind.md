# Union Find

- To access the group of any elememt in O(1) amortized time
- The size of data range should be given to avoid OutOfBoundary error


```Java
/**
如果要 union 2 elements
我们首先确定这两个elements是否已经union在一个group了
如果有，就不需要union --> 或者可以说是多余的union

*/

class UnionFindSet {
	int[] parents;
	int[] rank;
	public UnionFindSet(int size) {
		parents = new int[size];
		for (int i = 0; i < size; i++) {
			parents[i] = i;
		}
		rank = new int[size];
	}
	public int find(int candidate) {
		if (parents[candidate] != candidate) {
			parents[candidate] = find(parents[candiate]);
		}
		return parents[candidate];
	}
	public void union(int x, int y) {
		int xAncestor = find(x);
		int yAncestor = find(y);
		if (xAncestor == yAncestor) {
			System.out.println("x and y already unioned!")
			return;
		} else if (rank[xAncestor] > rank[yAncestor]) {
			parents[yAncestor] = xAncestor;
		} else if (rank[xAncestor] < rank[yAncestor]) {
			parents[xAncestor] = yAncestor;
		} else {
			parents[xAncestor] = yAncestor;
			rank[yAncestor]++;
		}
	}
}
```
