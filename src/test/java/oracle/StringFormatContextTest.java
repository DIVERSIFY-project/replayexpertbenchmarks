package oracle;

import oraclebugs.StringFormat8050142;
import org.junit.Test;

/**
 * Created by marodrig on 10/04/2016.
 */
public class StringFormatContextTest {

    @Test
    public void testJustTryThemAll() throws Exception {
        StringFormat8050142 context = new StringFormat8050142();

        Integer integer = 1;
        context.justTryThemAll(integer);

        Short shor = 1;
        context.justTryThemAll(shor);

        Double d = Math.PI;
        context.justTryThemAll(d);

        Float f = (float) Math.PI;
        context.justTryThemAll(f);

        Integer L = -8;
        context.justTryThemAll(L);

        String str = "Yeah";
        context.justTryThemAll(str);
    }
}