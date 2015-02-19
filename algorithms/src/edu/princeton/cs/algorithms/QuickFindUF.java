package edu.princeton.cs.algorithms;

/**
 * [Eager approach].
 * @author ahorvath
 */
public class QuickFindUF extends AbstractUF implements Components {

    public QuickFindUF(int N) {
        super(N);
    }

    @Override
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    @Override
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; ++i) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}
