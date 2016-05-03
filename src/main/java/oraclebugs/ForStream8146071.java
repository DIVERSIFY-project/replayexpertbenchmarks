package oraclebugs;

/**
 * Created by marodrig on 11/04/2016.
 */
public class ForStream8146071 {

    public int forTest_if(int[] a) {
        int e = a.length;
        int m = Integer.MIN_VALUE;

        /** @bench-this */
        for (int i = 0; i < e; i++)
            if (a[i] >= m)
                m = a[i];

        return m;
    }

    public int forTest_MathMax( int[] a) {
        int e = a.length;
        int m = Integer.MIN_VALUE;

        /** @bench-this */
        for (int i = 0; i < e; i++)
            m = Math.max(m, a[i]);

        return m;
    }

}
