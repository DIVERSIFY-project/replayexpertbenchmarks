package oraclebugs;

import java.math.BigInteger;

/**
 * Created by marodrig on 10/04/2016.
 */
public class BigIntegerConstantt8152910 {

    public BigInteger someBigIntegerOps(BigInteger a) {

        if ( a.bitCount() == 0 )
            /** @bench-this */
            return BigInteger.ONE;
        else if ( a.bitCount() == 1 )
            /** @bench-this */
            return BigInteger.valueOf(1);
        else
            /** @bench-this */
            return BigInteger.valueOf(2);
    }

}
