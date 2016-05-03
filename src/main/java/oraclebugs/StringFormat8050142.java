package oraclebugs;

/**
 * Created by marodrig on 10/04/2016.
 */
public class StringFormat8050142 {

    public String justTryThemAll(Object a) {

        if (a instanceof Integer && ((Integer) a > 0)) {
            int value = (Integer) a;
            /** @bench-this */
            return String.format("%d", value);
        } else if (a instanceof Short) {
            int value = (Short) a;
            /** @bench-this */
            return String.format("%06x", value);
        } else if (a instanceof Double) {
            double pi = (Double) a;
            /** @bench-this */
            return String.format("%.4f", pi);
        } else if (a instanceof Float) {
            double pi = (Float) a;
            /** @bench-this */
            return String.format("%5.5e", pi);
        } else if (a instanceof String) {
            String str = (String) a;
            /** @bench-this */
            return String.format("%s", str);
        } else {
            int value = (Integer) a;
            /** @bench-this */
            return String.format("  %04x %05x %06x %05x", value, value, value, value);
        }
    }

}
