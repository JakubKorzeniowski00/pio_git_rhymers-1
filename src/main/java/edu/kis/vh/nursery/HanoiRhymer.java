package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int REJECTED_INIT_VALUE = 0;
    int totalRejected = REJECTED_INIT_VALUE;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
//5, 11-16 byly zle sformatowane
// ctrl i strzalki przelaczaja miedzy plikami