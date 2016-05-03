package arregulo;

import java.util.concurrent.ConcurrentHashMap;
import water.nbhm.NonBlockingHashMapLong;

/**
 * Created by marodrig on 11/04/2016.
 */
public class LongKeyMapStory2 {

    public Double getConcurrentHashMap( long key, ConcurrentHashMap<Long, Double> chm ) {
        /** @bench-this */
        return chm.get(key);
    }

    public Double getNonBlockingHashMapLong(long key, NonBlockingHashMapLong<Double> nbhm) {
        /** @bench-this */
        return nbhm.get(key);
    }

}
