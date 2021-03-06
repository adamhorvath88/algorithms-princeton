package edu.princeton.cs.algorithms;

/**
 *
 * @author Adam
 */
public class AbstractUF {

    protected final int[] id;

    public AbstractUF(int N) {
        id = new int[N];
        for (int i = 0; i != N; ++i) {
            id[i] = i;
        }
    }
}
