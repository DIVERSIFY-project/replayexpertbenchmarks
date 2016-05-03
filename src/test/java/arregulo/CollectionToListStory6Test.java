package arregulo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by marodrig on 11/04/2016.
 */
public class CollectionToListStory6Test {

    @Test
    public void new_ArrayList_from_Collection() throws Exception {
        String collection;
        Collection<Integer> data;

        data = new ArrayList<Integer>();
        for (int i = 0; i < 10_000; i++) {
            data.add(i);
        }

        CollectionToListStory6 story6 = new CollectionToListStory6();
        story6.data = data;

        ArrayList<Integer> l1 = story6.new_ArrayList_from_Collection();
        ArrayList<Integer> l2 = story6.new_ArrayList_add();
        ArrayList<Integer> l3 = story6.new_ArrayList_addAll();

        assertEquals(l1.size(), l2.size());
        assertEquals(l1.size(), l3.size());
    }
}