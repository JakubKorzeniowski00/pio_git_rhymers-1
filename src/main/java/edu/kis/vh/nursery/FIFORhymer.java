package edu.kis.vh.nursery;

/**
 * Klasa FIFORhymer dziedziczy po klasie DefaultCountingOutRhymer
 * Override metody countOut oraz posiada jedno pole DefaultCountingOutRhymer
 */

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Metoda countOut usuwa pierwszy element w tablicy numbers
     * nastepnie go zwraca lub -1 jesli tablica jest pusta
     */

    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
