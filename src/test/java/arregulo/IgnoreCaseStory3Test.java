package arregulo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by marodrig on 11/04/2016.
 */
public class IgnoreCaseStory3Test {

    private String key;
    private Map<String, Integer> treeMap;
    private Map<String, Integer> hashMap;
    private Map<String, Integer> ignoreCaseMap;

    @Test
    public void story3Test() throws Exception {
        key = "GoodKey";
        treeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        hashMap = new HashMap<>();
        ignoreCaseMap = new HashMap<>();
        String[] data = getData();
        for (String d : data) {
            treeMap.put(d, d.length());
            hashMap.put(d.toLowerCase(), d.length());
            ignoreCaseMap.put(d, d.length());
            ignoreCaseMap.put(d.toLowerCase(), d.length());
        }

        IgnoreCaseStory3 story3 = new IgnoreCaseStory3();
        Integer i1 =story3.getTree((TreeMap<String, Integer>) treeMap, key);
        Integer i2 =story3.getHashToLower((HashMap<String, Integer>) hashMap, key);
        Integer i3 =story3.getIgnoreCaseMap((HashMap<String, Integer>) ignoreCaseMap, key);

        assertEquals(i1, i2);
        assertEquals(i1, i3);

    }

    private String[] getData() {
        return ("Microblogging and social networking sites that limit the number of characters in a message " +
                "(most famously Twitter, where the 140-character limit can be quite restrictive in languages that rely " +
                "on alphabets, including English) are potential outlets for medial capitals. Using CamelCase between " +
                "words reduces the number of spaces, GoodKey and thus the number of characters, in a given message, allowing " +
                "more content to fit into the limited space. Hashtags, especially long ones, often use CamelCase to " +
                "maintain readability (e.g. #CollegeStudentProblems is easier to read than #collegestudentproblems )."
                + "A collection of Concurrent and Highly Scalable Utilities. These are intended as direct replacements " +
                "for the java.util.* or java.util.concurrent.* collections but with better performance when many CPUs " +
                "are using the collection concurrently. baD_kEy")
                .split("\\s+");
    }
}