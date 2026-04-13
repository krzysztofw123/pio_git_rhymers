package edu.kis.vh.nursery;

/**
 * Klasa bazowa realizująca podstawową logikę wyliczanki.
 */
public class DefaultCountingOutRhymer {

    public static final int INT = 12;
    public static final int ERRR = -1;
    private final int[] NUMBERS = new int[INT];

    private int total = -1;

    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    protected boolean callCheck() {
        return total == -1;
    }

    protected boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERRR;
        return NUMBERS[total];
    }

    protected int countOut() {
        if (callCheck())
            return ERRR;
        return NUMBERS[total--];
    }

    public int getTotal() {
        return total;
    }

}
