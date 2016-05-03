package arregulo;

import org.junit.Test;
import water.nbhm.NonBlockingHashMapLong;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by marodrig on 11/04/2016.
 */
public class LongKeyMapStory2Test {

    private long key;

    private void populate(Map<Long, Double> map, long[] data) {
        for (long key : data) {
            map.put(key, Double.longBitsToDouble(key));
        }
        if (map.size() != data.length) {
            throw new AssertionError();
        }
    }

    private long[] generate(int size) {
        Random r = new Random(-7890);
        long[] result = new long[size];
        for (int i = 0; i < size; i++) {
            result[i] = Math.abs(r.nextLong());
        }
        return result;
    }

    @Test
    public void runBothMaps() throws Exception {
        long[] data = generate(50_000);
        ConcurrentHashMap<Long, Double> chm = new ConcurrentHashMap<>();
        NonBlockingHashMapLong<Double> nbhm = new NonBlockingHashMapLong<>();
        populate(chm, data);
        populate(nbhm, data);
        key = 6528321900546851391L;
        Double d1 = new LongKeyMapStory2().getConcurrentHashMap(key, chm);
        Double d2 = new LongKeyMapStory2().getNonBlockingHashMapLong(key, nbhm);
        assertEquals(d1, d2);
    }

}