package arregulo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by marodrig on 11/04/2016.
 */
public class CollectionToListStory6 {


    public Collection<Integer> data;

    public ArrayList<Integer> new_ArrayList_from_Collection() {
        /** @bench-this */
        return new ArrayList<>(data);
    }

    public ArrayList<Integer> new_ArrayList_addAll() {
        /** @bech-this */
        ArrayList<Integer> result;
        {
            result = new ArrayList<>(data.size());
            result.addAll(data);
        }
        return result;

    }

    public ArrayList<Integer> new_ArrayList_add() {
        ArrayList<Integer> result;
        /** @bench-this */
        {
            result = new ArrayList<>(data.size());
            for (Integer o : data) {
                result.add(o);
            }
        }
        return result;
    }

}
