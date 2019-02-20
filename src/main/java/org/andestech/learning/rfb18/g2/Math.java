package org.andestech.learning.rfb18.g2;

public class Math {

    public static int summa(int ... numbers)
    {
        int s = 0;
        for (int n: numbers) s+=n;
        return s;
    }
}
