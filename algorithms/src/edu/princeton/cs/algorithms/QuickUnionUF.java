package edu.princeton.cs.algorithms;

/**
 * [Lazy approach].
 * @author ahorvath
 */
public class QuickUnionUF extends AbstractUF implements Components {

    public QuickUnionUF(int N) {
        super(N);
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    protected int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }
}
