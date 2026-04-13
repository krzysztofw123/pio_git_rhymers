package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT = 12;
    public static final int ERRR = -1;
    private final int[] NUMBERS = new int[INT];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERRR;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return ERRR;
        return NUMBERS[total--];
    }

}
