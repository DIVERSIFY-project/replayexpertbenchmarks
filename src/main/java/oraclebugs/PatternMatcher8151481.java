package oraclebugs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by marodrig on 11/04/2016.
 */
public class PatternMatcher8151481 {

    public boolean doMatching(int n, String data[][]) {
        String input = data[n][1];
        boolean result;
        /** @bench-this */
        {
            Matcher matcher = Pattern.compile(data[n][0]).matcher("");
            result = matcher.reset(input).matches();
        }
        return result;
    }


}
