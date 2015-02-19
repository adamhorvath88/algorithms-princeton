package edu.princeton.cs.algorithms;

/**
 * .
 * @author ahorvath
 */
public class WeightedQuickUnionUF extends QuickUnionUF {

    private final int[] sz;

    public WeightedQuickUnionUF(int N) {
        super(N);
        sz = new int[N];
    }

    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) {
            return;
        }
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }
}
