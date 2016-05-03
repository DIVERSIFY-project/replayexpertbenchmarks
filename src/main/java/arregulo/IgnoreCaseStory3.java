package arregulo;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by marodrig on 11/04/2016.
 */
public class IgnoreCaseStory3 {

    public Integer getHashToLower(HashMap<String, Integer> hash, String key) {
        /** @bench-this */
        return hash.get(key.toLowerCase());
    }

    public Integer getTree(TreeMap<String, Integer> tree, String key) {
        /** @bench-this */
        return tree.get(key);
    }

    public Integer getIgnoreCaseMap(HashMap<String, Integer> ignoreCaseMap, String key) {
        /** @bench-this */
        {
            Integer val = ignoreCaseMap.get(key);
            if (val == null) {
                val = ignoreCaseMap.get(key.toLowerCase());
                if (val != null) {
                    ignoreCaseMap.put(key, val);
                }
            }
            return val;
        }
    }
}
