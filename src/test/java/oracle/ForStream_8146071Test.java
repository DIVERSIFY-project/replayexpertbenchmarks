package oracle;

import oraclebugs.ForStream8146071;
import org.junit.Test;

import java.util.Random;

/**
 * Created by marodrig on 11/04/2016.
 */
public class ForStream_8146071Test {

    public void setUp() {
        randomInts();
    }

    static int[] randomInts() {
        int ints[] = new int[1000000];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++)
            ints[i] = random.nextInt();
        return ints;
    }

    @Test
    public void forTest_if() throws Exception {
        new ForStream8146071().forTest_if(randomInts());
    }

    @Test
    public void forTest_MathMax() throws Exception {
        new ForStream8146071().forTest_MathMax(randomInts());
    }
}