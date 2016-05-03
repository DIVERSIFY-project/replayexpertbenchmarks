package oracle;

import oraclebugs.PatternMatcher8151481;
import org.junit.Test;

import java.util.regex.Matcher;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by marodrig on 11/04/2016.
 */
public class PatternContextTest {

    @Test
    public void testDoMatching() throws Exception {
        PatternMatcher8151481 context = new PatternMatcher8151481();
        String data[][] = {
                {"a+a+", "aaaaaaaaaaaaaaaaaaaaaaa"},
                {"a+a+", "aaaaaaaaaaaaaaaaaaaaaab"},
                {"[a-zABCDEFGHIJKLMN]", "A"},
                {"[a-zABCDEFGHIJKLMN]", "Z"},
                {"\\p{javaLetter}", "aaaaaaaaaaaaaaaaaaaaaaa"},
                {"\\p{javaLetter}", "aaaaaaaaaaaaaaaaaaaaaaa-"},
        };
        Matcher m = null;
        for (int n = 0; n < 5; n++) {
            context.doMatching(n, data);
        }
    }
}